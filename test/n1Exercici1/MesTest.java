package n1Exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesTest {

    Mes mes = new Mes();

    @Test
     void validar12PosicionsMesos() {
        assertEquals(12, mes.getMesosAny().size());
    }

    @Test
    void validarLlistaMesosNoNula() {
        assertNotNull(mes.getMesosAny());
    }

    @Test
    void validarMesAgost() {
        assertEquals("Agost", mes.getMesosAny().get(7));
    }

}