package com.apiTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;
import com.api.services.LoginService;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

@Listeners(com.api.listeners.TestListener.class)
public class LoginApiTest {
  @Test
  public void Login() {
	  LoginRequest register = new LoginRequest("eve.holt@reqres.in", "cityslicka");
	  LoginService loginService = new LoginService();
	  Response response = loginService.Register(register);
	  System.out.println(response.asPrettyString());
	  Assert.assertEquals(response.getStatusCode(), 200);
	  
	  
	  LoginRequest loginRequest = new LoginRequest("eve.holt@reqres.in", "cityslicka");
	  //LoginService loginService = new LoginService();
	  response = loginService.login(loginRequest);
	  System.out.println(response.asPrettyString());
	  Assert.assertEquals(response.getStatusCode(), 2000);
	  
	  LoginResponse loginResponse = response.as(LoginResponse.class);
	  System.out.println(loginResponse.getToken());
  }
}
