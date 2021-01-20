package UzdaviniaiKTU;
//4. Automobilis. Automobilių tunelio po Nepriklausomybės aikšte Vilniuje ilgis lygus 264 m. Parašykite programą
//kuri apskaičiuotų, kelias sekundes s automobilis važiuoja šiuo tuneliu,
//jei jo greitis yra v km/h? Rezultatus pateikite šimtųjų tikslumu.
//Koks automobilio greitis? 60
//Automobilis tunelį pravažiuos per 15.84 s
import java.util.Scanner;
public class KTU1004 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Koks automobilio greitis? ");
        double v = reader.nextInt();

        double s=264;
        s=s/1000;

        double t=s/v;
        t=t*3600;

        System.out.printf("Automobilis tunelį pravažiuos per %.2f s", t);

        reader.close();
    }
}
