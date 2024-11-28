package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteInc extends RestAssuresBase {
	@Test(dependsOnMethods="chaining.UpdateInc.Update")
	public void Delete() {
		Response resp = RestAssured.delete("/incident/"+sys_id);
		int statusCode = resp.getStatusCode();
		System.out.println("sts "+statusCode);
	}

}
