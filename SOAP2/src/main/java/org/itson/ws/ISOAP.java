/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package org.itson.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;
import org.itson.entidad.Producto;
/**
 *
 * @author Hisamy Cinco Cota
 */
@WebService(serviceName = "SOAP")
public interface ISOAP {


    @WebMethod
    public List<Producto> getProductos();
    
    @WebMethod
    public void addProducto(Producto producto);
    
        
}
