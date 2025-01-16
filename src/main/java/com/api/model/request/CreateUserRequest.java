package com.api.model.request;

public class CreateUserRequest {
	private String name;
	private String job;
	@Override
	public String toString() {
		return "CreateUserRequest [name=" + name + ", job=" + job + "]";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	
	
	
	public CreateUserRequest(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
}
