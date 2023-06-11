package n1Exercici3;

public class ClaseArray {

    private int[] array = new int[3];

    public ClaseArray() {
        intializeArray();
    }

    private void intializeArray() {
        array[0] = 20;
        array[1] = 40;
    }

    public void afegirNumberToArray(int num) { // Aquest metode llança ArrayIndexOutOfBoundsException si l'array definit com a atribut te només una longitud de 2
        array[2] = num;
    }

    public int[] getArray() {
        return array;
    }
}
