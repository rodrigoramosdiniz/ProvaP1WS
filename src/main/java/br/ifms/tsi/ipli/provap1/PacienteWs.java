/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.tsi.ipli.provap1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Rodrigo
 */

@WebService(targetNamespace = "http://localhost:6000/paci")
public class PacienteWs {
    @WebMethod(operationName = "CalcularIMC")
    @WebResult(name="IMCCalculado")
    public Double CalcularImc(@WebParam(name="Paciente")Paciente paciente){
        
        paciente.setImc( paciente.getPeso()/(paciente.getAltura()* paciente.getAltura()));
        
        return paciente.getImc();
    }
}
