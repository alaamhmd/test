package test.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestPut {



	@Test
	public void test1() {

		JSONObject json = new JSONObject();
		json.put("name", "Alla");
		json.put("job","QA");
		//System.out.println(json);
		given().body(json.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).and().log().all();



	}


}
