package org.itson.soap2.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.itson.entidad.Producto;

/**
 *
 * @author Hisamy Cinco Cota
 */
@Path("jakartaee9")
public class JakartaEE91Resource {
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Producto producto(
            @QueryParam("name") String name,
            @QueryParam("price") Double price) {
        
        if ((name == null) || name.trim().isEmpty()) {
            name = "null";
        }
        
        if (price == null) {
            price = 0.0; 
        }
        
        return new Producto(name, price);
    }
}
