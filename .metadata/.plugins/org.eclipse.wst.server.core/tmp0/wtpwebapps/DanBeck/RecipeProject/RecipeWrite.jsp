<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ page
    import="java.io.*,java.util.*,org.apache.commons.fileupload.*,org.apache.commons.fileupload.disk.*,org.apache.commons.fileupload.servlet.*"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

      <!DOCTYPE html>
      <html>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

      <head>
        <title>삽입술</title>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="../projectResources/javascript/Insert.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="styleSheet" href="../projectResources/css/RecipeInsert.css">
        <script>
        
        </script>
      </head>

      <body>
        <jsp:include page="../projectResources/Header.jsp" flush="false" />
        <c:if test="${sessionScope.user==null }">
          <script type="text/javascript">
            alert('글쓰기는 로그인을 해야합니다.');
            location.href = '../project/loginCheck.do'; 
          </script>
        </c:if>
        <div class="insert_form">
          <form action="../project/recipeWrite.do" method="post" onsubmit="return validateForm(this)"
            enctype="multipart/form-data">
            <input name="user_idx" type="hidden" value="${sessionScope.user.user_idx}" />
            
            <div class="insert_form_title">
              <b>레시피 등록</b>
            </div>
            <div class="insert_summary">
              <div class="summary_title">
                레시피 제목 <input type="text" style="width: 610px;" placeholder="예 ) 소고기 미역국 끓이기" name="recipe_name">
              </div>
              <div class="summary_describe">
                요리 소개 <textarea name="recipe_desc" style="height: 100px; width: 610px; resize: none;"
                  placeholder="이 레시피의 탄생배경을 적어주세요. 예) 남편의 생일을 맞아 소고기 미역국을 끓여봤어요. 어머니로부터 배운 미역국 레시피를 남편의 입맛에 맞게 고안했습니다."></textarea>
              </div>
              <div>
                <img id="mainPhotoHolder" onclick="browseMainFile()" src="../projectResources/img/camera.jpg"
                  style="width: 250px; height: 250px; cursor:pointer">
                <input type="file" name="mainPhotoUpload" class="mainPhotoUpload" id="mainPhotoUpload"
                  style="display: none;">
              </div>
             <div class="summary_category">
				<b>카테고리</b> 
				<select name="cate1" id="select_category_1">
					<optgroup>
						<option>종류별</option>
						<c:forEach var="cate1" items="${map.cate1}">
						<option value="${cate1.category_kind_idx}">${cate1.category_kind_name}
						</option>
						</c:forEach>
					</optgroup>
				</select> 
				<select name="cate2" id="select_category_2">
					<optgroup>
						<option>상황별</option>
						<c:forEach var="cate2" items="${map.cate2}">
						<option value="${cate2.category_kind_idx }">${cate2.category_kind_name}
						</option>
						</c:forEach>
					</optgroup>
				</select> 
			</div>
              <br>
              <div class="summary_recipe_info">
                <p>
                  <b>요리정보</b>
                </p>
                요리양 <select name="recipe_amount" id="select_info_1">
                  <optgroup label="몇인분기준">
                    <option value="1인분" selected="selected">1인분</option>
                    <option value="2인분">2인분</option>
                    <option value="3인분">3인분</option>
                    <option value="4인분">4인분</option>
                    <option value="5인분">5인분</option>
                    <option value="6인분">6인분 이상</option>
                  </optgroup>
                </select> 요리시간 <select name="recipe_cooking_time" id="select_info_2">
                  <optgroup label="시간">
                    <option>시간</option>
                    <option value="5분 이내" selected="selected">5분 이내</option>
                    <option value="10분 이내">10분 이내</option>
                    <option value="15분 이내">15분 이내</option>
                    <option value="20분 이내">20분 이내</option>
                    <option value="30분 이내">30분 이내</option>
                    <option value="60분 이내">60분 이내</option>
                    <option value="90분 이내">90분 이내</option>
                    <option value="2시간 이내">2시간 이내</option>
                    <option value="2시간 이상">2시간 이상</option>
                  </optgroup>
                </select> 요리난이도 <select name="recipe_difficulty" id="select_info_3">
                  <optgroup label="난이도">
                    <option>난이도</option>
                    <option value="아무나" selected="selected">아무나</option>
                    <option value="초급">초급</option>
                    <option value="중급">중급</option>
                    <option value="고급">고급</option>
                    <option value="신의 경지">신의 경지</option>

                  </optgroup>
                </select>
              </div>
            </div>
            <br>
            <br>
            <br>
            <div class="insert_ingredients">
              <span style="width: 100%;">재료가 남거나 부족하지 않도록 정확한 계량정보를 적어주세요.</span>
              <div class="ingredient_group_div">
                <li style="list-style-type: none;">
                  <!-- <p>
						<input type="text" name="ingredient_group_title_1" value="재료"
							style="font-weight: bold; font-size: 18px; width: 210px;"/>
					</p> -->
                  <ul id="ingredient_group_list">
                    <li class="ingreTextList" id="ingredient_text_list1">
                      <input name="ingredient_name[]" type="text" class="ingreInput" placeholder="예)돼지고기"></input>
                      <input name="ingredient_amount[]" type="text" class="ingreInput" placeholder="예)300g"></input>
                      <img id="ingredient_text_list1_delBtn" class="ingreDelBtn"
                        src="../projectResources/img/x-mark.png">
                    </li>
                    <li class="ingreTextList" id="ingredient_text_list2">
                      <input name="ingredient_name[]" type="text" class="ingreInput" placeholder="예)양배추"></input>
                      <input name="ingredient_amount[]" type="text" class="ingreInput" placeholder="예)1/2개"></input>
                      <img id="ingredient_text_list2_delBtn" class="ingreDelBtn"
                        src="../projectResources/img/x-mark.png">
                    </li>
                    <li class="ingreTextList" id="ingredient_text_list3">
                      <input name="ingredient_name[]" type="text" class="ingreInput" placeholder="예)참기름"></input>
                      <input name="ingredient_amount[]" type="text" class="ingreInput" placeholder="예)1T"></input>
                      <img id="ingredient_text_list3_delBtn" class="ingreDelBtn"
                        src="../projectResources/img/x-mark.png">
                    </li>
                    <li class="ingreTextList" id="ingredient_text_list4">
                      <input name="ingredient_name[]" type="text" class="ingreInput" placeholder="예)소금"></input>
                      <input name="ingredient_amount[]" type="text" class="ingreInput" placeholder="예)1/4T"></input>
                      <img id="ingredient_text_list4_delBtn" class="ingreDelBtn"
                        src="../projectResources/img/x-mark.png">
                    </li>
                  </ul>
                  <div style="padding-left:12%">
                    <button type="button" id="addIngredientGroup" class="btn btn-outline-success">추가</button>
                  </div>
                </li>
              </div>
            </div>
            <div class="add_ingredient_group">
              <span>※ 양념, 양념장, 소스, 드레싱, 토핑, 시럽, 육수 밑간 등으로 구분해서 작성해주세요.</span><br>

            </div>
            <br><br>


            <div class="recipe_step_form">
              <div class="recipe_step_title">
                <p class="cont_tit3" style="font-weight: bold">
                  요리순서
                </p>
              </div>
              <div class="recipe_step_guide">
                <span class="guide mag_b_15"><b>요리의 맛이 좌우될 수 있는 중요한 부분은 빠짐없이 적어주세요.</b><br>
                  예) 10분간 익혀주세요 ▷ 10분간 약한불로 익혀주세요.<br>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;마늘편은 익혀주세요 ▷ 마늘편을 충분히 익혀주셔야 매운 맛이 사라집니다.<br>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;꿀을 조금 넣어주세요 ▷ 꿀이 없는 경우, 설탕 1스푼으로 대체 가능합니다.
                </span>
              </div>
              <div class="recipe_step_detail">
                <br>
                <div class="row step_row">
                  <div class="step_div" id="step_div1">
                    <p class="step_p">🔻</p>
                    <div id="step_div_text1">
                      <textarea name="step_text[]" class="form-control step_cont"
                        placeholder="예) 소고기는 기름기를 떼어내고 적당한 크기로 썰어주세요."></textarea>
                    </div>
                    <div id="step_div_photo1">
                      <img name="step_img_photo[]" id="step_img_photo1" class="stepDivPhoto"
                        src="../projectResources/img/imageAdd.png">

                      <input type="file" name="fileUpload" class="fileUpload" id="fileUpload1" style="display: none;"
                        multiple="multiple">
                    </div>

                    <img id="step_div_text1_delBtn" class="stepDelBtn" src="../projectResources/img/file-x.svg">
                    <br>
                  </div>
                </div>
                <div style="padding-left: 15%">
                  <button type="button" class="btn btn-outline-primary" id="addStepDetailGroup"
                    style="border: 1px solid grey">순서 추가</button>
                </div>
              </div>
              <br>
              <br>
            </div>
            <!-- <div class="recipe_step_donePhotos">
				<p style="font-weight: bold; font-size: 15px">요리 완성 사진</p>
				<img src="../projectResources/img/imageAdd.png" id="stepPhotoHolder_1" onclick="uploadFile()" src="" width="120" height="120" style="cursor:pointer">
				
			</div> -->
            <div class="recipe_tips">
              <p>요리팁</p>
            </div>

            <button type="submit">저장</button>
            <button type="reset">초기화</button>
            <button type="button" onclick="">취소</button>
          </form>
        </div>



      </body>

      </html>