
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
        System.out.println("----------------------------");
        System.out.println("-----Registrar Pasajero-----");
        System.out.println("----------------------------");
        
        Retorno r1_1 = s.registrarPasajero("1.234.567-8", null, 25, Categoria.PLATINO);
        Retorno r1_2 = s.registrarPasajero("", "Juan", 20, Categoria.PLATINO);
        Retorno r1_3 = s.registrarPasajero(null, "Juan", 20, Categoria.PLATINO);
        Retorno r1_4 = s.registrarPasajero("4.123.456-7", "", 20, Categoria.PLATINO);
        Retorno r1_5 = s.registrarPasajero("12345678", "Juan", 20, Categoria.PLATINO);
        Retorno r1_6 = s.registrarPasajero("4.123.456-7", "Juan", -1, Categoria.PLATINO);
        Retorno r1_7 = s.registrarPasajero("4.123.456-7", "Juan", 20, Categoria.PLATINO);
        Retorno r1_8 = s.registrarPasajero("4.123.456-7", "Juan", 20, Categoria.PLATINO);
        Retorno r1_9 = s.registrarPasajero("5.123.456-7", "Ana", 18, Categoria.FRECUENTE);
        Retorno r1_10 = s.registrarPasajero("6.123.456-7", "Pedro", 50, Categoria.ESTANDAR);
        Retorno r1_11 = s.registrarPasajero("7.123.456-7", "Luis", 30, Categoria.ESPORADICO);
        Retorno r1_12 = s.registrarPasajero("8.123.456-7", "Mario", 0, Categoria.PLATINO);
        Retorno r1_13 = s.registrarPasajero("9.123.456-7", "Jose", 1, Categoria.PLATINO);
        Retorno r1_14 = s.registrarPasajero("1.111.111-1", "A", 10, Categoria.PLATINO);
        Retorno r1_15 = s.registrarPasajero("2.222.222-2", "Nombre Largo Largo", 40, Categoria.PLATINO);
        Retorno r1_16 = s.registrarPasajero("3.333.333-3", "Carlos", 99, Categoria.PLATINO);
        Retorno r1_17 = s.registrarPasajero("4.444.444-4", "Lucia", 35, Categoria.FRECUENTE);
        Retorno r1_18 = s.registrarPasajero("5.555.555-5", "Martin", 35, Categoria.ESTANDAR);
        Retorno r1_19 = s.registrarPasajero("6.666.666-6", "Julia", 35, Categoria.ESPORADICO);
        Retorno r1_20 = s.registrarPasajero("7.777.777-7", "Bruno", 35, Categoria.PLATINO);
        Retorno r1_21 = s.registrarPasajero("8.888.888-8", "Micaela", 35, Categoria.PLATINO);

        p.ver(r1_1.resultado, Retorno.Resultado.ERROR_1, "registro pasajero: " + r1_1.getValorString());
        p.ver(r1_2.resultado, Retorno.Resultado.ERROR_1, "registro pasajero: " + r1_2.getValorString());
        p.ver(r1_3.resultado, Retorno.Resultado.ERROR_1, "registro pasajero: " + r1_3.getValorString());
        p.ver(r1_4.resultado, Retorno.Resultado.ERROR_1, "registro pasajero: " + r1_4.getValorString());
        p.ver(r1_5.resultado, Retorno.Resultado.ERROR_2, "registro pasajero: " + r1_5.getValorString());
        p.ver(r1_6.resultado, Retorno.Resultado.ERROR_3, "registro pasajero: " + r1_6.getValorString());
        p.ver(r1_7.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_7.getValorString());
        p.ver(r1_8.resultado, Retorno.Resultado.ERROR_4, "registro pasajero: " + r1_8.getValorString());
        p.ver(r1_9.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_9.getValorString());
        p.ver(r1_10.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_10.getValorString());
        p.ver(r1_11.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_11.getValorString());
        p.ver(r1_12.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_12.getValorString());
        p.ver(r1_13.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_13.getValorString());
        p.ver(r1_14.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_14.getValorString());
        p.ver(r1_15.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_15.getValorString());
        p.ver(r1_16.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_16.getValorString());
        p.ver(r1_17.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_17.getValorString());
        p.ver(r1_18.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_18.getValorString());
        p.ver(r1_19.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_19.getValorString());
        p.ver(r1_20.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_20.getValorString());
        p.ver(r1_21.resultado, Retorno.Resultado.OK, "registro pasajero: " + r1_21.getValorString());
        
        //Validación del método buscarPasajero
        System.out.println("-------------------------");
        System.out.println("-----Buscar Pasajero-----");
        System.out.println("-------------------------");
        
        Retorno r2_1 = s.buscarPasajero("12345678");
        Retorno r2_2 = s.buscarPasajero("1");
        Retorno r2_3 = s.buscarPasajero("AA.BBB.CCC-D");
        Retorno r2_4 = s.buscarPasajero("9.999.999-9");
        Retorno r2_5 = s.buscarPasajero("4.123.456-7");
        Retorno r2_6 = s.buscarPasajero("5.123.456-7");
        Retorno r2_7 = s.buscarPasajero("6.123.456-7");
        Retorno r2_8 = s.buscarPasajero("7.123.456-7");
        Retorno r2_9 = s.buscarPasajero("8.123.456-7");
        Retorno r2_10 = s.buscarPasajero("9.123.456-7");
        Retorno r2_11 = s.buscarPasajero("1.111.111-1");
        Retorno r2_12 = s.buscarPasajero("2.222.222-2");
        Retorno r2_13 = s.buscarPasajero("3.333.333-3");
        Retorno r2_14 = s.buscarPasajero("4.444.444-4");
        Retorno r2_15 = s.buscarPasajero("5.555.555-5");
        Retorno r2_16 = s.buscarPasajero("6.666.666-6");
        Retorno r2_17 = s.buscarPasajero("7.777.777-7");
        Retorno r2_18 = s.buscarPasajero("8.888.888-8");
        Retorno r2_19 = s.buscarPasajero("1.234.567-8");
        Retorno r2_20 = s.buscarPasajero("0.000.000-0");

        p.ver(r2_1.resultado, Retorno.Resultado.ERROR_1, "buscar pasajero: " + r2_1.getValorString());
        p.ver(r2_2.resultado, Retorno.Resultado.ERROR_1, "buscar pasajero: " + r2_2.getValorString());
        p.ver(r2_3.resultado, Retorno.Resultado.ERROR_1, "buscar pasajero: " + r2_3.getValorString());
        p.ver(r2_4.resultado, Retorno.Resultado.ERROR_2, "buscar pasajero: " + r2_4.getValorString());
        p.ver(r2_5.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_5.getValorString());
        p.ver(r2_6.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_6.getValorString());
        p.ver(r2_7.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_7.getValorString());
        p.ver(r2_8.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_8.getValorString());
        p.ver(r2_9.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_9.getValorString());
        p.ver(r2_10.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_10.getValorString());
        p.ver(r2_11.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_11.getValorString());
        p.ver(r2_12.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_12.getValorString());
        p.ver(r2_13.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_13.getValorString());
        p.ver(r2_14.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_14.getValorString());
        p.ver(r2_15.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_15.getValorString());
        p.ver(r2_16.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_16.getValorString());
        p.ver(r2_17.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_17.getValorString());
        p.ver(r2_18.resultado, Retorno.Resultado.OK, "buscar pasajero: " + r2_18.getValorString());
        p.ver(r2_19.resultado, Retorno.Resultado.ERROR_2, "buscar pasajero: " + r2_19.getValorString());
        p.ver(r2_20.resultado, Retorno.Resultado.ERROR_2, "buscar pasajero: " + r2_20.getValorString());
        
        //Validación del método listarPasajerosAscendente
        System.out.println("-------------------------------------");
        System.out.println("-----Listar Pasajeros Ascendente-----");
        System.out.println("-------------------------------------");
        
        Retorno r3 = s.listarPasajerosAscendente();
        p.ver(r3.resultado, Retorno.Resultado.OK, "Listado ascendente de pasajeros: \n" + r3.getValorString());
        
        //Validación del método listarPasajerosDescendente
        System.out.println("--------------------------------------");
        System.out.println("-----Listar Pasajeros Descendente-----");
        System.out.println("--------------------------------------");
        
        Retorno r4 = s.listarPasajerosDescendente();
        p.ver(r4.resultado, Retorno.Resultado.OK, "Listado descendiente de pasajeros: \n" + r4.getValorString());
        
        //Validación del método listarPasajerosPorCategoria
        System.out.println("----------------------------------------");
        System.out.println("-----Listar Pasajeros Por Categoria-----");
        System.out.println("----------------------------------------");
        
        Retorno r5_1 = s.listarPasajerosPorCategoría(Categoria.ESPORADICO);
        Retorno r5_2 = s.listarPasajerosPorCategoría(Categoria.ESTANDAR);
        Retorno r5_3 = s.listarPasajerosPorCategoría(Categoria.FRECUENTE);
        Retorno r5_4 = s.listarPasajerosPorCategoría(Categoria.PLATINO);
        p.ver(r5_1.resultado, Retorno.Resultado.OK, "Listado de pasajeros categoría ESPORADICO: \n" + r5_1.getValorString());
        p.ver(r5_2.resultado, Retorno.Resultado.OK, "Listado de pasajeros categoría ESTANDAR: \n" + r5_2.getValorString());
        p.ver(r5_3.resultado, Retorno.Resultado.OK, "Listado de pasajeros categoría FRECUENTE: \n" + r5_3.getValorString());
        p.ver(r5_4.resultado, Retorno.Resultado.OK, "Listado de pasajeros categoría PLATINO: \n" + r5_4.getValorString());
        
        //Validación del método registrarAeropuerto
        System.out.println("------------------------------");
        System.out.println("-----Registrar Aeropuerto-----");
        System.out.println("------------------------------");
        
        Retorno r7_1 = s.registrarAeropuerto(null, "Carrasco");
        Retorno r7_2 = s.registrarAeropuerto("", "Carrasco");
        Retorno r7_3 = s.registrarAeropuerto("MVDX", null);
        Retorno r7_4 = s.registrarAeropuerto("MVDX", "");
        Retorno r7_5 = s.registrarAeropuerto("MVD", "Carrasco");
        Retorno r7_6 = s.registrarAeropuerto("EZE", "Ezeiza");
        Retorno r7_7 = s.registrarAeropuerto("GRU", "Guarulhos");
        Retorno r7_8 = s.registrarAeropuerto("JFK", "John Kennedy");
        Retorno r7_9 = s.registrarAeropuerto("LAX", "Los Angeles");
        Retorno r7_10 = s.registrarAeropuerto("MAD", "Barajas");
        Retorno r7_11 = s.registrarAeropuerto("BCN", "Barcelona");
        Retorno r7_12 = s.registrarAeropuerto("CDG", "Charles de Gaulle");
        Retorno r7_13 = s.registrarAeropuerto("FCO", "Roma");
        Retorno r7_14 = s.registrarAeropuerto("MVD", "Duplicado");
        Retorno r7_15 = s.registrarAeropuerto("AMS", "Amsterdam");
        Retorno r7_16 = s.registrarAeropuerto("LHR", "Heathrow");
        Retorno r7_17 = s.registrarAeropuerto("SCL", "Santiago");
        Retorno r7_18 = s.registrarAeropuerto("BOG", "Bogota");
        Retorno r7_19 = s.registrarAeropuerto("LIM", "Lima");
        Retorno r7_20 = s.registrarAeropuerto("PTY", "Panama");

        p.ver(r7_1.resultado, Retorno.Resultado.ERROR_1, "registro aeropuerto: " + r7_1.getValorString());
        p.ver(r7_2.resultado, Retorno.Resultado.ERROR_1, "registro aeropuerto: " + r7_2.getValorString());
        p.ver(r7_3.resultado, Retorno.Resultado.ERROR_1, "registro aeropuerto: " + r7_3.getValorString());
        p.ver(r7_4.resultado, Retorno.Resultado.ERROR_1, "registro aeropuerto: " + r7_4.getValorString());
        p.ver(r7_5.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_5.getValorString());
        p.ver(r7_6.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_6.getValorString());
        p.ver(r7_7.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_7.getValorString());
        p.ver(r7_8.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_8.getValorString());
        p.ver(r7_9.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_9.getValorString());
        p.ver(r7_10.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_10.getValorString());
        p.ver(r7_11.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_11.getValorString());
        p.ver(r7_12.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_12.getValorString());
        p.ver(r7_13.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_13.getValorString());
        p.ver(r7_14.resultado, Retorno.Resultado.ERROR_2, "registro aeropuerto: " + r7_14.getValorString());
        p.ver(r7_15.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_15.getValorString());
        p.ver(r7_16.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_16.getValorString());
        p.ver(r7_17.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_17.getValorString());
        p.ver(r7_18.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_18.getValorString());
        p.ver(r7_19.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_19.getValorString());
        p.ver(r7_20.resultado, Retorno.Resultado.OK, "registro aeropuerto: " + r7_20.getValorString());

        //Validación del método obtenerAeropuerto
        System.out.println("----------------------------");
        System.out.println("-----Obtener Aeropuerto-----");
        System.out.println("----------------------------");
        
        //Validación del método obtenerAeropuerto
        Retorno r8_1 = s.obtenerAeropuerto(null);
        Retorno r8_2 = s.obtenerAeropuerto("");
        Retorno r8_3 = s.obtenerAeropuerto("XXX");
        Retorno r8_4 = s.obtenerAeropuerto("AAA");
        Retorno r8_5 = s.obtenerAeropuerto("123");
        Retorno r8_6 = s.obtenerAeropuerto("MVD");
        Retorno r8_7 = s.obtenerAeropuerto("EZE");
        Retorno r8_8 = s.obtenerAeropuerto("GRU");
        Retorno r8_9 = s.obtenerAeropuerto("JFK");
        Retorno r8_10 = s.obtenerAeropuerto("LAX");
        Retorno r8_11 = s.obtenerAeropuerto("MAD");
        Retorno r8_12 = s.obtenerAeropuerto("BCN");
        Retorno r8_13 = s.obtenerAeropuerto("CDG");
        Retorno r8_14 = s.obtenerAeropuerto("FCO");
        Retorno r8_15 = s.obtenerAeropuerto("AMS");
        Retorno r8_16 = s.obtenerAeropuerto("LHR");
        Retorno r8_17 = s.obtenerAeropuerto("SCL");
        Retorno r8_18 = s.obtenerAeropuerto("BOG");
        Retorno r8_19 = s.obtenerAeropuerto("LIM");
        Retorno r8_20 = s.obtenerAeropuerto("PTY");
        
        p.ver(r8_1.resultado, Retorno.Resultado.ERROR_1, "obtener aeropuerto: " + r8_1.getValorString());
        p.ver(r8_2.resultado, Retorno.Resultado.ERROR_1, "obtener aeropuerto: " + r8_2.getValorString());
        p.ver(r8_3.resultado, Retorno.Resultado.ERROR_2, "obtener aeropuerto: " + r8_3.getValorString());
        p.ver(r8_4.resultado, Retorno.Resultado.ERROR_2, "obtener aeropuerto: " + r8_4.getValorString());
        p.ver(r8_5.resultado, Retorno.Resultado.ERROR_2, "obtener aeropuerto: " + r8_5.getValorString());
        p.ver(r8_6.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_6.getValorString());
        p.ver(r8_7.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_7.getValorString());
        p.ver(r8_8.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_8.getValorString());
        p.ver(r8_9.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_9.getValorString());
        p.ver(r8_10.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_10.getValorString());
        p.ver(r8_11.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_11.getValorString());
        p.ver(r8_12.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_12.getValorString());
        p.ver(r8_13.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_13.getValorString());
        p.ver(r8_14.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_14.getValorString());
        p.ver(r8_15.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_15.getValorString());
        p.ver(r8_16.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_16.getValorString());
        p.ver(r8_17.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_17.getValorString());
        p.ver(r8_18.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_18.getValorString());
        p.ver(r8_19.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_19.getValorString());
        p.ver(r8_20.resultado, Retorno.Resultado.OK, "obtener aeropuerto: " + r8_20.getValorString());

        //Validación del método registrarVuelo
        System.out.println("-------------------------");
        System.out.println("-----Registrar Vuelo-----");
        System.out.println("-------------------------");
        
        Retorno r9_1 = s.registrarVuelo("MVD", "EZE", "AR100", 0, 100);
        Retorno r9_2 = s.registrarVuelo("MVD", "EZE", "AR101", -1, 100);
        Retorno r9_3 = s.registrarVuelo("MVD", "EZE", "AR102", 10, 0);
        Retorno r9_4 = s.registrarVuelo("MVD", "EZE", "AR103", 10, -50);
        Retorno r9_5 = s.registrarVuelo("", "EZE", "AR104", 10, 100);
        Retorno r9_6 = s.registrarVuelo("MVD", "", "AR105", 10, 100);
        Retorno r9_7 = s.registrarVuelo("MVD", "EZE", "", 10, 100);
        Retorno r9_8 = s.registrarVuelo("XXX", "EZE", "AR106", 10, 100);
        Retorno r9_9 = s.registrarVuelo("MVD", "YYY", "AR107", 10, 100);
        Retorno r9_10 = s.registrarVuelo("XXX", "YYY", "AR108", 10, 100);
        Retorno r9_11 = s.registrarVuelo("MVD", "EZE", "AR100", 100, 200);
        Retorno r9_12 = s.registrarVuelo("EZE", "GRU", "AR200", 150, 300);
        Retorno r9_13 = s.registrarVuelo("GRU", "JFK", "AR300", 200, 500);
        Retorno r9_14 = s.registrarVuelo("JFK", "LAX", "AR400", 180, 250);
        Retorno r9_15 = s.registrarVuelo("LAX", "MAD", "AR500", 1, 1);
        Retorno r9_16 = s.registrarVuelo("MAD", "BCN", "AR600", 999, 9999);
        Retorno r9_17 = s.registrarVuelo("BCN", "CDG", "AR700", 50, 120);
        Retorno r9_18 = s.registrarVuelo("CDG", "FCO", "AR800", 60, 130);
        Retorno r9_19 = s.registrarVuelo("FCO", "AMS", "AR900", 70, 140);
        Retorno r9_20 = s.registrarVuelo("AMS", "LHR", "AR1000", 80, 150);
        Retorno r9_21 = s.registrarVuelo("MVD", "EZE", "AR100", 20, 100);
        
        p.ver(r9_1.resultado, Retorno.Resultado.ERROR_1, "registrar vuelo: " + r9_1.getValorString());
        p.ver(r9_2.resultado, Retorno.Resultado.ERROR_1, "registrar vuelo: " + r9_2.getValorString());
        p.ver(r9_3.resultado, Retorno.Resultado.ERROR_1, "registrar vuelo: " + r9_3.getValorString());
        p.ver(r9_4.resultado, Retorno.Resultado.ERROR_1, "registrar vuelo: " + r9_4.getValorString());
        p.ver(r9_5.resultado, Retorno.Resultado.ERROR_2, "registrar vuelo: " + r9_5.getValorString());
        p.ver(r9_6.resultado, Retorno.Resultado.ERROR_2, "registrar vuelo: " + r9_6.getValorString());
        p.ver(r9_7.resultado, Retorno.Resultado.ERROR_2, "registrar vuelo: " + r9_7.getValorString());
        p.ver(r9_8.resultado, Retorno.Resultado.ERROR_3, "registrar vuelo: " + r9_8.getValorString());
        p.ver(r9_9.resultado, Retorno.Resultado.ERROR_4, "registrar vuelo: " + r9_9.getValorString());
        p.ver(r9_10.resultado, Retorno.Resultado.ERROR_3, "registrar vuelo: " + r9_10.getValorString());
        p.ver(r9_11.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_11.getValorString());
        p.ver(r9_12.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_12.getValorString());
        p.ver(r9_13.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_13.getValorString());
        p.ver(r9_14.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_14.getValorString());
        p.ver(r9_15.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_15.getValorString());
        p.ver(r9_16.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_16.getValorString());
        p.ver(r9_17.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_17.getValorString());
        p.ver(r9_18.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_18.getValorString());
        p.ver(r9_19.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_19.getValorString());
        p.ver(r9_20.resultado, Retorno.Resultado.OK, "registrar vuelo: " + r9_20.getValorString());
        p.ver(r9_21.resultado, Retorno.Resultado.ERROR_5, "registrar vuelo: " + r9_21.getValorString());

        //Validación del método obtenerInformacionDeVuelo
        System.out.println("--------------------------------------");
        System.out.println("-----Obtener Informacion De Vuelo-----");
        System.out.println("--------------------------------------");
        
        Retorno r10_1 = s.obtenerInformacionDeVuelo(null);
        Retorno r10_2 = s.obtenerInformacionDeVuelo("");
        Retorno r10_3 = s.obtenerInformacionDeVuelo("XXX");
        Retorno r10_4 = s.obtenerInformacionDeVuelo("AR9999");
        Retorno r10_5 = s.obtenerInformacionDeVuelo("AR100");
        Retorno r10_6 = s.obtenerInformacionDeVuelo("AR200");
        Retorno r10_7 = s.obtenerInformacionDeVuelo("AR300");
        Retorno r10_8 = s.obtenerInformacionDeVuelo("AR400");
        Retorno r10_9 = s.obtenerInformacionDeVuelo("AR500");
        Retorno r10_10 = s.obtenerInformacionDeVuelo("AR600");
        Retorno r10_11 = s.obtenerInformacionDeVuelo("AR700");
        Retorno r10_12 = s.obtenerInformacionDeVuelo("AR800");
        Retorno r10_13 = s.obtenerInformacionDeVuelo("AR900");
        Retorno r10_14 = s.obtenerInformacionDeVuelo("AR1000");
        Retorno r10_15 = s.obtenerInformacionDeVuelo("AR100");
        Retorno r10_16 = s.obtenerInformacionDeVuelo("AR200");
        Retorno r10_17 = s.obtenerInformacionDeVuelo("AR300");
        Retorno r10_18 = s.obtenerInformacionDeVuelo("AR400");
        Retorno r10_19 = s.obtenerInformacionDeVuelo("AR500");
        Retorno r10_20 = s.obtenerInformacionDeVuelo("AR600");
        
        p.ver(r10_1.resultado, Retorno.Resultado.ERROR_1, "obtener vuelo: " + r10_1.getValorString());
        p.ver(r10_2.resultado, Retorno.Resultado.ERROR_1, "obtener vuelo: " + r10_2.getValorString());
        p.ver(r10_3.resultado, Retorno.Resultado.ERROR_2, "obtener vuelo: " + r10_3.getValorString());
        p.ver(r10_4.resultado, Retorno.Resultado.ERROR_2, "obtener vuelo: " + r10_4.getValorString());
        p.ver(r10_5.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_5.getValorString());
        p.ver(r10_6.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_6.getValorString());
        p.ver(r10_7.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_7.getValorString());
        p.ver(r10_8.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_8.getValorString());
        p.ver(r10_9.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_9.getValorString());
        p.ver(r10_10.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_10.getValorString());
        p.ver(r10_11.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_11.getValorString());
        p.ver(r10_12.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_12.getValorString());
        p.ver(r10_13.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_13.getValorString());
        p.ver(r10_14.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_14.getValorString());
        p.ver(r10_15.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_15.getValorString());
        p.ver(r10_16.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_16.getValorString());
        p.ver(r10_17.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_17.getValorString());
        p.ver(r10_18.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_18.getValorString());
        p.ver(r10_19.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_19.getValorString());
        p.ver(r10_20.resultado, Retorno.Resultado.OK, "obtener vuelo: " + r10_20.getValorString());

        // Validación del método abrirVuelo
        System.out.println("---------------------");
        System.out.println("-----Abrir Vuelo-----");
        System.out.println("---------------------");
        
        Retorno r11_1 = s.abrirVuelo(null);
        Retorno r11_2 = s.abrirVuelo("");
        Retorno r11_3 = s.abrirVuelo("XXX");
        Retorno r11_4 = s.abrirVuelo("AR9999");
        Retorno r11_5 = s.abrirVuelo("AR100");
        Retorno r11_6 = s.abrirVuelo("AR200");
        Retorno r11_7 = s.abrirVuelo("AR300");
        Retorno r11_8 = s.abrirVuelo("AR400");
        Retorno r11_9 = s.abrirVuelo("AR500");
        Retorno r11_10 = s.abrirVuelo("AR600");
        Retorno r11_11 = s.abrirVuelo("AR700");
        Retorno r11_12 = s.abrirVuelo("AR800");
        Retorno r11_13 = s.abrirVuelo("AR900");
        Retorno r11_14 = s.abrirVuelo("AR1000");
        //Intentar abrir vuelos ya abiertos
        Retorno r11_15 = s.abrirVuelo("AR100");
        Retorno r11_16 = s.abrirVuelo("AR200");
        Retorno r11_17 = s.abrirVuelo("AR300");
        Retorno r11_18 = s.abrirVuelo("AR400");
        Retorno r11_19 = s.abrirVuelo("AR500");
        Retorno r11_20 = s.abrirVuelo("AR600");
        
        p.ver(r11_1.resultado, Retorno.Resultado.ERROR_1, "abrir vuelo: " + r11_1.getValorString());
        p.ver(r11_2.resultado, Retorno.Resultado.ERROR_1, "abrir vuelo: " + r11_2.getValorString());
        p.ver(r11_3.resultado, Retorno.Resultado.ERROR_2, "abrir vuelo: " + r11_3.getValorString());
        p.ver(r11_4.resultado, Retorno.Resultado.ERROR_2, "abrir vuelo: " + r11_4.getValorString());
        p.ver(r11_5.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_5.getValorString());
        p.ver(r11_6.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_6.getValorString());
        p.ver(r11_7.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_7.getValorString());
        p.ver(r11_8.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_8.getValorString());
        p.ver(r11_9.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_9.getValorString());
        p.ver(r11_10.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_10.getValorString());
        p.ver(r11_11.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_11.getValorString());
        p.ver(r11_12.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_12.getValorString());
        p.ver(r11_13.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_13.getValorString());
        p.ver(r11_14.resultado, Retorno.Resultado.OK, "abrir vuelo: " + r11_14.getValorString());
        p.ver(r11_15.resultado, Retorno.Resultado.ERROR_3, "abrir vuelo: " + r11_15.getValorString());
        p.ver(r11_16.resultado, Retorno.Resultado.ERROR_3, "abrir vuelo: " + r11_16.getValorString());
        p.ver(r11_17.resultado, Retorno.Resultado.ERROR_3, "abrir vuelo: " + r11_17.getValorString());
        p.ver(r11_18.resultado, Retorno.Resultado.ERROR_3, "abrir vuelo: " + r11_18.getValorString());
        p.ver(r11_19.resultado, Retorno.Resultado.ERROR_3, "abrir vuelo: " + r11_19.getValorString());
        p.ver(r11_20.resultado, Retorno.Resultado.ERROR_3, "abrir vuelo: " + r11_20.getValorString());

        // Validación del método cerrarVuelo
        System.out.println("----------------------");
        System.out.println("-----Cerrar Vuelo-----");
        System.out.println("----------------------");
        
        Retorno r12_1 = s.cerrarVuelo(null);
        Retorno r12_2 = s.cerrarVuelo("");
        Retorno r12_3 = s.cerrarVuelo("XXX");
        Retorno r12_4 = s.cerrarVuelo("AR9999");
        Retorno r12_5 = s.cerrarVuelo("AR100");
        Retorno r12_6 = s.cerrarVuelo("AR200");
        Retorno r12_7 = s.cerrarVuelo("AR300");
        Retorno r12_8 = s.cerrarVuelo("AR400");
        Retorno r12_9 = s.cerrarVuelo("AR500");
        Retorno r12_10 = s.cerrarVuelo("AR600");
        Retorno r12_11 = s.cerrarVuelo("AR700");
        Retorno r12_12 = s.cerrarVuelo("AR800");
        Retorno r12_13 = s.cerrarVuelo("AR900");
        Retorno r12_14 = s.cerrarVuelo("AR1000");
        //Intentar cerrar nuevamente
        Retorno r12_15 = s.cerrarVuelo("AR100");
        Retorno r12_16 = s.cerrarVuelo("AR200");
        Retorno r12_17 = s.cerrarVuelo("AR300");
        Retorno r12_18 = s.cerrarVuelo("AR400");
        Retorno r12_19 = s.cerrarVuelo("AR500");
        Retorno r12_20 = s.cerrarVuelo("AR600");
        
        p.ver(r12_1.resultado, Retorno.Resultado.ERROR_1, "cerrar vuelo: " + r12_1.getValorString());
        p.ver(r12_2.resultado, Retorno.Resultado.ERROR_1, "cerrar vuelo: " + r12_2.getValorString());
        p.ver(r12_3.resultado, Retorno.Resultado.ERROR_2, "cerrar vuelo: " + r12_3.getValorString());
        p.ver(r12_4.resultado, Retorno.Resultado.ERROR_2, "cerrar vuelo: " + r12_4.getValorString());
        p.ver(r12_5.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_5.getValorString());
        p.ver(r12_6.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_6.getValorString());
        p.ver(r12_7.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_7.getValorString());
        p.ver(r12_8.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_8.getValorString());
        p.ver(r12_9.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_9.getValorString());
        p.ver(r12_10.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_10.getValorString());
        p.ver(r12_11.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_11.getValorString());
        p.ver(r12_12.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_12.getValorString());
        p.ver(r12_13.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_13.getValorString());
        p.ver(r12_14.resultado, Retorno.Resultado.OK, "cerrar vuelo: " + r12_14.getValorString());
        p.ver(r12_15.resultado, Retorno.Resultado.ERROR_3, "cerrar vuelo: " + r12_15.getValorString());
        p.ver(r12_16.resultado, Retorno.Resultado.ERROR_3, "cerrar vuelo: " + r12_16.getValorString());
        p.ver(r12_17.resultado, Retorno.Resultado.ERROR_3, "cerrar vuelo: " + r12_17.getValorString());
        p.ver(r12_18.resultado, Retorno.Resultado.ERROR_3, "cerrar vuelo: " + r12_18.getValorString());
        p.ver(r12_19.resultado, Retorno.Resultado.ERROR_3, "cerrar vuelo: " + r12_19.getValorString());
        p.ver(r12_20.resultado, Retorno.Resultado.ERROR_3, "cerrar vuelo: " + r12_20.getValorString());

        //Datos auxiliares para realizar r13
        
        s.registrarVuelo("MVD", "EZE", "CHK100", 2, 100);
        s.registrarVuelo("MVD", "GRU", "CHK200", 3, 100);
        s.registrarVuelo("MVD", "JFK", "CHK300", 1, 100);
        s.registrarVuelo("MVD", "JFK", "CHK400", 1, 100);
        s.registrarVuelo("MVD", "EZE", "ERR700", 1, 100);

        s.abrirVuelo("CHK100");
        s.abrirVuelo("CHK200");
        s.abrirVuelo("CHK400");
        s.abrirVuelo("ERR700");
        
        s.cerrarVuelo("CHK400");
        
        s.registrarPasajero("1.000.000-1", "P1", 20, Categoria.PLATINO);
        s.registrarPasajero("2.000.000-2", "P2", 21, Categoria.PLATINO);
        s.registrarPasajero("3.000.000-3", "P3", 22, Categoria.PLATINO);
        s.registrarPasajero("4.000.000-4", "P4", 23, Categoria.PLATINO);
        s.registrarPasajero("5.000.000-5", "P5", 24, Categoria.PLATINO);
        s.registrarPasajero("13.111.111-1", "B1", 20, Categoria.PLATINO);
        s.registrarPasajero("13.111.111-2", "B2", 20, Categoria.PLATINO);
        s.registrarPasajero("13.111.111-3", "B3", 20, Categoria.PLATINO);

        // Validación del método realizarReserva
        System.out.println("--------------------------");
        System.out.println("-----Realizar Reserva-----");
        System.out.println("--------------------------");
        
        Retorno r13_1 = s.realizarReserva(null, "1.000.000-1");
        Retorno r13_2 = s.realizarReserva("", "1.000.000-1");
        Retorno r13_3 = s.realizarReserva("CHK100", null);
        Retorno r13_4 = s.realizarReserva("CHK100", "");
        Retorno r13_5 = s.realizarReserva("CHK100", "12345678");
        Retorno r13_6 = s.realizarReserva("CHK100", "ABC");
        Retorno r13_7 = s.realizarReserva("NOEXISTE", "1.000.000-1");
        Retorno r13_8 = s.realizarReserva("CHK999", "1.000.000-1");
        Retorno r13_9 = s.realizarReserva("CHK100", "9.999.999-9");
        Retorno r13_10 = s.realizarReserva("CHK100", "8.888.888-1");
        Retorno r13_11 = s.realizarReserva("CHK100", "1.000.000-1");
        Retorno r13_12 = s.realizarReserva("CHK100", "2.000.000-2");
        Retorno r13_13 = s.realizarReserva("CHK100", "1.000.000-1");
        Retorno r13_14 = s.realizarReserva("CHK100", "2.000.000-2");
        Retorno r13_15 = s.realizarReserva("CHK100", "3.000.000-3");
        Retorno r13_16 = s.realizarReserva("CHK400", "1.000.000-1");
        Retorno r13_17 = s.realizarReserva("CHK300", "4.000.000-4");
        Retorno r13_18 = s.realizarReserva("CHK300", "5.000.000-5");
        Retorno r13_19 = s.realizarReserva("CHK300", "4.000.000-4");
        Retorno r13_20 = s.realizarReserva("ERR700", "13.111.111-1");
        Retorno r13_21 = s.realizarReserva("ERR700", "13.111.111-2");
        Retorno r13_22 = s.realizarReserva("ERR700", "13.111.111-3");
        
        p.ver(r13_1.resultado, Retorno.Resultado.ERROR_1, "reserva: " + r13_1.getValorString());
        p.ver(r13_2.resultado, Retorno.Resultado.ERROR_1, "reserva: " + r13_2.getValorString());
        p.ver(r13_3.resultado, Retorno.Resultado.ERROR_1, "reserva: " + r13_3.getValorString());
        p.ver(r13_4.resultado, Retorno.Resultado.ERROR_1, "reserva: " + r13_4.getValorString());
        p.ver(r13_5.resultado, Retorno.Resultado.ERROR_2, "reserva: " + r13_5.getValorString());
        p.ver(r13_6.resultado, Retorno.Resultado.ERROR_2, "reserva: " + r13_6.getValorString());
        p.ver(r13_7.resultado, Retorno.Resultado.ERROR_3, "reserva: " + r13_7.getValorString());
        p.ver(r13_8.resultado, Retorno.Resultado.ERROR_3, "reserva: " + r13_8.getValorString());
        p.ver(r13_9.resultado, Retorno.Resultado.ERROR_4, "reserva: " + r13_9.getValorString());
        p.ver(r13_10.resultado, Retorno.Resultado.ERROR_4, "reserva: " + r13_10.getValorString());
        p.ver(r13_11.resultado, Retorno.Resultado.OK, "reserva: " + r13_11.getValorString());
        p.ver(r13_12.resultado, Retorno.Resultado.OK, "reserva: " + r13_12.getValorString());
        p.ver(r13_13.resultado, Retorno.Resultado.ERROR_6, "reserva: " + r13_13.getValorString());
        p.ver(r13_14.resultado, Retorno.Resultado.ERROR_6, "reserva: " + r13_14.getValorString());
        p.ver(r13_15.resultado, Retorno.Resultado.OK, "reserva: " + r13_15.getValorString());
        p.ver(r13_16.resultado, Retorno.Resultado.ERROR_5, "reserva: " + r13_16.getValorString());
        p.ver(r13_17.resultado, Retorno.Resultado.OK, "reserva: " + r13_17.getValorString());
        p.ver(r13_18.resultado, Retorno.Resultado.OK, "reserva: " + r13_18.getValorString());
        p.ver(r13_19.resultado, Retorno.Resultado.ERROR_6, "reserva: " + r13_19.getValorString());
        p.ver(r13_20.resultado, Retorno.Resultado.OK, "reserva: " + r13_20.getValorString());
        p.ver(r13_21.resultado, Retorno.Resultado.OK, "reserva: " + r13_21.getValorString());
        p.ver(r13_22.resultado, Retorno.Resultado.ERROR_7, "reserva: " + r13_22.getValorString());
        
        //Datos auxiliares para realizar r14
        s.realizarReserva("CHK200", "2.000.000-2");
        s.realizarReserva("CHK200", "3.000.000-3");
        s.realizarReserva("CHK200", "4.000.000-4");
        s.abrirVuelo("CHK300");
        s.cerrarVuelo("ERR700");
        
        //Validación del método realizarCheckIn
        System.out.println("--------------------------");
        System.out.println("-----Realizar Check-in-----");
        System.out.println("--------------------------");
        
        Retorno r14_1 = s.realizarCheckIn(null, "1.000.000-1");
        Retorno r14_2 = s.realizarCheckIn("", "1.000.000-1");
        Retorno r14_3 = s.realizarCheckIn("CHK200", null);
        Retorno r14_4 = s.realizarCheckIn("CHK200", "");
        Retorno r14_5 = s.realizarCheckIn("CHK200", "12345678");
        Retorno r14_6 = s.realizarCheckIn("CHK200", "ABC");
        Retorno r14_7 = s.realizarCheckIn("NOEXISTE", "1.000.000-1");
        Retorno r14_8 = s.realizarCheckIn("CHK999", "1.000.000-1");
        Retorno r14_9 = s.realizarCheckIn("CHK200", "9.999.999-9");
        Retorno r14_10 = s.realizarCheckIn("CHK200", "8.888.888-1");
        Retorno r14_11 = s.realizarCheckIn("ERR700", "1.000.000-1");
        Retorno r14_12 = s.realizarCheckIn("CHK100", "13.111.111-1");
        Retorno r14_13 = s.realizarCheckIn("CHK200", "2.000.000-2");
        Retorno r14_14 = s.realizarCheckIn("CHK200", "3.000.000-3");
        Retorno r14_15 = s.realizarCheckIn("CHK200", "4.000.000-4");
        Retorno r14_16 = s.realizarCheckIn("CHK200", "2.000.000-2");
        Retorno r14_17 = s.realizarCheckIn("CHK300", "4.000.000-4");
        Retorno r14_18 = s.realizarCheckIn("CHK300", "5.000.000-5");
        Retorno r14_19 = s.realizarCheckIn("CHK300", "4.000.000-4");
        Retorno r14_20 = s.realizarCheckIn("CHK300", "5.000.000-5");
        
        p.ver(r14_1.resultado, Retorno.Resultado.ERROR_1, "checkin: " + r14_1.getValorString());
        p.ver(r14_2.resultado, Retorno.Resultado.ERROR_1, "checkin: " + r14_2.getValorString());
        p.ver(r14_3.resultado, Retorno.Resultado.ERROR_1, "checkin: " + r14_3.getValorString());
        p.ver(r14_4.resultado, Retorno.Resultado.ERROR_1, "checkin: " + r14_4.getValorString());
        p.ver(r14_5.resultado, Retorno.Resultado.ERROR_2, "checkin: " + r14_5.getValorString());
        p.ver(r14_6.resultado, Retorno.Resultado.ERROR_2, "checkin: " + r14_6.getValorString());
        p.ver(r14_7.resultado, Retorno.Resultado.ERROR_3, "checkin: " + r14_7.getValorString());
        p.ver(r14_8.resultado, Retorno.Resultado.ERROR_3, "checkin: " + r14_8.getValorString());
        p.ver(r14_9.resultado, Retorno.Resultado.ERROR_4, "checkin: " + r14_9.getValorString());
        p.ver(r14_10.resultado, Retorno.Resultado.ERROR_4, "checkin: " + r14_10.getValorString());
        p.ver(r14_11.resultado, Retorno.Resultado.ERROR_5, "checkin: " + r14_11.getValorString());
        p.ver(r14_12.resultado, Retorno.Resultado.ERROR_6, "checkin: " + r14_12.getValorString());
        p.ver(r14_13.resultado, Retorno.Resultado.OK, "checkin: " + r14_13.getValorString());
        p.ver(r14_14.resultado, Retorno.Resultado.OK, "checkin: " + r14_14.getValorString());
        p.ver(r14_15.resultado, Retorno.Resultado.OK, "checkin: " + r14_15.getValorString());
        p.ver(r14_16.resultado, Retorno.Resultado.ERROR_7, "checkin: " + r14_16.getValorString());
        p.ver(r14_17.resultado, Retorno.Resultado.OK, "checkin: " + r14_17.getValorString());
        p.ver(r14_18.resultado, Retorno.Resultado.ERROR_8, "checkin: " + r14_18.getValorString());
        p.ver(r14_19.resultado, Retorno.Resultado.ERROR_7, "checkin: " + r14_19.getValorString());
        p.ver(r14_20.resultado, Retorno.Resultado.ERROR_8, "checkin: " + r14_20.getValorString());
        
        //Validación del método embarqueYDespegueDeVuelo
        System.out.println("--------------------------------------");
        System.out.println("-----Embarque Y Despegue De Vuelo-----");
        System.out.println("--------------------------------------");
        
        Retorno r15_1 = s.embarqueYDespegueDeVuelo(null);
        Retorno r15_2 = s.embarqueYDespegueDeVuelo("");
        Retorno r15_3 = s.embarqueYDespegueDeVuelo("XXX");
        Retorno r15_4 = s.embarqueYDespegueDeVuelo("ZZZ");
        Retorno r15_5 = s.embarqueYDespegueDeVuelo("EZE");
        Retorno r15_6 = s.embarqueYDespegueDeVuelo("GRU");
        Retorno r15_7 = s.embarqueYDespegueDeVuelo("JFK");
        Retorno r15_8 = s.embarqueYDespegueDeVuelo("MVD");
        Retorno r15_9 = s.embarqueYDespegueDeVuelo("MVD");
        Retorno r15_10 = s.embarqueYDespegueDeVuelo("MVD");
        Retorno r15_11 = s.embarqueYDespegueDeVuelo("LAX");
        Retorno r15_12 = s.embarqueYDespegueDeVuelo("MAD");
        Retorno r15_13 = s.embarqueYDespegueDeVuelo("BCN");
        Retorno r15_14 = s.embarqueYDespegueDeVuelo("CDG");
        Retorno r15_15 = s.embarqueYDespegueDeVuelo("FCO");
        Retorno r15_16 = s.embarqueYDespegueDeVuelo("AMS");
        Retorno r15_17 = s.embarqueYDespegueDeVuelo("MVD");
        
        p.ver(r15_1.resultado, Retorno.Resultado.ERROR_1, "embarque: " + r15_1.getValorString());
        p.ver(r15_2.resultado, Retorno.Resultado.ERROR_1, "embarque: " + r15_2.getValorString());
        p.ver(r15_3.resultado, Retorno.Resultado.ERROR_2, "embarque: " + r15_3.getValorString());
        p.ver(r15_4.resultado, Retorno.Resultado.ERROR_2, "embarque: " + r15_4.getValorString());
        p.ver(r15_5.resultado, Retorno.Resultado.OK, "embarque: " + r15_5.getValorString());
        p.ver(r15_6.resultado, Retorno.Resultado.OK, "embarque: " + r15_6.getValorString());
        p.ver(r15_7.resultado, Retorno.Resultado.OK, "embarque: " + r15_7.getValorString());
        p.ver(r15_8.resultado, Retorno.Resultado.OK, "embarque: " + r15_8.getValorString());
        p.ver(r15_9.resultado, Retorno.Resultado.OK, "embarque: " + r15_9.getValorString());
        p.ver(r15_10.resultado, Retorno.Resultado.OK, "embarque: " + r15_10.getValorString());
        p.ver(r15_11.resultado, Retorno.Resultado.OK, "embarque: " + r15_11.getValorString());
        p.ver(r15_12.resultado, Retorno.Resultado.OK, "embarque: " + r15_12.getValorString());
        p.ver(r15_13.resultado, Retorno.Resultado.OK, "embarque: " + r15_13.getValorString());
        p.ver(r15_14.resultado, Retorno.Resultado.OK, "embarque: " + r15_14.getValorString());
        p.ver(r15_15.resultado, Retorno.Resultado.OK, "embarque: " + r15_15.getValorString());
        p.ver(r15_16.resultado, Retorno.Resultado.OK, "embarque: " + r15_16.getValorString());
        p.ver(r15_17.resultado, Retorno.Resultado.ERROR_3, "embarque: " + r15_17.getValorString());
        
        
        p.imprimirResultadosPrueba();
    }
}
