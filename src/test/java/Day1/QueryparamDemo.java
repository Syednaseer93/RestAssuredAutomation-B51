package Day1;

import io.restassured.RestAssured;

public class QueryparamDemo {
	public static void main(String[] args) {
		String url="https://reqres.in/api/users";
		RestAssured
		.given()
			.queryParam("page", 2)
		.when()
			.log().all()
			.get(url)			
		.then()
			.statusCode(200)
			.log().all();
	}

}
