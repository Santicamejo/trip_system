
package dominio;

import Estructura.Lista;
import Test.Retorno;

public class Vuelo {
    String CodigoAeropuertoOrigen;
    String CodigoAeropuertoDestino;
    String CodigoDeVuelo;
    double Capacidad;
    int CostoEnDolares;
    Estado Estado;
    Lista<Pasajero> Reservas;
    Lista<Pasajero> Confirmados;
    


    public Vuelo(String CodigoAeropuertoOrigen, String CodigoAeropuertoDestino, String CodigoDeVuelo, int Capacidad, int CostoEnDolares) {
        this.CodigoAeropuertoOrigen = CodigoAeropuertoOrigen;
        this.CodigoAeropuertoDestino = CodigoAeropuertoDestino;
        this.CodigoDeVuelo = CodigoDeVuelo;
        this.Capacidad = Capacidad;
        this.CostoEnDolares = CostoEnDolares;
        this.Estado = Estado.PROGRAMADO;
        this.Reservas = new Lista<>();
        this.Confirmados = new Lista<>();
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

    public double getCapacidad() {
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
    
    public Estado getEstado() {
        return Estado;
    }

    public void setEstado(Estado Estado) {
        this.Estado = Estado;
    }

    public Lista<Pasajero> getReservas() {
        return Reservas;
    }

    public Lista<Pasajero> getConfirmados() {
        return Confirmados;
    }

    public void setConfirmados(Lista<Pasajero> Confirmados) {
        this.Confirmados = Confirmados;
    }

    public void setReservas(Lista<Pasajero> Reservas) {
        this.Reservas = Reservas;
    }
    
    public void abrirVuelo(){
        setEstado(Estado.ABIERTO);
    }
    
    public void cerrarVuelo(){
        setEstado(Estado.CERRADO);
    }
    
}
