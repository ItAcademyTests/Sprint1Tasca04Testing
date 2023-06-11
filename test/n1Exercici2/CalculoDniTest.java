package n1Exercici2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CalculoDniTest {

    CalculoDni calculoDni = new CalculoDni();

    @BeforeEach
    void setUp() {
    }

    @Test
    void calcularDni() {
        assertEquals('P', calculoDni.calcularNumeroDeLletra(48002871));
    }

}

