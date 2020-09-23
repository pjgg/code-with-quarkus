package org.pjgg.resources;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.pjgg.dto.JokeDto;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;


@QuarkusTest
@QuarkusTestResource(WireMockJokesResource.class) // @QuarkusTestResource applies to all tests, not just JokesResourceTest.
public class JokesResourceTest {

    @Test
    public void testJokeEndpoint() {

        JokeDto expectedResp = new JokeDto("randomID", "randomJoke");

        given()
                .when().get("/joke")
                .then()
                .statusCode(201)
                .body(is("{\"ID\":\"randomID\",\"value\":\"randomJoke\"}"));
    }
}
