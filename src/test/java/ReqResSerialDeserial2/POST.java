package ReqResSerialDeserial2;

import java.util.regex.Matcher;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class POST {

	public static void main(String[] args) {
		String name="SyedNaseer";
		String job="Manager";
		RequestPojo obj=new RequestPojo();
		obj.setName(name);
		obj.setJob(job);
		String url="https://reqres.in/api/users";
	
		ResponsePojo res=RestAssured
			.given()
				.body(obj)
			.when()
				.log().all()
				.post(url)
			.then()
				.log().all()
				.statusCode(201)
				.extract().as(ResponsePojo.class);
		
		String n=res.getName();
		//System.out.println(n);
		MatcherAssert.assertThat(n, Matchers.equalTo(name));
		
		
		
		
		

	}

}
