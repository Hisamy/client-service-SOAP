/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.clienteentidadpropia;

import com.itson.ws.Ws;
import com.itson.ws.Ws_Service;

/**
 *
 * @author hisam
 */
public class ClienteEntidadPropia {

    public static void main(String[] args) {
        Ws_Service ws = new Ws_Service();
        Ws port = ws.getWsPort();
        String resp = port.hello("Hisamy");
        System.out.println(resp);
    }
}
