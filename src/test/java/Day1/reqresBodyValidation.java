package Day1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class reqresBodyValidation {

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
			.statusCode(200)
			.body("data.email",Matchers.equalTo("janet.weaver@reqres.in"))
			.body("data.first_name", Matchers.equalTo("Janet"))
			.body("data.avatar", Matchers.equalTo("https://reqres.in/img/faces/2-image.jpg"));
			//Validating email, first_name,avatar
		
			
			

	}
}


