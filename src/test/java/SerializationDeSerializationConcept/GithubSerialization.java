package SerializationDeSerializationConcept;

import Day1.DeserializationPOJO;
import io.restassured.RestAssured;

public class GithubSerialization {

	public static void main(String[] args) {
		
		SerializationPojo obj =new SerializationPojo();
		obj.setName("Naseer");
		obj.setDescription("This is Created by me at 11.50AM 29th");
		
		String url="https://api.github.com/orgs/{org}/repos";
		
		RestAssured
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
		    	.extract().as(DeserializationPOJO.class);
		    	
		    	

	}

}
