package org.pjgg.configuration;

import io.quarkus.runtime.Startup;
import org.eclipse.microprofile.context.ManagedExecutor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.Produces;

public class Producers {

    private final static int POOL_SIZE = 4; // TODO move on this hardcode properties to a config file
    private final static int POOL_QUEUE_SIZE = 10;

    @Startup
    @ApplicationScoped
    @Produces
    @Named("customServiceExecutor")
    ManagedExecutor managedCustomExecutor() {

        System.out.println("customServiceExecutor created (once)!.");

        return ManagedExecutor.builder()
                .maxAsync(POOL_SIZE)
                .maxQueued(POOL_QUEUE_SIZE)
                .build();
    }

}
