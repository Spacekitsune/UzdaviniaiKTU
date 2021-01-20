package UzdaviniaiKTU;
//5. Statybininkas. Statybininkui reikia pastatyti sieną, kurios ilgis yra a metrų,
//o aukštis h metrų (a ir h – sveikieji skaičiai). Kiek reikės plytų,
//kurių ilgis 20 cm, o aukštis 10 cm ir kiek kainuos plytos,
//jeigu vienos plytos kaina k Lt. Pinigų sumą pateikti šimtųjų tikslumu.
//Sienos ilgis 4 m
//Sienos aukštis 3 m
//Plytos kaina 0.5 Lt
//Plytų kiekis: 600
//Plytos kainuos 300.00 Lt
import java.util.Scanner;
public class KTU1005 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sienos ilgis: ");
        int a = reader.nextInt();
        a=a*100;

        System.out.print("Sienos aukštis: ");
        int h = reader.nextInt();
        h=h*100;

        System.out.print("Plytos kaina: ");
        double lt = reader.nextDouble();

        double s =(a * h);
        double plytaS = 20*10;
        double kiekis = s / plytaS;
        double kaina = kiekis * lt;

        System.out.printf("Plytų kiekis: %.0f", kiekis);
        System.out.println();
        System.out.printf("Plytos kainuos %.2f Lt", kaina);

        reader.close();
    }
}
