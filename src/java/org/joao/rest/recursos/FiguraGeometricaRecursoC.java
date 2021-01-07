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
import org.joao.rest.modelos.Circulo;
import org.joao.rest.modelos.FiguraGeometrica;

/**
 *
 * @author JOAO
 */
@Path("/figuracir")
public class FiguraGeometricaRecursoC {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    
    public FiguraGeometrica GetFigurasC()
    {        
        Circulo cir=new Circulo(1,"Circulo", 2.0,3.0);
        String No=cir.getNombre();
        double s = (cir.getRadio()*cir.getRadio()*Math.PI);
        double b = 0.0;
        double a = 0.0;
        double d= cir.getDiametro();
        FiguraGeometrica fi = new FiguraGeometrica(1,No,s,b,a,d);
                        
        return fi;
    }
}
