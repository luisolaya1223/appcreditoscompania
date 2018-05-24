package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.ICreditoBusiness;
import co.com.poli.appcreditos.dao.implementation.CreditoDaoImpl;
import co.com.poli.appcreditos.model.Credito;
import java.util.List;

public class CreditoBusinessImpl implements ICreditoBusiness {

    CreditoDaoImpl creditoDaoImpl = new CreditoDaoImpl();

    @Override
    public List<Credito> obtenerListaCredito() {
        return creditoDaoImpl.obtenerListaCredito();
    }

    @Override
    public String creditoMasUtilizado() {
        return creditoDaoImpl.creditoMasUtilizado();
    }

    @Override
    public String mayorAcumulado() {
        return creditoDaoImpl.mayorAcumulado();
    }

    @Override
    public String mayoresPrestadores() {
        return creditoDaoImpl.mayoresPrestadores();
    }

    @Override
    public String registrarCredito(Credito credito) {
        List<Credito> listaCreditos = obtenerListaCredito();
        if (listaCreditos.contains(credito)) {
            return "ERROR: Numero de crédito debe ser único";
        }

        Boolean V = false, E = false, L = false;
        for (Credito item : listaCreditos) {
            if (credito.getDocumento().equals(item.getDocumento())) {
                if (item.getTipoCredito().equals("VIVIENDA")){
                    V = true;
                }
                if (item.getTipoCredito().equals("ESTUDIO")){
                    E = true;
                }
                if (item.getTipoCredito().equals("LIBRE")){
                    L = true;
                }
            }
        }
        
        if (credito.getTipoCredito().equals("VIVIENDA")&&!V){
            return creditoDaoImpl.registrarCredito(credito);
        }
        if (credito.getTipoCredito().equals("ESTUDIO")&&!E){
            return creditoDaoImpl.registrarCredito(credito);
        }
        if (credito.getTipoCredito().equals("LIBRE")&&!L){
            return creditoDaoImpl.registrarCredito(credito);
        }

        return "Ya tiene un tipo de credito de"+ credito.getTipoCredito();
    }

}
