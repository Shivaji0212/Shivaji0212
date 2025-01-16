package com.api.services;

import com.api.base.BaseService;

import io.restassured.response.Response;

public class LoginService extends BaseService {

	private String BASE_PATH = "/api/";
	
	public Response login(Object payload) {
		return postRequest(payload,BASE_PATH+"login");
	}
	
	
	public Response Register(Object payload) {
		return postRequest(payload,BASE_PATH+"register");
	}
}
