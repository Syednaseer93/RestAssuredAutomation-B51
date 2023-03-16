package Day1;

import io.restassured.RestAssured;

public class PathParamDemo {

	public static void main(String[] args) {
		String url="https://reqres.in/api/users/{id}";
		RestAssured
		.given()
			.pathParam("id", 2)
		.when()
			.log().all()
			.get(url)
		.then()
			.log().all()
			.statusCode(200);

	}

}
