package basicrequest;


import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostReq1 {
	@Test
	public void PostReq1()
	{
		File jsonbody = new File("./JsonFiles/CreateSingleUser.json");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httprequest = RestAssured.given();
		httprequest.body(jsonbody);
		Response response = httprequest.request(Method.POST, "/api/users");
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
	    String responsebody = response.getBody().asString();
	    System.out.println(responsebody);
		
		
	}

}
