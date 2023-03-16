package Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo1 {

	public static void main(String[] args) {
		
	Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	
	//response.prettyPrint();
	int statusCode1 = response.getStatusCode();
	int statusCode2 =response.statusCode();
	System.out.println(statusCode1);
	System.out.println(statusCode2);
	//response.peek();

	
	}

}
