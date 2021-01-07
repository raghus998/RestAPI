package basicrequest;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest 
{
	@Test
	public void getRequest()
	{
		//specify the Base URi
		RestAssured.baseURI ="https://reqres.in/";
		
		//Create the Request object
		RequestSpecification httprequest = RestAssured.given();
		
		//Craete the response object
		Response response = httprequest.request(Method.GET,"api/users?page=2");
		
		//get the response body
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		//get the statuscode
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		
		//get the status line
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
		
		
		
		
		
	}
	

}
