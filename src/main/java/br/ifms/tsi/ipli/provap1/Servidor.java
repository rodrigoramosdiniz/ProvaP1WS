/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.tsi.ipli.provap1;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Rodrigo
 */
public class Servidor {
    public static void main(String[] args) {
        PacienteWs paciente = new PacienteWs();
        String url = "http://localhost:6000/paci";
        System.out.println("PacienteWS rodando:" + url); 
        Endpoint.publish(url, paciente);
    }
}
