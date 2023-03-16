package Day1;

import io.restassured.RestAssured;

public class DeleteRequestDemo {

		public static void main(String[] args) {
			String url="https://api.github.com/repos/{owner}/{repo}";
			RestAssured
			.given()
				.pathParam("owner", "orgsyednaseer")
				.pathParam("repo", "Oct_26th_repo0.5670913014885652")
				.header("Authorization","Bearer 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")
			.when()
				.log().all()
				.delete(url)
			.then()
				.log().all()
				.statusCode(204); 
	}

}
