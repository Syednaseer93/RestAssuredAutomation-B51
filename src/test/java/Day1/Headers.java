package Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Headers {

	public static void main(String[] args) {

		Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		//System.out.println(response.headers());
		String dateHeader = response.getHeader("Date");
		System.out.println(dateHeader);
		System.out.println(response.getHeader("Server"));
		System.out.println(response.getHeader("contentType"));
		
	}

}
