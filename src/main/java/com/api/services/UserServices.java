package com.api.services;

import org.json.JSONObject;

import com.api.base.BaseService;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UserServices extends BaseService {

	private String BASE_PATH = "/api/";
	
	public Response CreateUser(Object payload) {
		return postRequest(payload,BASE_PATH+"users");
	}
	
	public Response UpdateUser(Object payload, String users) {
		return putRequest(payload,BASE_PATH+"users/"+users);
	}
	
	public Response deleteUser(String users) {
		return deleteRequest(BASE_PATH+"users/"+users);
	}
	
	public Response Register(Object payload) {
		return postRequest(payload,BASE_PATH+"register");
	}
	
	public Response getUser() {
		return getRequest(BASE_PATH+"users");
	}
	
	public void validateGetUserResponse(String response) {
		JSONObject jsonObject =  new JSONObject(response);
		int page = jsonObject.getInt("page");
		System.out.println("PAGE "+page);
		int dataSize = jsonObject.getJSONArray("data").length();
		for (int i = 0; i < dataSize; i++) {
			String email = jsonObject.getJSONArray("data").getJSONObject(i).getString("email");
			System.out.println(i +" "+email);
		}
		
	}
}
