package org.pjgg.connectors;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.pjgg.model.Joke;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ChuckNorrisConnector {

    @RestClient
    private ChuckNorrisHttpClient chuckNorrisHttpClient;

    public Joke getJoke(){
        var rawJoke = chuckNorrisHttpClient.getRawJoke();
        return new Joke(rawJoke.getId(), rawJoke.getValue());
    }
}
