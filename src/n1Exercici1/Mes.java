package n1Exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Mes {

     List<String> mesosAny;

    public Mes() {
        omplirLlistaMesosAny();
    }

    public void omplirLlistaMesosAny() {
        this.mesosAny = new ArrayList<>();
        mesosAny.add("Gener");
        mesosAny.add("Febrer");
        mesosAny.add("Març");
        mesosAny.add("Abril");
        mesosAny.add("Maig");
        mesosAny.add("Juny");
        mesosAny.add("Juliol");
        mesosAny.add("Agost");
        mesosAny.add("Setembre");
        mesosAny.add("Octubre");
        mesosAny.add("Novembre");
        mesosAny.add("Decembre");
    }

    public List<String> getMesosAny() {
        return mesosAny;
    }
}
