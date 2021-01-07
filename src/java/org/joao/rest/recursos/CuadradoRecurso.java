/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joao.rest.recursos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author JOAO
 */
@Path("/cuadrados")
public class CuadradoRecurso {
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    
    public String GetCuadrados()
    {
        return "Hola Joao";
    }
}
