package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetReq1 
{
	@Test
	public void GetReq1()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification htteprequest = RestAssured.given();
		Response response = htteprequest.request(Method.GET, "api/users?page=2");
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
	}

}
