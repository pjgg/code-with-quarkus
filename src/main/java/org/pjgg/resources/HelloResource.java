package org.pjgg.resources;

import io.smallrye.context.api.NamedInstance;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.context.ManagedExecutor;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/")
public class HelloResource {

    @ConfigProperty(name = "org.pjgg.greeting")
    private String greeting;

    @Inject
    @NamedInstance("customServiceExecutor")
    ManagedExecutor delorean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println(java.lang.Thread.activeCount());

        var promise = delorean.supplyAsync(()-> "You will see this in the future !!!");
        promise.thenAccept(System.out::println);
        System.out.println(java.lang.Thread.activeCount());

        return greeting;
    }
}
