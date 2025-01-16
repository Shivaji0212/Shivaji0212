package com.api.model.response;

public class UpdateUserResponse {
	
	private String job;
	private String name;
	private String updatedAt;
	
	@Override
	public String toString() {
		return "UpdateUserResponse [job=" + job + ", name=" + name + ", updatedAt=" + updatedAt + "]";
	}
	
	
	public UpdateUserResponse() {
		
	}
	
	public UpdateUserResponse(String job, String name, String updatedAt) {
		super();
		this.job = job;
		this.name = name;
		this.updatedAt = updatedAt;
	}
	
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}
