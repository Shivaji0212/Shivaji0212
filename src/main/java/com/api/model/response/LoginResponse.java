package com.api.model.response;

public class LoginResponse {
	private String token;

	@Override
	public String toString() {
		return "LoginResponse [token=" + token + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LoginResponse() {
	
	}
	
	public LoginResponse(String token) {
		super();
		this.token = token;
	}
}
