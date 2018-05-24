/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business;

import co.com.poli.appcreditos.model.Credito;
import java.util.List;

/**
 *
 * @author sala312
 */
public interface ICreditoBusiness {

    List<Credito> obtenerListaCredito();

    String creditoMasUtilizado();

    String mayorAcumulado();

    String mayoresPrestadores();

    String registrarCredito(Credito credito);

}
