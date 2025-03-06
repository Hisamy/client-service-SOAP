/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.entidadpropiacliente;

/**
 *
 * @author Hisamy Cinco Cota
 */
public class EntidadPropiaCliente {

    public static void main(String[] args) {
        Ws_Service ws = new Ws_Service();
        Ws port = ws.getWsPort();
        String resp = port.hello("Cartera de huevos");
        System.out.println(resp);
    }
}
