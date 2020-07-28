package test.RestAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestGet {
	@Test
	public void test () {
	Response response =	get("https://reqres.in/api/users?page=2");
	System.out.println("response is : " +response.getStatusCode());
	System.out.println("response is : " +response.getBody().asString());
	System.out.println("response is : " +response.getTime());

	System.out.println("response is : " +response.asString());
	System.out.println("response is : " +response.getStatusLine());
	int statusCode = response.getStatusCode();
	assertEquals(statusCode, 200);	
	}
	
	@Test
	public void test1() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",equalTo(7)).log().all().
		body("data.first_name", hasItems("Michael","Rachel"));
	}

}
