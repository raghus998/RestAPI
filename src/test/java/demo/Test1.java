package demo;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

public class Test1 {
	public static void main(String[] args) 
	{
		JSONObject empdetails = new JSONObject();
		
		JSONObject emp1details = new JSONObject();
		emp1details.put("Name","RS");
		emp1details.put("Dest", "TESTENGG");
		emp1details.put("ID", "123");
		
		JSONArray emp1skills = new JSONArray();
		emp1skills.add("JAVA");
		emp1skills.add("Selenium");
		emp1skills.add("API");
		
		JSONObject emp1add = new JSONObject();
		emp1add.put("Street", "frist");
		emp1add.put("Town", "GVT");
		emp1add.put("PINCODE", "12345");
		
		JSONObject emp1landmark = new JSONObject();
		emp1landmark.put("landmark1", "123");
		emp1landmark.put("Landmark2", "321");
		emp1add.put("landmark ", emp1landmark);
		
		emp1details.put("emp1skills", emp1skills);
		emp1details.put("emp1add", emp1add);
		
		JSONObject emp2details = new JSONObject();
		emp2details.put("NAME", "SR");
		emp2details.put("ID", "321");
		emp2details.put("DEST", "AUTO test ENgg");
		
		JSONArray emp2skills = new JSONArray();
		emp2skills.add("selenium");
		emp2skills.add("Java");
		emp2skills.add("API");
		
		JSONObject emp2add = new JSONObject();
		emp2add.put("Street", "frist1");
		emp2add.put("Town", "GVT1");
		emp2add.put("PINCODE", "123451");
		
		JSONObject emp2landmark = new JSONObject();
		emp2landmark.put("landmark1", "123");
		emp2landmark.put("Landmark2", "321");
		emp2add.put("landmark ", emp2landmark);
		
		emp2details.put("emp2Skills", emp2skills);
		emp2details.put("emp2add", emp2add);
		
		empdetails.put("emp1",emp1details);
		empdetails.put("emp2", emp2details);
		
	
		
		//System.out.println(empdetails.toJSONString());
		
		
		// Write JSON file
		try(FileWriter file = new FileWriter("./JsonFiles/employees1.json")){
			file.write(empdetails.toJSONString());
			file.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Object emp1Object = empdetails.get("emp1");
		//System.out.println(emp1Object.toString());
		
		JSONObject emp1Objects = (JSONObject) emp1Object;
		 String land = ((JSONObject)((JSONObject)emp1Objects.get("emp1add")).get("landmark ")).get("landmark1").toString();
		System.out.println(land);
		String skill = ((JSONArray)emp1Objects.get("emp1skills")).get(0).toString();
		System.out.println(skill);
		/* System.out.println(emp1Objects.get("Dest"));
		System.out.println(emp1Objects.get("ID"));
		System.out.println(emp1Objects.get("Name"));
		System.out.println(emp1Objects.get("emp1skills"));
		System.out.println(emp1Objects.get("emp1add"));
		Object skills = emp1Objects.get("emp1skills");
		JSONArray arrayskill = (JSONArray) skills;
		System.out.println(arrayskill.get(0));
		System.out.println(arrayskill.get(1));
		System.out.println(arrayskill.get(2));
		
		Object emp1addDetails = emp1Objects.get("emp1add");
		JSONObject emp2adddetails = (JSONObject) emp1addDetails;
		System.out.println(emp2adddetails.get("Street"));
		System.out.println(emp2adddetails.get("Town"));
		System.out.println(emp2adddetails.get("PINCODE"));
		System.out.println(emp2adddetails.get("landmark "));
		Object ladmarkdetails = emp2adddetails.get("landmark ");
		JSONObject landmarks = (JSONObject) ladmarkdetails;
		System.out.println(landmarks.get("landmark1"));
		System.out.println(landmarks.get("Landmark2"));*/
	}


	
	
}
