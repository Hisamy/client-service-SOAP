/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package org.itson.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;
import org.itson.entidad.Producto;

/**
 *
 * @author Hisamy Cinco Cota
 */
@WebService(serviceName = "SOAP")
public class SOAP {  
    /**
     * Método que recibe un producto
     * @param producto El producto a recibir
     * @return Mensaje de confirmación
     */
    @WebMethod(operationName = "recibirProducto")
    public String recibirProducto(@WebParam(name = "producto") Producto producto) {
        return "Producto recibido: " + producto.getNombre() + " con precio " + producto.getPrecio();
    }

}
