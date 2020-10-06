package org.pjgg.resources;

import io.quarkus.ts.openshift.common.OpenShiftTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static io.restassured.RestAssured.when;

@OpenShiftTest
@Disabled
public class HelloOpenShiftIT {

    @Test
    @Disabled
    public void hello() {
        // this is an EXAMPLE, waiting here isn't necessary! the test framework
        // already waits for the application to start responding
        await().atMost(1, TimeUnit.MINUTES).untilAsserted(() -> {
            when()
                    .get("/hello")
                    .then()
                    .statusCode(200)
                    .extract().body().asString().equalsIgnoreCase("hello world!");
        });
    }
}
