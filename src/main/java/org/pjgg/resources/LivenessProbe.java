package org.pjgg.resources;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.enterprise.context.ApplicationScoped;

@Liveness
@ApplicationScoped
public class LivenessProbe implements HealthCheck{

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("Always Up!");
    }
}
