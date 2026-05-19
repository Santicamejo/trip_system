
package dominio;

import Estructura.Lista;
import Test.Retorno;

public class Vuelo {
    String CodigoAeropuertoOrigen;
    String CodigoAeropuertoDestino;
    String CodigoDeVuelo;
    int Capacidad;
    int CostoEnDolares;
    Estado Estado;
    Lista<Pasajero> Pasajeros;

    public Vuelo(String CodigoAeropuertoOrigen, String CodigoAeropuertoDestino, String CodigoDeVuelo, int Capacidad, int CostoEnDolares) {
        this.CodigoAeropuertoOrigen = CodigoAeropuertoOrigen;
        this.CodigoAeropuertoDestino = CodigoAeropuertoDestino;
        this.CodigoDeVuelo = CodigoDeVuelo;
        this.Capacidad = Capacidad;
        this.CostoEnDolares = CostoEnDolares;
        this.Estado = Estado.PROGRAMADO;
        this.Pasajeros = new Lista<>();
    }

    public String getCodigoAeropuertoOrigen() {
        return CodigoAeropuertoOrigen;
    }

    public void setCodigoAeropuertoOrigen(String CodigoAeropuertoOrigen) {
        this.CodigoAeropuertoOrigen = CodigoAeropuertoOrigen;
    }

    public String getCodigoAeropuertoDestino() {
        return CodigoAeropuertoDestino;
    }

    public void setCodigoAeropuertoDestino(String CodigoAeropuertoDestino) {
        this.CodigoAeropuertoDestino = CodigoAeropuertoDestino;
    }

    public String getCodigoDeVuelo() {
        return CodigoDeVuelo;
    }

    public void setCodigoDeVuelo(String CodigoDeVuelo) {
        this.CodigoDeVuelo = CodigoDeVuelo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getCostoEnDolares() {
        return CostoEnDolares;
    }

    public void setCostoEnDolares(int CostoEnDolares) {
        this.CostoEnDolares = CostoEnDolares;
    }

    public Lista<Pasajero> getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(Lista<Pasajero> Pasajeros) {
        this.Pasajeros = Pasajeros;
    }
    
    public Retorno abrirVuelo(String codigoDeVuelo){
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        this.Estado = Estado.ABIERTO;
        ret.ok("El vuelo " + codigoDeVuelo + "está abierto.");
        return ret;
    }
    
    public Retorno cerrarVuelo(String codigoDeVuelo){
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        this.Estado = Estado.CERRADO;
        ret.ok("El vuelo " + codigoDeVuelo + "está cerrado.");
        return ret;
    }
    
}
