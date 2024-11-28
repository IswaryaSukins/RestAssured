package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateInc extends RestAssuresBase{

	@Test(dependsOnMethods="chaining.CreateIncident.Create")
	public void Update() {
		RequestSpecification inputRequest=RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"short_description\": \"updated via postman\"\r\n"
				+ "}");
		Response resp = inputRequest.put("/incident/"+sys_id);
		resp.prettyPrint();
}
}
