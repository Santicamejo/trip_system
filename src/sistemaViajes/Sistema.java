package sistemaViajes;

//María Euugenia Artola - 367261

import Test.Retorno;
import dominio.Aeropuerto;
import dominio.Categoria;
import dominio.Clase;
import dominio.Estado;
import dominio.Pasajero;
import dominio.Vuelo;
import Estructura.Lista;
import Estructura.Nodo;

public class Sistema implements ISistema {

    private Lista<Aeropuerto> Aeropuertos;
    private Lista<Vuelo> Vuelos;
    private Lista<Pasajero> Pasajeros;
    
    //1
    @Override
    public Retorno inicializarSistema() {
        this.Aeropuertos = new Lista<>();
        this.Vuelos = new Lista<>();
        this.Pasajeros = new Lista<>();
        return Retorno.ok();
    }

    //2
    @Override
    public Retorno registrarPasajero(String cedula, String nombre, int edad, Categoria categoria) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        if(cedula == null || cedula.isEmpty() || nombre ==null || nombre.isEmpty()) {
            ret.setValorString("Los parámetros no pueden estar vacíos.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
            return ret;
        }
        if(!cedula.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-\\d")) {
            ret.setValorString("El formato de la cédula no es válido.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
            return ret;
        }
        if(edad < 0) {
            ret.setValorString("La edad no puede ser menor a 0.");
            ret.setResultado(Retorno.Resultado.ERROR_3);
            return ret;
        }
        Pasajero nuevo = new Pasajero(cedula, nombre, edad, categoria);
        if(Pasajeros.existe(cedula)) {
            ret.setValorString("Ya existe un pasajero con esa cédula.");
            ret.setResultado(Retorno.Resultado.ERROR_4);
        } else {
            Pasajeros.agregar(nuevo, cedula);
            ret.setValorString("Pasajero " + nombre + " creado con éxito.");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //3
    @Override
    public Retorno buscarPasajero(String cedula) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        if (!cedula.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-\\d")){
            ret.setValorString("El formato de la cédula no es válido.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else {
            Nodo<Pasajero> aux = Pasajeros.getInicio();
            while (aux != null) {
                if(aux.getValor().getCedula().equals(cedula)){
                    ret.setValorString(
                            aux.getValor().getCedula() + ";" + aux.getValor().getNombre() + ";" + 
                                    aux.getValor().getEdad() + ";" + aux.getValor().getCategoria());
                    ret.setResultado(Retorno.Resultado.OK);
                    return ret;
                }
                aux = aux.getSiguiente();
            }
            ret.setValorString("No existe un pasajero con la cédula buscada.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        }
        return ret;
    }

    //4
    @Override
    public Retorno listarPasajerosAscendente() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        ret.setValorString(Pasajeros.mostrar1());
        ret.setResultado(Retorno.Resultado.OK);
        return ret;
    }

    //5
    @Override
    public Retorno listarPasajerosDescendente() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        ret.setValorString(Pasajeros.mostrar2());
        ret.setResultado(Retorno.Resultado.OK);
        return ret;
    }

    //6
    @Override
    public Retorno listarPasajerosPorCategoría(Categoria unaCategoria) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        ret.setValorString(ordenarPorCategoria());
        ret.setResultado(Retorno.Resultado.OK);
        return ret;
    }

    //7
    @Override
    public Retorno registrarAeropuerto(String codigo, String nombre) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        Aeropuerto a = new Aeropuerto(codigo, nombre);
        if(codigo == null || codigo.isEmpty() ||nombre == null || nombre.isEmpty()){
            ret.setValorString("Los parámetros no pueden estar vacíos.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else if(!Aeropuertos.existe(codigo)){
            ret.setValorString("Ya existe un aeropuerto con ese código.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else {
            Aeropuertos.agregar(a, codigo);
            ret.setValorString("Aeropuerto " + nombre + " creado con éxito.");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //8
    @Override
    public Retorno obtenerAeropuerto(String codigo) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);;
        if(codigo == null || codigo.isEmpty()){
            ret.setValorString("El código no pueden estar vacío.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else {
            Nodo<Aeropuerto> aux = Aeropuertos.getInicio();
            while (aux != null) {
                if(aux.getValor().getCodigo().equals(codigo)){
                    ret.setValorString(aux.getValor().getCodigo() + ";" + aux.getValor().getNombre());
                    ret.setResultado(Retorno.Resultado.OK);
                    return ret;
                }
                aux = aux.getSiguiente();
            }
            ret.setValorString("No existe un aeropuerto con el código buscado.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        }
        return ret;
    }

    //9
    @Override
    public Retorno registrarVuelo(String codigoAeropuertoOrigen, String codigoAeropuertoDestino, String codigoDeVuelo, int capacidad, int costoEnDolares) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        Vuelo nuevo = new Vuelo(codigoAeropuertoOrigen, codigoAeropuertoDestino, codigoDeVuelo, capacidad, costoEnDolares);
        if(capacidad <= 0 || costoEnDolares <= 0){
            ret.setValorString("Los parámetros numéricos no pueden ser iguales o menores a 0.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else if(codigoAeropuertoOrigen == null|| codigoAeropuertoOrigen.isEmpty() || 
                codigoAeropuertoDestino == null|| codigoAeropuertoDestino.isEmpty() || 
                codigoDeVuelo == null|| codigoDeVuelo.isEmpty()){
            ret.setValorString("Los parámetros no pueden estar vacíos.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else if(!existeAeropuerto(codigoAeropuertoOrigen)){
            ret.setValorString("El aeropuerto de origen no éxiste.");
            ret.setResultado(Retorno.Resultado.ERROR_3);
        } else if(!existeAeropuerto(codigoAeropuertoDestino)){
            ret.setValorString("El aeropuerto de destino no éxiste.");
            ret.setResultado(Retorno.Resultado.ERROR_4);
        } else if(!Vuelos.existe(codigoDeVuelo)){
            ret.setValorString("Ya existe un vuelo con ese código.");
            ret.setResultado(Retorno.Resultado.ERROR_5);
        } else {
            Vuelos.agregarFinal(nuevo, codigoDeVuelo);
            ret.setValorString("Vuelo " + codigoDeVuelo + " creado con éxito.");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //10
    @Override
    public Retorno obtenerInformacionDeVuelo(String codigoDeVuelo) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        Nodo<Vuelo> v = obtenerNodoVuelo(codigoDeVuelo);
        if(codigoDeVuelo == null || codigoDeVuelo.isEmpty()){
            ret.setValorString("El código no puede estar vacío.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else if(v == null){
            ret.setValorString("No existe un vuelo con ese código.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else {
            ret.setValorString(
                    v.getValor().getCodigoAeropuertoOrigen() + ":" + v.getValor().getCodigoAeropuertoDestino() + ";" 
                    + v.getValor().getCodigoDeVuelo() + ";" + v.getValor().getCapacidad() + ";" + v.getValor().getCostoEnDolares() + ";"
                    + v.getValor().getEstado() + ";" + v.getValor().getReservas().getCantNodos() + ";" + v.getValor().getConfirmados());
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }
    
    //11
    @Override
    public Retorno abrirVuelo(String codigoDeVuelo) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);        
        Nodo<Vuelo> v = obtenerNodoVuelo(codigoDeVuelo);
        if(codigoDeVuelo == null || codigoDeVuelo.isEmpty()){
            ret.setValorString("El código no puede estar vacío.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else if(v == null){
            ret.setValorString("No existe un vuelo con ese código.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else if(!v.getValor().getEstado().equals(Estado.PROGRAMADO)){
            ret.setValorString("El vuelo no está en estado PROGRAMADO.");
            ret.setResultado(Retorno.Resultado.ERROR_3);
        } else {
            v.getValor().setEstado(Estado.ABIERTO);
            ret.setValorString("El vuelo está ABIERTO");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //12
    @Override
    public Retorno cerrarVuelo(String codigoDeVuelo) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        Vuelo v = obtenerVuelo(codigoDeVuelo);
        if(codigoDeVuelo == null || codigoDeVuelo.isEmpty()){
            ret.setValorString("El código no puede estar vacío.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else if(v == null){
            ret.setValorString("No existe un vuelo con ese código.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else if(!v.getEstado().equals(Estado.ABIERTO)){
            ret.setValorString("El vuelo no está en estado ABIERTO.");
            ret.setResultado(Retorno.Resultado.ERROR_3);
        } else {
            v.setEstado(Estado.CERRADO);
            Nodo<Aeropuerto> a = obtenerNodoAeropuerto(v.getCodigoAeropuertoOrigen());
            a.getValor().getEnEspera().agregarFinal(v, codigoDeVuelo);
            ret.setValorString("El vuelo está CERRADO");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //13
    @Override
    public Retorno realizarReserva(String codigoDeVuelo, String cedula) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        Nodo<Vuelo> v = obtenerNodoVuelo(codigoDeVuelo);
        Nodo<Pasajero> p = obtenerNodoPasajero(cedula);
        if(codigoDeVuelo ==  null || codigoDeVuelo.isEmpty() || cedula == null || cedula.isEmpty()){
            ret.setValorString("Los parámetros no pueden estar vacíos.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else if(!cedula.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-\\d")){
            ret.setValorString("El formato de la cédula no es válido.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else if(v == null){
            ret.setValorString("No existe un vuelo con el código " + codigoDeVuelo + ".");
            ret.setResultado(Retorno.Resultado.ERROR_3);
        } else if(p == null){
            ret.setValorString("No existe un pasajero con la cédula " + cedula + ".");
            ret.setResultado(Retorno.Resultado.ERROR_4);
        } else if (v.getValor().getEstado().equals(Estado.CERRADO) || v.getValor().getEstado().equals(Estado.FINALIZADO)){
            ret.setValorString("El vuelo no está habilitado para realizar reservas.");
            ret.setResultado(Retorno.Resultado.ERROR_5);
        } else if(v.getValor().getReservas().existe(p)){
            ret.setValorString("El pasajero ya tiene una reserva para este vuelo o realizó el check-in.");
            ret.setResultado(Retorno.Resultado.ERROR_6);
        } else if(v.getValor().getReservas().getCantNodos() == (v.getValor().getCapacidad()) * 1.1){
            ret.setValorString("Se alcanzó la capacidad máxima de reservas para el vuelo " + codigoDeVuelo + ".");
            ret.setResultado(Retorno.Resultado.ERROR_7);
        } else {
            v.getValor().getReservas().agregarFinal(obtenerPasajero(cedula), cedula);
            ret.setValorString("Reserva realizada con éxito.");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //14
    @Override
    public Retorno realizarCheckIn(String codigoDeVuelo, String cedula) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        Nodo<Vuelo> v = obtenerNodoVuelo(codigoDeVuelo);
        Nodo<Pasajero> p = obtenerNodoPasajero(cedula);
        if(codigoDeVuelo == null || codigoDeVuelo.isEmpty() || cedula == null || cedula.isEmpty()){
            ret.setValorString("Los parámetros no pueden estar vacíos.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        }  else if(!cedula.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-\\d")){
            ret.setValorString("El formato de la cédula no es válido.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else if(v == null){
            ret.setValorString("No existe un vuelo con el código " + codigoDeVuelo + ".");
            ret.setResultado(Retorno.Resultado.ERROR_3);
        } else if(p == null){
            ret.setValorString("No existe un pasajero con la cédula " + cedula + ".");
            ret.setResultado(Retorno.Resultado.ERROR_4);
        } else if(!v.getValor().getEstado().equals(Estado.ABIERTO)){
            ret.setValorString("El vuelo no está en estado ABIERTO.");
            ret.setResultado(Retorno.Resultado.ERROR_5);
        } else if(!v.getValor().getReservas().existe(p)){
            ret.setValorString("El pasajero no tiene una reserva para este vuelo.");
            ret.setResultado(Retorno.Resultado.ERROR_6);
        } else if(v.getValor().getConfirmados().existe(p)){
            ret.setValorString("El pasajero ya realizó el check-in para este vuelo.");
            ret.setResultado(Retorno.Resultado.ERROR_7);
        } else if(v.getValor().getConfirmados().getCantNodos() == v.getValor().getCapacidad()){
            ret.setValorString("El vuelo alcanzó su capacidad máxima.");
            ret.setResultado(Retorno.Resultado.ERROR_8);
        } else {
             v.getValor().getConfirmados().agregarFinal(obtenerPasajero(cedula), cedula);
            ret.setValorString("Check-in realizado con éxito.");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //15
    @Override
    public Retorno embarqueYDespegueDeVuelo(String codigoAeropuerto) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        Nodo<Aeropuerto> a = obtenerNodoAeropuerto(codigoAeropuerto);
        
        if(codigoAeropuerto == null || codigoAeropuerto.isEmpty()){
            ret.setValorString("El código no puede estar vacío.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
        } else if(a == null){
            ret.setValorString("No existe un aeropuerto con el código " + codigoAeropuerto + ".");
            ret.setResultado(Retorno.Resultado.ERROR_2);
        } else if(a.getValor().getEnEspera().esVacia()){
            ret.setValorString("No hay vuelos esperando embarque.");
            ret.setResultado(Retorno.Resultado.ERROR_3);
        } else {
            Vuelo v = obtenerVuelo(codigoAeropuerto);
            v.setEstado(Estado.FINALIZADO);
            a.getValor().getEnEspera().borrarInicio();
            a.getValor().getEmbarqueYDespegue().agregarFinal(v, codigoAeropuerto);
            ret.setValorString("Vuelo " + v.getCodigoDeVuelo() + " embarcado.");
            ret.setResultado(Retorno.Resultado.OK);
        }
        return ret;
    }

    //16
    @Override
    public Retorno consultaDisponibilidad(int[][] matriz, int cantidad, Clase unaClase) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        if(cantidad <= 0){
            ret.setValorString("La cantidad no puede ser menor o igual a 0.");
            ret.setResultado(Retorno.Resultado.ERROR_1);
            return ret;
        }
        if(matriz == null){
            ret.setValorString("La matriz no puede ser nula.");
            ret.setResultado(Retorno.Resultado.ERROR_2);
            return ret;
        }
        int columnaI = 0, columnaF = 0;
        if(unaClase.equals(Clase.TURISTA)){
            columnaI = 7;
            columnaF = 25;
        }
        if(unaClase.equals(Clase.EJECUTIVA)){
            columnaI = 3;
            columnaF = 6;
        }
        if(unaClase.equals(Clase.PRIMERA)){
            columnaI = 0;
            columnaF = 2;
        }
        int filas = matriz.length;
        int opciones = 0;
        boolean disponible = true;
        String posible = "";
        String asientos = "";
        for(int c = columnaI; c <= columnaF; c++){
            for(int f = 0; f <= filas - cantidad; f++){
                int numero = c + 1;
                disponible = true;
                posible = "";
                for(int k = 0; k < cantidad; k++){
                    char letra = (char)('A' + (f + k));
                    if(matriz[f + k][c] != 0){
                        disponible = false;
                        break;
                    }
                    if(k > 0) posible += "-";
                    posible += letra + "" + numero;
                }
                if(disponible){
                    if(opciones > 0) asientos += "|";
                    opciones++;
                    asientos += posible;
                }
            }
        }
        ret.setValorEntero(opciones);
        ret.setValorString(asientos);
        ret.setResultado(Retorno.Resultado.OK);
        return ret;
    } 
    
    
    /*----------------------------------------
    ----------Métodos private extras----------
    ----------------------------------------*/

    private String ordenarPorCategoria(){
        String platino = "Platino: \n";
        String frecuente = "Frecuente: \n";
        String estandar = "Estándar: \n";
        String esporadico = "Esporádico: \n";
        Nodo<Pasajero> aux = Pasajeros.getInicio();
        while (aux != null) {
            if(aux.getValor().getCategoria().equals(Categoria.PLATINO)) platino += aux.getValor().getNombre() + "\n";
            if(aux.getValor().getCategoria().equals(Categoria.FRECUENTE)) frecuente += aux.getValor().getNombre() + "\n";
            if(aux.getValor().getCategoria().equals(Categoria.ESTANDAR)) estandar += aux.getValor().getNombre() + "\n";
            if(aux.getValor().getCategoria().equals(Categoria.ESPORADICO)) esporadico += aux.getValor().getNombre() + "\n";
            aux = aux.getSiguiente();
        }
        String lista = "Pasajeros por categoría \n ------------------------------ \n"
                + platino + "\n ------------------------------ \n"
                + frecuente + "\n ------------------------------ \n"
                + estandar + "\n ------------------------------ \n"
                + esporadico;
        return lista.trim();
    }
    
    private boolean existeAeropuerto(String codigo){
        Nodo<Aeropuerto> aux = Aeropuertos.getInicio();
        while(aux != null){
            if(aux.getValor().getCodigo().equals(codigo)) return true;
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    private Nodo<Vuelo> obtenerNodoVuelo(String codigo){
        Nodo<Vuelo> aux = Vuelos.getInicio();
        while(aux != null){
            if(aux.getValor().getCodigoDeVuelo().equals(codigo))return aux;
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    private Nodo<Pasajero> obtenerNodoPasajero(String cedula){
        Nodo<Pasajero> aux = Pasajeros.getInicio();
        while(aux != null){
            if(aux.getValor().getCedula().equals(cedula))return aux;
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    private Nodo<Aeropuerto> obtenerNodoAeropuerto(String codigo){
        Nodo<Aeropuerto> aux = Aeropuertos.getInicio();
        while(aux != null){
            if(aux.getValor().getCodigo().equals(codigo))return aux;
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    private Pasajero obtenerPasajero(String cedula){
        Nodo<Pasajero> aux = Pasajeros.getInicio();
        while(aux != null){
            if(aux.getValor().getCedula().equals(cedula)) 
                return new Pasajero(cedula, aux.getValor().getNombre(), aux.getValor().getEdad(), aux.getValor().getCategoria());
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    private Vuelo obtenerVuelo(String codigo){
        Nodo<Vuelo> aux = Vuelos.getInicio();
        while(aux != null){
            if(aux.getValor().getCodigoDeVuelo().equals(codigo)) 
                return new Vuelo(aux.getValor().getCodigoAeropuertoOrigen(), aux.getValor().getCodigoAeropuertoDestino(), 
                        codigo, aux.getValor().getCapacidad(), aux.getValor().getCostoEnDolares());
            aux = aux.getSiguiente();
        }
        return null;
    }
}

