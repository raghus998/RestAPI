package basicrequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostRequest {
	
	@Test
	public void PostRequest() 
	{
		//Specify the Base URI
		RestAssured.baseURI = "https://reqres.in/";
		
		//Create the request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Specify the Payload in JSON format
		JSONObject requestParameter = new JSONObject();
	
		requestParameter.put("name", "RS");
		requestParameter.put("job", "IPS");
	
		//Specify the pauload type 
		httpRequest.headers("Content-Type", "application/json");
		
		//add the Json payload  to requestbody
		httpRequest.body(requestParameter.toJSONString());
		
		//Create the response object
		Response response = httpRequest.request(Method.POST,"/api/users");
		
		//get the response body
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		//Verify status code
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(201, statuscode);

		//Validate the response Body
		String name = response.jsonPath().get("name").toString();
		String job = response.jsonPath().get("job").toString();
		String id = response.jsonPath().get("id").toString();
		String date = response.jsonPath().get("createdAt").toString();
		System.out.println("Response body : "+name+"  "+job+"  "+id+" "+date);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
