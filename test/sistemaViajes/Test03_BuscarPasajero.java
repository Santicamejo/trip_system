package sistemaViajes;

import dominio.Categoria;
import Test.Retorno;
import sistemaViajes.Sistema;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemaViajes.ISistema;

public class Test03_BuscarPasajero {

    private Retorno retorno;
    private final ISistema s = new Sistema();

    @Before
    public void setUp() {
        s.inicializarSistema();
    }

    @Test
    public void buscarPasajeroOk() {
        retorno = s.registrarPasajero("3.335.321-2", "Juan", 45, Categoria.ESPORADICO);
        retorno = s.buscarPasajero("3.335.321-2");
        assertEquals(Retorno.Resultado.OK, retorno.getResultado());
        assertEquals("3.335.321-2;Juan;45;Esporádico", retorno.getValorString());
    }

    @Test
    public void buscarPasajeroError01() {
        retorno = s.buscarPasajero("3..321-2");
        assertEquals(Retorno.Resultado.ERROR_1, retorno.getResultado());
    }

    @Test
    public void buscarPasajeroError02() {
        retorno = s.buscarPasajero("5.365.221-1");
        assertEquals(Retorno.Resultado.ERROR_2, retorno.getResultado());
    }

}
