package io.openliberty.sample.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/customers")
public class CustomerAPI {

    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    public JsonObject getAllCustomers(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("Name", "Cesar");
        builder.add("Status", "BeingDad");
        return builder.build();
    }
}
