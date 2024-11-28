package chaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class RestAssuresBase {
	
	public static String sys_id;
	
	@BeforeMethod
	public void setup() {
		
       RestAssured.baseURI="https://dev244244.service-now.com/api/now/table";
		
		//Authorization
		
		RestAssured.authentication=RestAssured.basic("admin","0=gyDkq*RB0Z");
		
	}
}
