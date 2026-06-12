
package sistemaViajes;

import Test.*;
import dominio.*;


/**
 *
 * @author Rafael
 */
public class Oblmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sistema o = new Sistema();
        Prueba p = new Prueba();
        juegodeprueba1(o,p);
   
    }
 public static void juegodeprueba1(Sistema o, Prueba p){
    // validacion del metodo registrarPasajero
    p.ver(o.registrarPasajero("1.345.345-4", "Juan Perez", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Juan Perez");
    p.ver(o.registrarPasajero("1.345.345-1", "Ana Gomez", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Ana Gomez");
    p.ver(o.registrarPasajero("1.345.345-2", "Pedro Picapiedra", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Pedro picapiedra");
    p.ver(o.registrarPasajero("1.345.345-3", "Pablo Marmol", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Pablo Marmol");
    p.ver(o.registrarPasajero("1.345.345-5", "Dino Gonzalez", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Dino Gonzalez");
    p.ver(o.registrarPasajero("1.345.345-6", "Carlos Gomez", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Carlos Gomez");
    p.ver(o.registrarPasajero("1.345.345-7", "Maria Gonzalez", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Maria Gonzalez");
    p.ver(o.registrarPasajero("1.345.345-8", "Andres Mondino", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Se registro pasajero Andres Mondino");
    
    
    
    
    p.ver(o.registrarPasajero("1.345.345-4", "Juan Perez", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.ERROR_4, "Ya existe pasajero Juan Perez");
    p.ver(o.registrarPasajero("2.234.567-0", null, 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.ERROR_1, "Algun parametro incorrecto");
    p.ver(o.registrarPasajero("3.3.45.345-4", "Guille", -23, Categoria.PLATINO).getResultado() , Retorno.Resultado.ERROR_3,"Edad incorrecta menor que cero");
    p.ver(o.registrarPasajero("1234567", "Pedro Gonzalez", 20, Categoria.PLATINO).getResultado(), Retorno.Resultado.ERROR_2, "Cedula no respeta formato");
    
    //alidacion del metodo buscarPasajero
    p.ver(o.buscarPasajero("1.345.345-4").getResultado(), Retorno.Resultado.OK, "Pasasjero valido "+ o.buscarPasajero("1.345.345-4").getValorString());
    p.ver(o.buscarPasajero("1345345-4").getResultado(), Retorno.Resultado.ERROR_1, "Cedula sin formato valido ");
    p.ver(o.buscarPasajero("9.999.999-9").getResultado(), Retorno.Resultado.ERROR_2, "Pasasjero no registrado");

    // listado de pasajeros ascendente
    
    p.ver(o.listarPasajerosAscendente().getResultado(), Retorno.Resultado.OK, "Listado ascendente de pasajeros" +o.listarPasajerosAscendente().getValorString() );
    
    // listado de pasajeros por categoria
    p.ver(o.listarPasajerosPorCategoría(Categoria.PLATINO).getResultado(), Retorno.Resultado.OK, "Listado pasajeros por categoria" + o.listarPasajerosPorCategoría(Categoria.PLATINO).getValorString());
    
    // registrar aeropuerto
    
    p.ver(o.registrarAeropuerto("001", "MVD").getResultado(), Retorno.Resultado.OK, "Se registra aeropuerto 001 MVD");
    p.ver(o.registrarAeropuerto("002", "MAD").getResultado(), Retorno.Resultado.OK, "Se registra aeropuerto 002 MAD");
    p.ver(o.registrarAeropuerto("002", null).getResultado(), Retorno.Resultado.ERROR_1, "Parametros incorrectos");
    p.ver(o.registrarAeropuerto("001", "MVD").getResultado(), Retorno.Resultado.ERROR_2, "Se intenta registrar aeropuerto 001 MVD que ya existe");
    
    // obtener aeropuerto
    p.ver(o.obtenerAeropuerto("001").getResultado(), Retorno.Resultado.OK, "Aeropuertto encontrado "+ o.obtenerAeropuerto("001").getValorString());
    p.ver(o.obtenerAeropuerto(null).getResultado(), Retorno.Resultado.ERROR_1, "Parametro vacio "+ o.obtenerAeropuerto("001").getValorString());
    p.ver(o.obtenerAeropuerto("999").getResultado(), Retorno.Resultado.ERROR_2, "Aeropuertto no existe "+ o.obtenerAeropuerto("001").getValorString());
    p.ver(o.obtenerAeropuerto("002").getResultado(), Retorno.Resultado.OK, "Aeropuertto encontrado "+ o.obtenerAeropuerto("002").getValorString());
    p.ver(o.obtenerAeropuerto("003").getResultado(), Retorno.Resultado.OK, "Aeropuertto encontrado "+ o.obtenerAeropuerto("003").getValorString());

    
// registar vuelo
    p.ver(o.registrarVuelo("001", "002", "001", 5, 1000).getResultado(), Retorno.Resultado.OK, "se registro vuelo 001");
    p.ver(o.registrarVuelo("001", "002", "001", -5, 1000).getResultado(), Retorno.Resultado.ERROR_1, "Parametro menor a cero");
    p.ver(o.registrarVuelo("001", "002", null, 5, 1000).getResultado(), Retorno.Resultado.ERROR_2, "Parametro vacio");
  
    p.ver(o.registrarVuelo("999", "002", "001", 5, 1000).getResultado(), Retorno.Resultado.ERROR_3, "no existe origen 999");
    p.ver(o.registrarVuelo("001", "999", "001", 5, 1000).getResultado(), Retorno.Resultado.ERROR_4, "no existe destino 999");
    
    p.ver(o.registrarVuelo("001", "002", "001", 5, 1000).getResultado(), Retorno.Resultado.ERROR_5, "vuelo ya existe");

    p.ver(o.registrarVuelo("010", "002", "001", 5, 1000).getResultado(), Retorno.Resultado.OK, "se registro vuelo 010");
    p.ver(o.registrarVuelo("010", "002", "011", 5, 1000).getResultado(), Retorno.Resultado.OK, "se registro vuelo 011");

    
    
    
// obtener informacion vuelo
    p.ver(o.obtenerInformacionDeVuelo("001").getResultado(), Retorno.Resultado.OK, "Datos del vuelo 001" + o.obtenerInformacionDeVuelo("001").getValorString());
    p.ver(o.obtenerInformacionDeVuelo(null).getResultado(), Retorno.Resultado.ERROR_1, "Codigo de vuelo vacio" );
    p.ver(o.obtenerInformacionDeVuelo("999").getResultado(), Retorno.Resultado.ERROR_2, "Codigo de vuelo no existe" );    
    
 // abrir vuelo
    p.ver(o.abrirVuelo("001").getResultado(), Retorno.Resultado.OK, "Se abre vuelo 001");
     p.ver(o.abrirVuelo("010").getResultado(), Retorno.Resultado.OK, "Se abre vuelo 010");
   
    p.ver(o.abrirVuelo("011").getResultado(), Retorno.Resultado.OK, "Se abre vuelo 011");

    p.ver(o.abrirVuelo(null).getResultado(), Retorno.Resultado.ERROR_1, "se intenta abrir vuelo con codigo vacio");    
    p.ver(o.abrirVuelo("999").getResultado(), Retorno.Resultado.ERROR_2, "Se abre vuelo 999 que no existe");
    p.ver(o.abrirVuelo("999").getResultado(), Retorno.Resultado.ERROR_2, "Se abre vuelo 999 que no existe");
    p.ver(o.abrirVuelo("002").getResultado(), Retorno.Resultado.ERROR_3, "vuelo 002 no programado");
    
   // cerrar vuelo
       p.ver(o.cerrarVuelo("001").getResultado(), Retorno.Resultado.OK, "Se cierra vuelo 001");
       p.ver(o.cerrarVuelo(null).getResultado(), Retorno.Resultado.ERROR_1, "Codigo de vuelo null");
       p.ver(o.cerrarVuelo("999").getResultado(), Retorno.Resultado.ERROR_2, "no existe vuelo con codigo 999");
       p.ver(o.cerrarVuelo("002").getResultado(), Retorno.Resultado.ERROR_3, "No esta abierto el vuelo 002");
       p.ver(o.cerrarVuelo("011").getResultado(), Retorno.Resultado.ERROR_3, "No esta abierto el vuelo 002");
       
    // Realizar reserva      
    
       p.ver(o.realizarReserva("010", "1.345.345-4").getResultado(), Retorno.Resultado.OK, "Reserva 1 en vuelo 010 ");
       p.ver(o.realizarReserva("010", "1.345.345-4").getResultado(), Retorno.Resultado.OK, "Reserva 1 en vuelo 010 ");
       p.ver(o.realizarReserva("010", "1.345.345-4").getResultado(), Retorno.Resultado.OK, "Reserva 1 en vuelo 010 ");
       p.ver(o.realizarReserva("010", "1.345.345-4").getResultado(), Retorno.Resultado.OK, "Reserva 1 en vuelo 010 ");
       p.ver(o.realizarReserva("010", "1.345.345-4").getResultado(), Retorno.Resultado.OK, "Reserva 1 en vuelo 010 ");
       p.ver(o.realizarReserva("010", "1.345.345-4").getResultado(), Retorno.Resultado.OK, "Reserva 1 en vuelo 010 ");





       p.ver(o.realizarReserva(null, "1.345.345-4").getResultado(), Retorno.Resultado.ERROR_1, "Reserva incorrecta en vuelo 010 parametro nulo ");
       p.ver(o.realizarReserva("010", "1345345-4").getResultado(), Retorno.Resultado.ERROR_2, "Reserva correcta en vuelo 010 cedula sin formato");
       p.ver(o.realizarReserva("999", "1.345.345-4").getResultado(), Retorno.Resultado.ERROR_3, "Reserva incorrecta en vuelo 999 que no existe ");
       p.ver(o.realizarReserva("010", "9.999.999-9").getResultado(), Retorno.Resultado.ERROR_4, "Reserva correcta en vuelo 010 no existe cedula 9.999.999-9");
       
       p.ver(o.realizarReserva("011", "1.345.345-4").getResultado(), Retorno.Resultado.ERROR_5, "Reserva incorrecta en vuelo 011 cerrado ");
       p.ver(o.realizarReserva("010", "1.345.345-4").getResultado(), Retorno.Resultado.ERROR_6, "Reserva existente en vuelo 010 para pasajero 1.345.345-4 ");

       p.ver(o.realizarReserva("010", "1.345.345-1").getResultado(), Retorno.Resultado.OK, "Reserva 1 en vuelo 010 para pasajero 1.345.345-1 ");
       p.ver(o.realizarReserva("010", "1.345.345-2").getResultado(), Retorno.Resultado.OK, "Reserva 2 en vuelo 010 para pasajero 1.345.345-2 ");
       p.ver(o.realizarReserva("010", "1.345.345-3").getResultado(), Retorno.Resultado.OK, "Reserva 2 en vuelo 010 para pasajero 1.345.345-3 ");
       p.ver(o.realizarReserva("010", "1.345.345-5").getResultado(), Retorno.Resultado.OK, "Reserva 5 en vuelo 010 para pasajero 1.345.345-5 ");
       
       p.ver(o.realizarReserva("010", "1.345.345-6").getResultado(), Retorno.Resultado.ERROR_7, "Reserva 6 en vuelo 010 para pasajero 1.345.345-6 ");

   //Realizar check-in
       p.ver(o.realizarCheckIn("010", "1.345.345-1").getResultado(), Retorno.Resultado.OK, "check-in pasajero 1.345.345-1 ");
       p.ver(o.realizarCheckIn("010", "1.345.345-2").getResultado(), Retorno.Resultado.OK, "check-in pasajero 1.345.345-2 ");
       p.ver(o.realizarCheckIn("010", "1.345.345-3").getResultado(), Retorno.Resultado.OK, "check-in pasajero 1.345.345-3 ");
       p.ver(o.realizarCheckIn("010", "1.345.345-4").getResultado(), Retorno.Resultado.OK, "check-in pasajero 1.345.345-4 ");       
       p.ver(o.realizarCheckIn("010", "1.345.345-5").getResultado(), Retorno.Resultado.OK, "check-in pasajero 1.345.345-5 ");       
       
       
       p.ver(o.realizarCheckIn(null, "1.345.345-1").getResultado(), Retorno.Resultado.ERROR_1, "check-in pasajero 1.345.345-2 con parametro null ");
       p.ver(o.realizarCheckIn("001", "1345345-6").getResultado(), Retorno.Resultado.ERROR_2, "check-in pasajero 1.345.345-2 con cedula sin formato ");
       
       p.ver(o.realizarCheckIn("999", "1.345.345-6").getResultado(), Retorno.Resultado.ERROR_3, "check-in pasajero 1.345.345-6 con vuelo inexistente 999 ");
       p.ver(o.realizarCheckIn("001", "9.999.999-9").getResultado(), Retorno.Resultado.ERROR_4, "check-in pasajero 9.999.999-9 cedula inexistente ");

       p.ver(o.realizarCheckIn("011", "1.345.345-9").getResultado(), Retorno.Resultado.ERROR_5, "check-in pasajero vuelo 011 no abierto ");
       
       p.ver(o.realizarCheckIn("010", "1.345.345-9").getResultado(), Retorno.Resultado.ERROR_6, "check-in pasajero 1.345.345-9 sin reserva ");
      
       p.ver(o.realizarCheckIn("010", "1.345.345-1").getResultado(), Retorno.Resultado.ERROR_7, "check-in pasajero 1.345.345-1 ya tiene check ");
       
       // revisar 
       p.ver(o.realizarCheckIn("010", "1.345.345-6").getResultado(), Retorno.Resultado.ERROR_8, "check-in pasajero 1.345.345-6 ");
       
    
    
    p.imprimirResultadosPrueba(); 
 
 }  

 
 
}
