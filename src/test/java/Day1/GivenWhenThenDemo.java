package Day1;

import io.restassured.RestAssured;
  class GivenWhenThenDemo {

	public static void main(String[] args) {
		RestAssured.given() //Request
		.when() //
		.get("https://reqres.in/api/users?page=2")
		.then()//validation
		.statusCode(200);
		
	}

}
