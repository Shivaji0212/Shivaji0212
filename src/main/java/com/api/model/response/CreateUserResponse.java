package com.api.model.response;

public class CreateUserResponse {
	private String name;
	private String job;
	private String id; 
	private String createdAt;
	
	public CreateUserResponse() {
	
	}
	
	public CreateUserResponse(String name, String job, String id, String createdAt) {
		super();
		this.name = name;
		this.job = job;
		this.id = id;
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "CreateUserResponse [name=" + name + ", job=" + job + ", id=" + id + ", createdAt=" + createdAt + "]";
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
