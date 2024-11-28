package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident extends RestAssuresBase{
	
	@Test
	public void Create() {
		RequestSpecification inputRequest=RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"short_description\": \"create via postman\"\r\n"
				+ "}");
		
		//Send Request
		Response response = inputRequest.post("/incident");
		
		//Print the Response
		response.prettyPrint();
		
		sys_id = response.jsonPath().get("result.sys_id");
		System.out.println("sysid is"   +sys_id);
		
	}

}
