package recipe.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import recipe.dao.RecipeCategoryKindDao;
import recipe.dao.RecipeDao;
import recipe.dao.RecipeIngredientDao;
import recipe.dao.RecipeStepDao;
import recipe.dto.RecipeCategoryKindDto;
import recipe.dto.RecipeDto;
import recipe.dto.RecipeIngredientDto;
import recipe.dto.RecipeStepDto;
import recipe.dto.SessionDto;
import recipe.utility.Alert;

@MultipartConfig(maxFileSize = 1024 * 1024 * 50)

@WebServlet("/project/recipeWrite.do")
public class RecipeWriteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RecipeCategoryKindDao rckDao= new RecipeCategoryKindDao();
		Map<String, Object> map = new HashMap<>();
		List<RecipeCategoryKindDto> cate1 = new ArrayList<>();
		List<RecipeCategoryKindDto> cate2 = new ArrayList<>();
		cate1 = rckDao.cateList("방법별");
		cate2 = rckDao.cateList("재료별");
		rckDao.close();
		map.put("cate1", cate1);
		map.put("cate2", cate2);
		
		req.setAttribute("map", map);
		req.getRequestDispatcher("/RecipeProject/RecipeWrite.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		SessionDto user = (SessionDto) session.getAttribute("user");
		String user_idx = user.getUser_idx();
//		String user_idx = req.getParameter("user_idx");
//		String user_idx = (String) session.getAttribute("user_idx");
		String recipe_name = req.getParameter("recipe_name");
		String recipe_desc = req.getParameter("recipe_desc");
		String recipe_amount_portion = req.getParameter("recipe_amount");
		String recipe_cooking_time = req.getParameter("recipe_cooking_time");
		String recipe_difficulty = req.getParameter("recipe_difficulty");
		RecipeDto recipeDto = new RecipeDto();
		recipeDto.setUser_idx(user_idx);
		recipeDto.setRecipe_name(recipe_name);
		recipeDto.setRecipe_desc(recipe_desc);
		recipeDto.setRecipe_people(recipe_amount_portion);
		recipeDto.setRecipe_time(recipe_cooking_time);
		recipeDto.setRecipe_difficulty(recipe_difficulty);
		
		
		//파일입력부분
		String fileName = req.getPart("mainPhotoUpload").getSubmittedFileName();
		if(fileName.trim().length()==0||req.getPart("mainPhotoUpload") == null) {
			Alert.alertBack(resp, "파일 입력 필요");
		}
		String mainext = fileName.substring(fileName.lastIndexOf("."));
		//파일 이름 같은계정 같은제목 같은 파일이름을 올릴시 비교할 수 잇는 예외 추가 필요
		String mainFileName = user_idx + "_" + recipe_name + "_mainPhoto" + mainext;
		String path = req.getServletContext().getRealPath("/Storage");
		System.out.println(path);
//		mainFileName = path+"\\" + mainFileName;
		InputStream is = req.getPart("mainPhotoUpload").getInputStream();
		FileOutputStream os = new FileOutputStream(path + "\\" + mainFileName);
		
		byte[] buffer = new byte[1024];
		while (is.read(buffer) > 0) {
			os.write(buffer);
		}
		is.close();
		os.close();
		
		
		String cate1 = req.getParameter("cate1");
		String cate2 = req.getParameter("cate2");
		recipeDto.setCate1(cate1);
		recipeDto.setCate2(cate2);
		
		
		System.out.println("파일생성완료");
		//db입력
		recipeDto.setRecipe_image_url(mainFileName);
		RecipeDao recipeDao = new RecipeDao();
		
		
		
//		recipeDao.insertRecipe(recipeDto);
		
		RecipeIngredientDto recipeIngredientDto = new RecipeIngredientDto();
//		IngredientDao ingredientDao = new IngredientDao();  머하는부분인지 모르겠음
//		ingredientDao.close();
		System.out.println("인서트 후 ");

		// DB 입력후 recipe_id 받아오기 위해 쓰레드 sleep 처리
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			System.out.println("Thread error");
		}
		
		
		//요리과정 비어있는지 확인
		java.util.Collection<javax.servlet.http.Part> parts = req.getParts();
		boolean hasFile = false;
		if (parts != null && !parts.isEmpty()) {
//			System.out.println("파일 비어있는지 확인용 시작------------------------");
		    for (javax.servlet.http.Part part : parts) {
		        if (part.getName().equals("fileUpload") && part.getSize() > 0) {
		        	System.out.println(part.getName().equals("fileUpload"));
		            hasFile = true;
		            break;
		        }
		    }
//		    System.out.println("파일 비어있는지 확인 끝------------------------");
		}
		
		if (!hasFile) {
			recipeDao.close();
		    Alert.alertBack(resp, "요리 과정 사진을 입력하셔야 합니다.");
		    System.out.println("요리과정 비어있음 체크완료");
		    return;
		}

		//재료부분
		recipeDao.insertRecipe(recipeDto);
		String recipe_id = recipeDao.getLastRecipeId();
		recipeDao.close();
		
		RecipeIngredientDao recipeIngredientDao = new RecipeIngredientDao();
		String[] recipe_ingre_name = req.getParameterValues("ingredient_name[]");
		String[] ingredient_amount = req.getParameterValues("ingredient_amount[]");
		for (int i = 0; i < recipe_ingre_name.length; i++) {
			if (!recipe_ingre_name[i].equals("")) {
				recipeIngredientDto.setRecipe_id(recipe_id);
				recipeIngredientDto.setIngredient_amount(ingredient_amount[i]);
				recipeIngredientDto.setIngredient_name(recipe_ingre_name[i]);
				recipeIngredientDao.insertIngredient(recipeIngredientDto);
			}
		}
		
		recipeIngredientDao.close();
		System.out.println("---------------------------재료 끝---------------------------------");
		
		//요리과정부분
		RecipeStepDto stepDto = new RecipeStepDto();
		RecipeStepDao stepDao = new RecipeStepDao();
		
		String[] stepDesc = req.getParameterValues("step_text[]");
		for(String s :stepDesc) {
			System.out.println(s);
		}
		
		System.out.println("------------요리과정 파라미터 출력완-----------------");
		
		int imageIndex = 1;
		int stepIndex = 0;
