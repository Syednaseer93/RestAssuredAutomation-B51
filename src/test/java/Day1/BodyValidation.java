package Day1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class BodyValidation {

	public static void main(String[] args) {
		  
		String url="https://api.github.com/orgs/{org}/repos";
		RestAssured
		.given()
			//.header("Content-Type","application/json; charset=utf-8")
			.pathParam("org", "orgsyednaseer")
			.queryParam("per_page", 1)
			.queryParam("page",3)
		.when()
			.log().all()
			.get(url)
		.then()
			.log().all()
			.and()
			.statusCode(200)
			.and()
			.body("name[0].owner.id", Matchers.equalTo("116620161"));
	}
}
 