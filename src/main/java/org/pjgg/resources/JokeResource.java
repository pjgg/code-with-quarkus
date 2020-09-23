package org.pjgg.resources;

import org.pjgg.dto.JokeDto;
import org.pjgg.services.JokesService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/joke/")
public class JokeResource {

    @Inject
    private JokesService chuckNorrisService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response joke() {
        var joke = chuckNorrisService.getJoke();
        return Response.status(Response.Status.CREATED).entity(JokeDto.fromJoke(joke)).build();
    }
}