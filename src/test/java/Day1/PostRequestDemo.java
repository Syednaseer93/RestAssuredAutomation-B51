package Day1;

import io.restassured.RestAssured;

public class PostRequestDemo {

	public static void main(String[] args) {
		String url="https://api.github.com/orgs/{org}/repos";
		RestAssured
		.given()	
			.pathParam("org", "orgsyednaseer")
			.header("Authorization","Bearer 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")
			
		
		.when()
		.log().all()
		.post(url)
		
		.then()
		.log().all()
		.statusCode(201);
	}

}
