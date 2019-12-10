package com.fishinwater.situp.beans;

public class LikeBean {
	
	private String like_id;
	
	private String user_id;
	
	private String post_id;

	public LikeBean() {
		super();
	}

	public String getLike_id() {
		return like_id;
	}

	public void setLike_id(String like_id) {
		this.like_id = like_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

	@Override
	public String toString() {
		return "LikeBean [like_id=" + like_id + ", user_id=" + user_id + ", post_id=" + post_id + "]";
	}
	
	

}
