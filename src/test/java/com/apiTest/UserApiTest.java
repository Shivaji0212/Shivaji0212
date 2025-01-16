package com.apiTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.model.request.CreateUserRequest;
import com.api.model.request.LoginRequest;
import com.api.model.request.UpdateUserRequest;
import com.api.model.response.CreateUserResponse;
import com.api.model.response.LoginResponse;
import com.api.model.response.UpdateUserResponse;
import com.api.services.LoginService;
import com.api.services.UserServices;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class UserApiTest {
	@Test
	  public void TC_CreateUser() {
		CreateUserRequest createUserRequest = new CreateUserRequest("Shivaji@reqres.in", "Shivajic");
		UserServices userServices = new UserServices();
		Response response = userServices.CreateUser(createUserRequest);
		CreateUserResponse createUserResponse =  response.as(CreateUserResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(createUserResponse.getCreatedAt());
		System.out.println(createUserResponse.getJob());
		
	  }
	
	@Test
	  public void TC_UpdateUser() {
		UpdateUserRequest updateUserRequest = new UpdateUserRequest("Advik@reqres.in", "Nursery");
		UserServices userServices = new UserServices();
		Response response = userServices.UpdateUser(updateUserRequest,"863");
		UpdateUserResponse updateUserResponse =  response.as(UpdateUserResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(updateUserResponse.getUpdatedAt());
		System.out.println(updateUserResponse.getJob());
		
	  }
	
	@Test
	  public void TC_GetUser() {	
		UserServices userServices = new UserServices();
		Response response = userServices.getUser();
		userServices.validateGetUserResponse(response.asString());
		System.out.println(response.asPrettyString());
		
	  }
	
}
