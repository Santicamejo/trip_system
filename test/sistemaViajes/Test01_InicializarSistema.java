package sistemaViajes;

import Test.Retorno;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test01_InicializarSistema {

    private Retorno retorno;
    private final ISistema s = new Sistema();

    @Test
    public void inicializarSistemaOk() {
        retorno = s.inicializarSistema();
        assertEquals(Retorno.Resultado.OK, retorno.getResultado());    
    }
}
