package restA;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAssured {

    public static void getResponseBody(){
        given().when().get("https://jsonplaceholder.typicode.com/todos").then().log()
                .body();
    }



}
