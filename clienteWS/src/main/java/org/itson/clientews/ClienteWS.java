/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.clientews;

import com.itson.soapcliente.NuevoWS;
import com.itson.soapcliente.NuevoWS_Service;

/**
 *
 * @author Hisamy Cinco Cota
 */
public class ClienteWS {

    public static void main(String[] args) {
        NuevoWS_Service ws = new NuevoWS_Service();
        NuevoWS port = ws.getNuevoWSPort();
        String resp = port.hello("Hisamy");
        System.out.println(resp);
    }
}
