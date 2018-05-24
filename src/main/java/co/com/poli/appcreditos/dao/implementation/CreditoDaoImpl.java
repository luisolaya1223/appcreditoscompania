package co.com.poli.appcreditos.dao.implementation;

import co.com.poli.appcreditos.dao.ICreditoDao;
import co.com.poli.appcreditos.data.CreditoData;
import co.com.poli.appcreditos.model.Credito;
import java.util.List;

public class CreditoDaoImpl implements ICreditoDao {

    @Override
    public List<Credito> obtenerListaCredito() {
        return CreditoData.getListaCreditos();
    }

    @Override
    public String creditoMasUtilizado() {

        List<Credito> creditos = obtenerListaCredito();
        int V = 0, E = 0, L = 0;
        for (Credito credito : creditos) {
            if (credito.getTipoCredito().equals("VIVIENDA")) {
                V += 1;
            } else if (credito.getTipoCredito().equals("ESTUDIO")) {
                E += 1;
            } else {
                L += 1;
            }
        }

        if (V > E && V > L) {
            return "El crédito mas escogido es de vivienda";
        } else if (L > E && L > V) {
            return "El crédito mas escogido es de Libre inversión";
        } else {
            return "El crédito mas escogido es de Estudio";
        }

    }

    @Override
    public String mayorAcumulado() {

        List<Credito> creditos = obtenerListaCredito();
        int V = 0, E = 0, L = 0;
        for (Credito credito : creditos) {
            if (credito.getTipoCredito().equals("VIVIENDA")) {
                V += credito.getMonto();
            } else if (credito.getTipoCredito().equals("ESTUDIO")) {
                E += credito.getMonto();
            } else {
                L += credito.getMonto();
            }
        }

        if (V > E && V > L) {
            return "El crédito mas escogido es de vivienda y su acumulado es de: " + V;
        } else if (L > E && L > V) {
            return "El crédito mas escogido es de Libre inversión y su acumulado es de: " + L;
        } else {
            return "El crédito mas escogido es de Estudio y su acumulado es de: " + E;
        }

    }

    @Override
    public String mayoresPrestadores() {

        List<Credito> creditos = obtenerListaCredito();
        int I = 0, D = 0;
        for (Credito credito : creditos) {
            if (credito.getTipoTrabajador().equals("DEPENDIENTE")) {
                I += 1;
            } else if (credito.getTipoTrabajador().equals("INDEPENDIENTE")) {
                D += 1;
            }

        }

        if (I > D) {
            return "Quienes mas prestan son los INDEPENDIENTES";
        } else {
            return "Quienes mas prestan son los DEPENDIENTES";
        }

    }

    @Override
    public String registrarCredito(Credito credito) {
        List<Credito> listaCredito = CreditoData.getListaCreditos();
        listaCredito.add(credito);
        CreditoData.setListaUsuarios(listaCredito);
        return "Credito Creado";

    }

}
