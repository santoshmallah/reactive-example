package com.main.reactive_example.model;

public class ReactiveServiceRequest {
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ReactiveServiceRequest [userId=" + userId + "]";
	}

}
