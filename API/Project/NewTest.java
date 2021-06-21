package Project;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewTest {
	RequestSpecification requestSpec;
	int id;
	String ssh="ssh-rsa AAAAB3NzaC1yc2EAXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	@BeforeClass
	public void setUp() {
		String token ="ghp_TTzOcbXXXXXXXXXXXXXXXXXXXXXX";
		
		requestSpec = new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.addHeader("Authorization", "Bearer "+token)
				.setBaseUri("https://api.github.com")
				.build();
	}
	@Test(priority=1)

	public void post() {
		String reqBody = "{"
				+ "\"title\": \"TestAPIKey\","
				+ "\"key\":\""+ssh+"\""
				+ "}";
		Response response = given().spec(requestSpec)
				.body(reqBody) // Send request body
				.when().post("/user/keys");

		id = response.then().extract().path("id");
		System.out.println(id);
		response.then().statusCode(201);
	}
	@Test(priority=2)
	public void get() {
		Response response = given().spec(requestSpec) 
				.when().get("/user/keys"); 

		System.out.println( response.then().log().all());
	
		response.then().statusCode(200);
	}
	@Test(priority=3)
	public void delete() {
		Response response = given().spec(requestSpec) 
				.when().delete("/user/keys/{keyid}"); 

		System.out.println( response.then().log().all());
	
		response.then().statusCode(204);
	}

}