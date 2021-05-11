package restA;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {
    @Test
    public void endpointToDoAvailable() {
        get("https://jsonplaceholder.typicode.com/todos").then().statusCode(200);
    }

    @Test
    public void toDoNumberFour() {
        RestAssured.getResponseBody();
    }


}
