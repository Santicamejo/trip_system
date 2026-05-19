package sistemaViajes;

//María Euugenia Artola - 367261

import Test.Retorno;
import dominio.Aeropuerto;
import dominio.Categoria;
import dominio.Clase;
import dominio.Estado;
import dominio.Pasajero;
import dominio.Vuelo;
import Estructura.Cola;
import Estructura.Lista;
import Estructura.Nodo;

public class Sistema implements ISistema {

    Lista<Aeropuerto> Aeropuertos;
    Lista<Vuelo> Vuelos;
    Lista<Pasajero> Pasajeros;
    
    
    @Override
    public Retorno inicializarSistema() {
        this.Aeropuertos = new Lista<>();
        this.Vuelos = new Lista<>();
        this.Pasajeros = new Lista<>();
        return Retorno.ok();
    }

    @Override
    public Retorno registrarPasajero(String cedula, String nombre, int edad, Categoria categoria) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno buscarPasajero(String cedula) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarPasajerosAscendente() {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarPasajerosDescendente() {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno listarPasajerosPorCategoría(Categoria unaCategoria) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno registrarAeropuerto(String codigo, String nombre) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno obtenerAeropuerto(String codigo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno registrarVuelo(String codigoAeropuertoOrigen, String codigoAeropuertoDestino, String codigoDeVuelo, int capacidad, int costoEnDolares) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno obtenerInformacionDeVuelo(String codigoDeVuelo) {
        return Retorno.noImplementada();
    }
    
    @Override
    public Retorno abrirVuelo(String codigoDeVuelo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno cerrarVuelo(String codigoDeVuelo) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno realizarReserva(String codigoDeVuelo, String cedula) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno realizarCheckIn(String codigoDeVuelo, String cedula) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno embarqueYDespegueDeVuelo(String codigoAeropuerto) {
        return Retorno.noImplementada();
    }

    @Override
    public Retorno consultaDisponibilidad(int[][] matriz, int cantidad, Clase unaClase) {
        return Retorno.noImplementada();
    } 

}
