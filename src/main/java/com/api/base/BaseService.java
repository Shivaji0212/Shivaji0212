package com.api.base;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	private static final String BASE_URI = "https://reqres.in/";
	private RequestSpecification requestSpecification;
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URI);
	}

	
	public Response postRequest(Object payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
	}
	
	public Response putRequest(Object payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endPoint);
	}
	
	public Response getRequest(String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).queryParam("page", "2").get(endPoint);
	}
	
	public Response deleteRequest(String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).get(endPoint);
	}
	
	
}
