package n1Exercici3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseArrayTest {

    ClaseArray claseArray = new ClaseArray();

    @Test
    void afegirNumberToArray() {
        Assert.assertEquals(3, claseArray.getArray().length );
    }

}