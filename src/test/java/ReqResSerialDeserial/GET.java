package ReqResSerialDeserial;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class GET {
	public static void main(String[] args) {
		String url="https://reqres.in/api/users?page=2";	
		RootResponse obj=new RootResponse();
		
		RootResponse res = RestAssured
			.given()
				.queryParam("page", 2)
			.when()
				.log().all()
				.get(url)
			.then()
				.log().all()
				.statusCode(200)
					.extract().as(RootResponse.class);
	//	String fname= res.getData().get(0).getFirst_name();
	//	System.out.println(fname);
	//	System.out.println(res.getSupport().getUrl());
		
	}

}
