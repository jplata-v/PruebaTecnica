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
import org.joao.rest.modelos.FiguraGeometrica;
import org.joao.rest.modelos.Triangulo;

/**
 *
 * @author JOAO
 */
@Path("/figuratri")
public class FiguraGeometricaRecursoT {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    
    public FiguraGeometrica GetFigurasT()
    {        
        Triangulo tri=new Triangulo(1,"Triangulo", 2.0,3.0,2.0);
        String No=tri.getNombre();
        double s = (tri.getBase()*tri.getAltura())/2;
        double b = tri.getBase();
        double a = tri.getAltura();
        FiguraGeometrica fi = new FiguraGeometrica(1,No,s,b,a,0.0);
                        
        return fi;
    }
}
