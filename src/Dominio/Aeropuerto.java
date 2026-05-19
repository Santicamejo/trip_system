
package dominio;

import Estructura.Lista;

public class Aeropuerto {
    String Codigo;
    String Nombre;
    Lista<Vuelo> Vuelos;

    public Aeropuerto(String Codigo, String Nombre) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Vuelos = new Lista<>();
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

    public Lista<Vuelo> getVuelos() {
        return Vuelos;
    }

    public void setVuelos(Lista<Vuelo> Vuelos) {
        this.Vuelos = Vuelos;
    }
    
}
