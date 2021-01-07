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
import org.joao.rest.modelos.Cuadrado;
import org.joao.rest.modelos.FiguraGeometrica;

/**
 *
 * @author JOAO
 */
@Path("/figuracua")
public class FiguraGeometricaRecurso {
    
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    
    public FiguraGeometrica GetFiguras()
    {        
        Cuadrado cua=new Cuadrado(1,"Cuadrado", 2.0);
        String No=cua.getNombre();
        double s = (cua.getLado()*cua.getLado());
        double b = cua.getLado();
        double a = cua.getLado();
        FiguraGeometrica fi = new FiguraGeometrica(1,No,s,b,a,0.0);
                        
        return fi;
    }
}
