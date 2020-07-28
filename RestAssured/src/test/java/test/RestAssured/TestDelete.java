package test.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestDelete {





	@Test
	public void test1() {

		JSONObject json = new JSONObject();
	
		
		when().delete("https://reqres.in/api/users/2").
		then().statusCode(204).and().log().all();



	}

}
