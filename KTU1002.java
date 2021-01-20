package UzdaviniaiKTU;
//2. Akvariumas. Akvariume gyvena a žuvų.
//Kiekvieną dieną Petriukas į akvariumą įdeda b žuvų. Parašykite programą,
//kuri suskaičiuotų kiek iš viso bus žuvų po n dienų. Rezultatą reikia išvesti su paaiškinamaisiais žodžiais.
//Kiek žuvų gyvena akvariume? 5
//Kiek žuvų į akvariumą įdedama kiekvieną dieną? 3
//Kiek dienų praėjo? 3
//Po 3 dienų akvariume gyvens 14 žuvų.
import  java.util.Scanner;
public class KTU1002 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek žuvų gyvena akvariume?");
        int zuvys = reader.nextInt();

        System.out.print("Kiek žuvų į akvariumą įdedama kiekvieną dieną? ");
        int zuvysNaujos = reader.nextInt();

        System.out.print("Kiek dienų praėjo?");
        int dienos = reader.nextInt();

        int visoZuvys=zuvys + (zuvysNaujos * dienos);

        System.out.printf("Po %d dienų akvariume gyvens %d žuvų.", dienos, visoZuvys);

        reader.close();
    }
}
