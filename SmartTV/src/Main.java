import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<SmartTV> esApple = (smartTV) -> smartTV.getSo().getDesarrollador().equalsIgnoreCase("APPLE");
        Predicate<SmartTV> esGenerico = (smartTV) -> smartTV.getFamilia().equalsIgnoreCase("SIN FAMILIA");

        SmartTV samsungTV = new SmartTV("Neo QLED", "QN90A", "4K", 98F, (byte) 99,
                new Dimension(2185.1F, 1319.0F, 366.9F), new Fabricante("Samsung", "Corea del Sur"),
                SistemaOperativo.ANDROID_TV, LocalDate.of(2022, Month.DECEMBER, 20));
        SmartTV sonyTV = new SmartTV("Z9J", "BRAVIA XR", "8K", 85F, (byte) 61.7,
                new Dimension(1937.1F, 1123.0F, 484.0F), new Fabricante("Sony", "Japon"),
                SistemaOperativo.APPLE_TV);

        ArrayList<SmartTV> smartTVS = new ArrayList<>();
        smartTVS.add(samsungTV);
        smartTVS.add(0, sonyTV);
        smartTVS.add(new SmartTV());

        System.out.println("Primer Lista\n");
        smartTVS.forEach(System.out::println);

        smartTVS.sort(Comparator.comparing(SmartTV::getFamilia));

        System.out.println("\nSegunda Lista\n");
        smartTVS.forEach(System.out::println);

        smartTVS.set(1, new SmartTV("ASD", "ASD", "4K", 95F, (byte) 25, new Dimension(), new Fabricante(), SistemaOperativo.ANDROID_TV));
        smartTVS.add(new SmartTV());
        smartTVS.removeIf(esApple.or(esGenerico));

        System.out.println("\nTercer Lista\n");
        smartTVS.forEach(System.out::println);

        smartTVS.forEach(SmartTV::encender);
        smartTVS.forEach(SmartTV::apagar);
    }
}