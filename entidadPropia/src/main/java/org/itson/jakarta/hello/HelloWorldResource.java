package org.itson.jakarta.hello;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldResource {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Producto producto(@QueryParam("nombre") String nombre) {
        if ((nombre == null) || nombre.trim().isEmpty()) {
            nombre = "null";
        }

        return new Producto(nombre);
    }
}
