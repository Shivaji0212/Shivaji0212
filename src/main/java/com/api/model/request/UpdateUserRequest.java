package com.api.model.request;

public class UpdateUserRequest {
	
	private String job;
	private String name;
	@Override
	public String toString() {
		return "UpdateUserRequest [job=" + job + ", name=" + name + "]";
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
	
	public UpdateUserRequest(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	

}
