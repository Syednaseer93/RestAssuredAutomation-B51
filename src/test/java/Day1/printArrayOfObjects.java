package Day1;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class printArrayOfObjects {

	public static void main(String[] args) {
	Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees?page=1");
	 JsonPath jPath = response.jsonPath();
/*	List<String> allDataObj = jPath.getList("data.employee_name");
	for(String ename:allDataObj) {
		System.out.println(ename);
	} */
	 
	// counting the number of objects in data Array
	 int dataObjCount = jPath.getInt("data.size()");
	 System.out.println(dataObjCount);
	 
	
	 	
	}

}
