package org.pjgg.resources;

import org.pjgg.services.Portfolio;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/profit")
public class ProfitResource {

    private final Portfolio portfolio;

    @Inject
    public ProfitResource(Portfolio portafolio){
            this.portfolio = portafolio;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Current profit is: " + this.portfolio.computePortfolioProfit();
    }

}