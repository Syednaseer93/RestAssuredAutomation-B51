package GitHubSerialDeserial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.restassured.RestAssured;
@JsonIgnoreProperties(ignoreUnknown = true)
public class POST {

	public static void main(String[] args) {
		
		RequestPojo obj=new RequestPojo();
		obj.setName("Practice1_29th_4");
		obj.setDescription("Created today at 29th");
		String url="https://api.github.com/orgs/{org}/repos";
		
		ResponseRootPojo res=RestAssured
			.given()
				.pathParam("org", "orgsyednaseer")
				.header("Authorization","Bearer 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")
				.body(obj)
			.when()
				.log().all()
				.post(url)
			.then()
				.log().all()
				.statusCode(201)
				.extract().as(ResponseRootPojo.class);
		String s=res.getOwner().getLogin();
			System.out.println(s);	
			
				

	}

}
