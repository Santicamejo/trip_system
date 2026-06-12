
package sistemaViajes;

import Test.Prueba;
import Test.Retorno;
import dominio.Categoria;

public class SistemaViajes {

    public static void main(String[] args) {
        Sistema s = new Sistema();
        Prueba p = new Prueba();
        juegodeprueba(s, p);
    }
    public static void juegodeprueba(Sistema s, Prueba p){
        s.inicializarSistema();
        int m1[][] = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        int m2[][] = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        int m3[][] = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        //Validación del método registrarPasajero
        p.ver(s.registrarPasajero("1.234.567-8", null, 25, Categoria.PLATINO).resultado, Retorno.Resultado.ERROR_1, "Algun parámetro no es válido.");
        p.ver(s.registrarPasajero("1234567", "Juan Pérez", 25, Categoria.PLATINO).resultado, Retorno.Resultado.ERROR_2, "Cédula no respeta el formato esperado.");
        p.ver(s.registrarPasajero("1.2.34.567-9", "Ana Pérez", 27, Categoria.PLATINO).resultado, Retorno.Resultado.ERROR_2, "Cédula no respeta el formato esperado.");
        p.ver(s.listarPasajerosAscendente().resultado, Retorno.Resultado.OK,s.listarPasajerosAscendente().getValorString());
        p.ver(s.registrarPasajero("1.234.567-9", "Ana Pérez", 27, Categoria.PLATINO).resultado, Retorno.Resultado.OK, "Persona registrada con éxito.");
        p.ver(s.registrarPasajero("1.234.567-8", "Juan Pérez", 25, Categoria.PLATINO).resultado, Retorno.Resultado.OK, "Persona registrada con éxito.");
        p.ver(s.listarPasajerosAscendente().resultado, Retorno.Resultado.OK,s.listarPasajerosAscendente().getValorString());
        p.ver(s.registrarPasajero("1.234.567-8", "Juan Pérez", 25, Categoria.PLATINO).resultado, Retorno.Resultado.ERROR_4, "Ya existe el pasajero Juan Pérez");
        p.ver(s.registrarPasajero("1.234.567-8", "Juan Barros", -25, Categoria.PLATINO).resultado, Retorno.Resultado.ERROR_3, "Edad incorrecta");
        
        //Validación del método buscarPasajero
        p.ver(s.buscarPasajero("1.234.567-8").resultado, Retorno.Resultado.OK, "Pasajero encontrado " + s.buscarPasajero("1.234.567-8").getValorString());
        p.ver(s.buscarPasajero("1234678").resultado, Retorno.Resultado.ERROR_1, "Formato inválido.");
        p.ver(s.buscarPasajero("9.999.999-9").resultado, Retorno.Resultado.ERROR_2, "No existe un pasajero registrado con esa cédula.");
        
        //Validación del método listarPasajerosAscendente
        p.ver(s.listarPasajerosAscendente().resultado, Retorno.Resultado.OK, "Listado ascendente de pasajeros: \n" + s.listarPasajerosAscendente().getValorString());
        
        //Validación del método listarPasajerosDescendente
        p.ver(s.listarPasajerosDescendente().resultado, Retorno.Resultado.OK, "Listado descendiente de pasajeros: \n" + s.listarPasajerosDescendente().getValorString());
        
        //Validación del método listarPasajerosPorCategoria
        p.ver(s.listarPasajerosPorCategoría(Categoria.PLATINO).resultado, Retorno.Resultado.OK, "Listado de pasajeros categoría PLATINO: \n" + s.listarPasajerosPorCategoría(Categoria.PLATINO).getValorString());
        
        //Validación del método registrarAeropuerto
        p.ver(s.registrarAeropuerto("001", "MVD").resultado, Retorno.Resultado.OK, "Se registra aeropuerto MVD 001");
        p.ver(s.registrarAeropuerto("002", "BSA").resultado, Retorno.Resultado.OK, "Se registra aeropuerto BSA 002");
        p.ver(s.registrarAeropuerto("003", "CHI").resultado, Retorno.Resultado.OK, "Se registra aeropuerto CHI 003");
        p.ver(s.registrarAeropuerto("002", null).resultado, Retorno.Resultado.ERROR_1, "Parámetros incorrectos");
        p.ver(s.registrarAeropuerto("001", "MVD").resultado, Retorno.Resultado.ERROR_2, "Ya existe el aeropuerto MVD 001");
        
        //Validación del método obtenerAeropuerto
        p.ver(s.obtenerAeropuerto("001").resultado, Retorno.Resultado.OK, "Aeropuerto: " + s.obtenerAeropuerto("001").getValorString());
        p.ver(s.obtenerAeropuerto(null).resultado, Retorno.Resultado.ERROR_1, "El parámetro no es válido.");
        p.ver(s.obtenerAeropuerto("999").resultado, Retorno.Resultado.ERROR_2, "No se encontró el aeropuerto 999");
        
        //Validación del método registrarVuelo
        p.ver(s.registrarVuelo("001", "002", "001", 5, 1000).resultado, Retorno.Resultado.OK, "Se registró el vuelo 001.");
        p.ver(s.registrarVuelo("001", "002", "001", 5, 1000).resultado, Retorno.Resultado.ERROR_5, "Ya existe el vuelo 001.");
        p.ver(s.registrarVuelo("003", "002", "002", 0, 1000).resultado, Retorno.Resultado.ERROR_1, "Algún parámetro no es válido.");
        p.ver(s.registrarVuelo("003", "002",null, 15, 1000).resultado, Retorno.Resultado.ERROR_2, "Algún parámetro está vacío.");
        p.ver(s.registrarVuelo("999", "002", "002", 10, 1000).resultado, Retorno.Resultado.ERROR_3, "No existe el aeropuerto de origen 999.");
        p.ver(s.registrarVuelo("003", "999", "002", 10, 1000).resultado, Retorno.Resultado.ERROR_3, "No existe el aeropuerto de destino 999.");
        p.ver(s.registrarVuelo("003", "002", "002", 10, 1000).resultado, Retorno.Resultado.OK, "Se registró el vuelo 002.");
        
        //Validación del método obtenerInformacionDeVuelo
        p.ver(s.obtenerInformacionDeVuelo("001").resultado, Retorno.Resultado.OK, "Información de vuelo: \n" + s.obtenerInformacionDeVuelo("001").getValorString());
        p.ver(s.obtenerInformacionDeVuelo(null).resultado, Retorno.Resultado.ERROR_1, "Código de vuelo vacío.");
        p.ver(s.obtenerInformacionDeVuelo("999").resultado, Retorno.Resultado.ERROR_2, "Código de vuelo no existe.");
        
        //Validación del método abrirVuelo
        p.ver(s.abrirVuelo("001").resultado, Retorno.Resultado.OK, "Se abre el vuelo 001.");
        p.ver(s.abrirVuelo(null).resultado, Retorno.Resultado.ERROR_1, "Código de vuelo vacío.");
        p.ver(s.abrirVuelo("999").resultado, Retorno.Resultado.ERROR_2, "Código de vuelo no existe.");
        p.ver(s.abrirVuelo("002").resultado, Retorno.Resultado.ERROR_3, "El vuelo 002 no está programado.");
        
        //Validación del método cerrarVuelo
        p.ver(s.cerrarVuelo("001").resultado, Retorno.Resultado.OK, "Se cierra el vuelo 001.");
        p.ver(s.cerrarVuelo(null).resultado, Retorno.Resultado.ERROR_1, "Código de vuelo vacío.");
        p.ver(s.cerrarVuelo("999").resultado, Retorno.Resultado.ERROR_2, "Código de vuelo no existe.");
        p.ver(s.cerrarVuelo("002").resultado, Retorno.Resultado.ERROR_3, "El vuelo 002 no está abierto.");
        
        //Validación del método realizarReserva
        p.ver(s.realizarReserva("001", "1.234.567-8").resultado, Retorno.Resultado.OK, "Se raliza la reserva: " + s.realizarReserva("001", "1.234.567-8").getValorString());
        p.ver(s.realizarReserva(null, "1.234.567-8").resultado, Retorno.Resultado.ERROR_1, "Algún parámetro está vacío.");
        
        p.imprimirResultadosPrueba();
    }
}