//		java.util.Collection<javax.servlet.http.Part> parts = req.getParts();
//		boolean hasFile = false;
//		if (parts != null && !parts.isEmpty()) {
////			System.out.println("파일 비어있는지 확인용 시작------------------------");
//		    for (javax.servlet.http.Part part : parts) {
//		        if (part.getName().equals("fileUpload") && part.getSize() > 0) {
//		        	System.out.println(part.getName().equals("fileUpload"));
//		            hasFile = true;
//		            break;
//		        }
//		    }
////		    System.out.println("파일 비어있는지 확인 끝------------------------");
//		    
//		}
		System.out.println(hasFile);
		
		
		
//		if (parts == null || parts.isEmpty()) {
		
		if (!hasFile) {
		    Alert.alertBack(resp, "요리 과정 사진을 입력하셔야 합니다.");
		    System.out.println("안내메시지부분 지남");
		    stepDao.close();
		} else {
			System.out.println("과정부분 넣기 진입");
			for (javax.servlet.http.Part file : parts) {
//				System.out.println(file.getName());
				if (!file.getName().equals("fileUpload")) {
					continue;
				}else {
//					System.out.println("파일 처리 반복부분");
//					System.out.println(file);
					String originName = file.getSubmittedFileName();
					String ext = originName.substring(originName.lastIndexOf("."));
					String newFileName = recipe_id + "_" + imageIndex + ext;

					
					InputStream fis = file.getInputStream();
					String realPath = req.getServletContext().getRealPath("/Storage");
					String filePath = realPath + File.separator + newFileName;
					FileOutputStream fos = new FileOutputStream(filePath);
					stepDto.setRecipe_id(recipe_id);
					stepDto.setStep_desc(stepDesc[stepIndex]);
					stepDto.setStep_image_url(newFileName);
					stepDao.insertSteps(stepDto);
					stepIndex++;
					imageIndex++;
					byte[] buf = new byte[1024];
					int size = 0;
					while ((size = fis.read(buf)) != -1) {
						fos.write(buf, 0, size);
					}
					fis.close();
					fos.close();					
				}
			}
			resp.sendRedirect("../project/recipeList.do");
		}
		stepDao.close();
		
	}
}
