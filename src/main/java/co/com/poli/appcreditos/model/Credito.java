
package co.com.poli.appcreditos.model;

import java.util.Objects;

public class Credito {
    
    private String NumeroCredito;
    private String Documento;
    private String Nombres;
    private String Apellidos;
    private int Monto;
    private String TipoTrabajador;
    private String TipoCredito;
    private Boolean Trabajador;

    public Credito(String NumeroCredito, String Documento, String Nombres, String Apellidos, int Monto, String TipoTrabajador, String TipoCredito, Boolean Trabajador) {
        this.NumeroCredito = NumeroCredito;
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Monto = Monto;
        this.TipoTrabajador = TipoTrabajador;
        this.TipoCredito = TipoCredito;
        this.Trabajador = Trabajador;
    }

    public String getNumeroCredito() {
        return NumeroCredito;
    }

    public void setNumeroCredito(String NumeroCredito) {
        this.NumeroCredito = NumeroCredito;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getTipoTrabajador() {
        return TipoTrabajador;
    }

    public void setTipoTrabajador(String TipoTrabajador) {
        this.TipoTrabajador = TipoTrabajador;
    }

    public String getTipoCredito() {
        return TipoCredito;
    }

    public void setTipoCredito(String TipoCredito) {
        this.TipoCredito = TipoCredito;
    }

    public Boolean getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(Boolean Trabajador) {
        this.Trabajador = Trabajador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.NumeroCredito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credito other = (Credito) obj;
        if (!Objects.equals(this.NumeroCredito, other.NumeroCredito)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Credito{" + "NumeroCredito=" + NumeroCredito + ", Documento=" + Documento + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Monto=" + Monto + ", TipoTrabajador=" + TipoTrabajador + ", TipoCredito=" + TipoCredito + ", Trabajador=" + Trabajador + '}';
    }

    
    
}
    
