
package dominio;

import Estructura.Lista;

public class Aeropuerto {
    String Codigo;
    String Nombre;
    Lista<Vuelo> EnEspera;
    Lista<Vuelo> EmbarqueYDespegue;

    public Aeropuerto(String Codigo, String Nombre) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.EnEspera = new Lista<>();
        this.EmbarqueYDespegue = new Lista<>();
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Lista<Vuelo> getEnEspera() {
        return EnEspera;
    }

    public void setEnEspera(Lista<Vuelo> EnEspera) {
        this.EnEspera = EnEspera;
    }

    public Lista<Vuelo> getEmbarqueYDespegue() {
        return EmbarqueYDespegue;
    }

    public void setEmbarqueYDespegue(Lista<Vuelo> EmbarqueYDespegue) {
        this.EmbarqueYDespegue = EmbarqueYDespegue;
    }
    
}
