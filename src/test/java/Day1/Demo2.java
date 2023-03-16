package Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo2 {

	public static void main(String[] args) {
		 Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		 response.prettyPrint();//prints directly
		 response.print();
		 String responseBody = response.getBody().asString();
		 System.out.println(responseBody);
		

	}

}
