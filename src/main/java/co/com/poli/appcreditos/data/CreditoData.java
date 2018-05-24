/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.data;

import co.com.poli.appcreditos.model.Credito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala312
 */
public class CreditoData {
    
    private static List<Credito> listaCreditos;
    
        static{
        
        listaCreditos = new ArrayList<Credito>(){
            {
                add(new Credito("10","1017211", "Maria", "Garcia", 500, "INDEPENDIENTE", "VIVIENDA", Boolean.TRUE));
                add(new Credito("20","1017222", "Jorge", "Medina", 3000, "DEPENDIENTE", "ESTUDIO", Boolean.FALSE));                
            }
        };
    }

    public static List<Credito> getListaCreditos() {
        return listaCreditos;
    }

    public static void setListaUsuarios(List<Credito> aListaUsuarios) {
        listaCreditos = aListaUsuarios;
    }
}
