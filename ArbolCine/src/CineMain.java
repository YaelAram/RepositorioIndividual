import cine.Sala;

import java.awt.*;
import java.util.Random;

public class CineMain {
    public static void main(String[] args) {
        Random random = new Random();
        Sala sala1 = new Sala("1-A", 10, 8, true, "Polyester", Color.BLUE);
        Sala sala2 = new Sala("2-A", 10, 8, false, "Algodon", Color.GRAY);

        System.out.println(sala1);

        System.out.println("\nReclinando 5 asientos aleatorios, Sala 1");
        for(int i = 0 ; i < 5 ; i++) sala1.reclinar(random.nextInt(10), random.nextInt(8));

        System.out.println("\nReclinando 5 asientos aleatorios, Sala 2");
        for(int i = 0 ; i < 5 ; i++) sala2.reclinar(random.nextInt(10), random.nextInt(8));
    }
}
