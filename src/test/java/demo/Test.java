package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {

	public static void main(String[] args) throws IOException, ParseException {
		// First Employee
		JSONObject employeeDetails = new JSONObject();

		// employeeDetails.put("firstName", "Lokesh");
		// employeeDetails.put("lastName", "Gupta");
		// employeeDetails.put("website", "howtodoinjava.com");

		JSONArray employeeDetails1 = new JSONArray();
		employeeDetails1.add("Lokesh");
		employeeDetails1.add("Gupta");
		employeeDetails1.add("howtodoinjava.com");

		JSONObject address = new JSONObject();

		address.put("line1", "Street1");
		address.put("City", "Banglore");

		JSONObject employeeDetails2 = new JSONObject();
		employeeDetails2.put("firstName", "Lokesh");
		employeeDetails2.put("lastName", "Gupta");
		employeeDetails2.put("website", "howtodoinjava.com");
		employeeDetails2.put("Address", address);

		employeeDetails.put("emp1", employeeDetails1);
		employeeDetails.put("emp2", employeeDetails2);

		// Write JSON file
		try (FileWriter file = new FileWriter("./JsonFiles/employees.json")) {

			file.write(employeeDetails.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Object out = employeeDetails.get("emp1");
		//
		// JSONArray emp1Details = (JSONArray) out;
		//
		// String d1 = emp1Details.get(0).toString();
		//
		// System.out.println(d1);
		// System.out.println(emp1Details.get(1).toString());

		Object out = employeeDetails.get("emp2");

		JSONObject emp2Details = (JSONObject) out;

		String d1 = emp2Details.get("firstName").toString();

		System.out.println(d1);
		System.out.println(emp2Details.get("website").toString());
		
		Object out2 = emp2Details.get("Address");
		
		JSONObject ad1 = (JSONObject) out2;
		
		String ads1 = ad1.toJSONString();
		
		System.out.println(((JSONObject)((JSONObject)employeeDetails.get("emp2")).get("Address")).get("City"));
		System.out.println(ads1);
		
		
		
		
	/*	FileReader reader = new FileReader("./JsonFiles/employees.json");
		
		JSONParser jp = new JSONParser();
		
				 
		Object obOut = jp.parse(reader);
		
		 JSONArray jso = (JSONArray) obOut;
		 
		 System.out.println(jso);*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
