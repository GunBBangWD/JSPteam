package recipe.dto;


import java.sql.Timestamp;

public class RecipeReviewDto {
	private String review_id;
	private String recipe_id;
	private String user_idx;
	private String user_nickname;
	private int review_rating;
	private String review_content;
	private Timestamp review_date;
	public String getReview_id() {
		return review_id;
	}
	public void setReview_id(String review_id) {
		this.review_id = review_id;
	}
	public String getRecipe_id() {
		return recipe_id;
	}
	public void setRecipe_id(String recipe_id) {
		this.recipe_id = recipe_id;
	}
	public String getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(String user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public int getReview_rating() {
		return review_rating;
	}
	public void setReview_rating(int review_rating) {
		this.review_rating = review_rating;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public Timestamp getReview_date() {
		return review_date;
	}
	public void setReview_date(Timestamp review_date) {
		this.review_date = review_date;
	}
	@Override
	public String toString() {
		return "RecipeReviewDto [review_id=" + review_id + ", recipe_id=" + recipe_id + ", user_idx=" + user_idx
				+ ", user_nickname=" + user_nickname + ", review_rating=" + review_rating + ", review_content="
				+ review_content + ", review_date=" + review_date + "]";
	}
	
	
	
	

	
	
}
