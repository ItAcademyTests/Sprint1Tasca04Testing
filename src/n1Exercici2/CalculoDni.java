package n1Exercici2;

import java.util.HashMap;
import java.util.Map;

public class CalculoDni {

    Map<Integer, Character> lletresINumeros = new HashMap<>();

    public CalculoDni() {
        generateLletresINombres();
    }

    public char calcularNumeroDeLletra (int dniNombre) {
        var resto = dniNombre % 23;
        return lletresINumeros.get(resto);
    }

    private void generateLletresINombres() {
        this.lletresINumeros.put(0, 'T');
        this.lletresINumeros.put(1, 'R');
        this.lletresINumeros.put(2, 'W');
        this.lletresINumeros.put(3, 'A');
        this.lletresINumeros.put(4, 'G');
        this.lletresINumeros.put(5, 'M');
        this.lletresINumeros.put(6, 'Y');
        this.lletresINumeros.put(7, 'F');
        this.lletresINumeros.put(8, 'P');
        this.lletresINumeros.put(9, 'D');
        this.lletresINumeros.put(10, 'X');
        this.lletresINumeros.put(11, 'B');
        this.lletresINumeros.put(12, 'N');
        this.lletresINumeros.put(13, 'J');
        this.lletresINumeros.put(14, 'Z');
        this.lletresINumeros.put(15, 'S');
        this.lletresINumeros.put(16, 'Q');
        this.lletresINumeros.put(17, 'V');
        this.lletresINumeros.put(18, 'H');
        this.lletresINumeros.put(19, 'L');
        this.lletresINumeros.put(20, 'C');
        this.lletresINumeros.put(21, 'K');
        this.lletresINumeros.put(22, 'E');
    }

}
