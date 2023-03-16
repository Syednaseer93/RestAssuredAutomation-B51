package Day1;

import io.restassured.RestAssured;

public class HeaderValidation {

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
			.header("Content-Type","application/json; charset=utf-8")
			.header("Server","GitHub.com")
			.statusCode(200);
	}

}
