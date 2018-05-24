package co.com.poli.appcreditos.dao;

import co.com.poli.appcreditos.model.Credito;
import java.util.List;

public interface ICreditoDao {

    List<Credito> obtenerListaCredito();

    String creditoMasUtilizado();

    String mayorAcumulado();

    String mayoresPrestadores();

    String registrarCredito(Credito credito);

}
