package Day1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class BodyValidationCheckDetail2SoftAssert {

	public static void main(String[] args) {
		
		String url="https://reqres.in/api/{usrs}";
		RestAssured
		.given()
			.pathParam("usrs", "users")
		.when()
			.log().all()
			.get(url)
		.then()
			.log().all()
			.statusCode(200)
			.body("per_page", Matchers.equalTo(6))
			.body("data[1].first_name", Matchers.equalTo("Janet"))
			.body("data.email", Matchers.hasItem("tracey.ramos@reqres.in"))
			.body("data.last_name",Matchers.contains("Bluth","Weaver","Wong","Holt","Morris","Ramos"));
		
				

	}	

}
