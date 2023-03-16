package Day1;

import io.restassured.RestAssured;

public class SyntacticSugarExample {


	public static void main(String[] args) {
		String url="https://api.github.com/orgs/{org}/repos";
		RestAssured
		.given()
			.pathParam("org", "orgsyednaseer")
			.and()
			.queryParam("per_page", 1)
			.and()
			.queryParam("page",3)
		.when()
			.log().all()
			.get(url)
		.then()
			.log().all()
			.and().assertThat()
				.header("Content-Type","application/json; charset=utf-8")
			.and().assertThat()
				.header("Server","GitHub.com")
			.and().assertThat()
				.statusCode(200);
	}

}
