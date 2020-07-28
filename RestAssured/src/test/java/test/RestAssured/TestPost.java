package test.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class TestPost {


	@Test
	public void test1() {

//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Alaa");
//		map.put("job", "QC");
		JSONObject json = new JSONObject();
		json.put("name", "Alla");
		json.put("job","QA");
		System.out.println(json);
		given().body(json.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
		


	}

}