package test.RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class APILocalServer {
	
	@Test
	public void test1() {
		baseURI = "http://localhost:3000/";
		given().get("/users").then().log().all().statusCode(200);
		given().param("name", "AlaaMohammed").get("/users").then().log().all();
		
		
	}
//	@Test
//	public void test2() {
//		JSONObject request = new JSONObject();
//		request.put("id", 122);
//		request.put("title", "Doctor");
//		request.put("name", "TalyaAdel");
//		baseURI = "http://localhost:3000/";
//
//		given().contentType(ContentType.JSON)
//		.accept(ContentType.JSON).body(request.toJSONString()).when().post("/users").then().log().all().statusCode(201);
//		
//	}
	
	@Test
	public void test3() {
		JSONObject request = new JSONObject();
		request.put("name", "Talya Adel");
		baseURI = "http://localhost:3000/";

		given().contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString()).when().patch("/users/12").then().log().all().statusCode(200);
		
	}
	@Test
	public void test4() {
		JSONObject request = new JSONObject();
		baseURI = "http://localhost:3000/";
		request.put("title", "Football player");
		request.put("name", "Mohammed Ibrahim");


		given().contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString()).when().put("/users/122").then().log().all();
		
	}
	@Test
	public void test5() {
		JSONObject request = new JSONObject();
		baseURI = "http://localhost:3000/";
	
		given().contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString()).when().delete("/users/11122").then().log().all();
		
	}
	

}
