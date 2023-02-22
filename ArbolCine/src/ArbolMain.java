import arbol.Arbol;
import arbol.Pais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArbolMain {
    public static void main(String[] args) {
        Arbol abedul = new Arbol("Abedul", 5, 1.2F, true, new Pais("Canada", "America"));
        Arbol pino = new Arbol("Pino", 1, 3F, true, new Pais("Grecia", "Europa"));
        Arbol fresno = new Arbol("Fresno", 10, 15F, false, new Pais("Estados Unidos", "America"));

        ArrayList<Arbol> arboles = new ArrayList<>();
        arboles.add(abedul);
        arboles.add(pino);
        arboles.add(fresno);

        System.out.println("Imprimiendo ArrayList");
        System.out.println(arboles);

        System.out.println("\nImprimiendo usando ForEach");
        arboles.forEach(System.out::println);

        System.out.println("\nAgregando un nuevo arbol y ordenando arboles por nombre");
        arboles.add(new Arbol());
        arboles.sort(Comparator.comparing(Arbol::getNombre));
        arboles.forEach(System.out::println);

        System.out.println("\nFiltrando arboles que esten vivos");
        arboles.stream().filter(Arbol::isEstaVivo).forEach(System.out::println);
    }
}
