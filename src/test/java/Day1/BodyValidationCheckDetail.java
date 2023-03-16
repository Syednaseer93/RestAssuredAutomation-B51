package Day1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class BodyValidationCheckDetail {

	public static void main(String[] args) {
		//Soft assert
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
			.body("per_page", Matchers.equalTo(5),
			"data[1].first_name", Matchers.equalTo("Ja net"),
			"data.email", Matchers.hasItem("tracey.r  amos@reqres.in"),
			"data.last_name",Matchers.contains("Blu th","Weaver","Wong","Holt","Morris","Ramos"));
		
				

	}	

}
