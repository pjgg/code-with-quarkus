package org.pjgg.resources;

import java.util.Collections;
import java.util.Map;

import com.github.tomakehurst.wiremock.WireMockServer;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class WireMockJokesResource implements QuarkusTestResourceLifecycleManager {

    private WireMockServer wireMockServer;

    @Override
    public Map<String, String> start() {
        wireMockServer = new WireMockServer();
        wireMockServer.start();

        stubFor(get(urlEqualTo("/jokes/random"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"categories\":[],\"created_at\":\"2020-01-05 13:42:19.576875\",\"icon_url\":\"https://assets.chucknorris.host/img/avatar/chuck-norris.png\",\"id\":\"randomID\",\"updated_at\":\"2020-01-05 13:42:19.576875\",\"url\":\"https://api.chucknorris.io/jokes/sC09X1xQQymE4SciIjyV0g\",\"value\":\"randomJoke\"}")));
        return Collections.singletonMap("org.pjgg.connectors.ChuckNorrisHttpClient/mp-rest/url", wireMockServer.baseUrl());
    }

    @Override
    public void stop() {
        if (null != wireMockServer) {
            wireMockServer.stop();
        }
    }
}
