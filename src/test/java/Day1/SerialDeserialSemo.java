package Day1;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SerialDeserialSemo {
	
	String sname="Naseer";
	String sjob="Manager";
	public static void main(String[] args) {
		
		String sname="Naseer";
		String sjob="Manager";
		SerializationPOJO obj=new SerializationPOJO();
		obj.setName(sname);
		obj.setJob(sjob);
		
		String url="https://reqres.in/api/users";
		
		DeserializationPOJO res=RestAssured
			.given()
				.contentType(ContentType.JSON)
				.body(obj)
			.when()
				.log().all()
				.post(url)
			.then()
				.log().all()
				.statusCode(201)
				.extract().as(DeserializationPOJO.class);
		String Dname=res.getName();
		String Djob=res.getJob();
		MatcherAssert.assertThat(Dname,Matchers.equalTo(sname));
		MatcherAssert.assertThat(Djob,Matchers.equalTo(sjob));
	

			
		
	}

}
