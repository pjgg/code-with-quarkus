package org.pjgg.services;

import org.pjgg.connectors.ChuckNorrisConnector;
import org.pjgg.model.Joke;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class JokesService {

    @Inject
    private ChuckNorrisConnector chuckNorrisConnector;

    public Joke getJoke(){
        return chuckNorrisConnector.getJoke();
    }
}
