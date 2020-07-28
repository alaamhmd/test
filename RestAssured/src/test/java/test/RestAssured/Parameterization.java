package test.RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import data.DataForTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Parameterization extends DataForTesting {




	@Test(dataProvider = "data") public void test2(String name, String title, int
			id) { JSONObject request = new JSONObject(); request.put("id", id);
			request.put("title", title); request.put("name", name); baseURI =
					"http://localhost:3000/";

			given().contentType(ContentType.JSON).accept(ContentType.JSON).body(request.
					toJSONString()).when() .post("/users").then().log().all().statusCode(201);

	}

	@Parameters({"userID"})
	@Test(dataProvider = "id")
	public void test5(int id) {
		JSONObject request = new JSONObject();
		baseURI = "http://localhost:3000/";

		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when()
		.delete("/users/" + id).then().log().all();

	}

	@Parameters({"userID"})
	@Test
	public void test4(int userID) {
		JSONObject request = new JSONObject();
		baseURI = "http://localhost:3000/";

		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when()
		.delete("/users/" + userID).then().log().all();

	}

}
