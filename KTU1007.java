package UzdaviniaiKTU;
//7. Puodelių pakavimas. Į vieną kartoninę dėžutę telpa trys puodeliai.
//Pakuotojas užklijuoja dėžutę ir išsiunčia ją į parduotuvę, jei ji pilna.
//Iš viso reikia supakuoti m puodelių. Parašykite programą, kuri apskaičiuotų,
//kelios bus pilnos dėžutės ir kiek puodelių liks nesupakuota.
//Puodelių, kuriuos reikia supakuoti, skaičius: 7
//Pilnų dėžučių skaičius: 2
//Nesupakuotų puodelių skaičius: 1
import java.util.Scanner;
public class KTU1007 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Puodelių, kuriuos reikia supakuoti, skaičius: ");
        int cup = reader.nextInt();

        int box=cup/3;
        cup=cup%3;

        System.out.printf("Pilnų dėžučių skaičius: %d", box);
        System.out.println();
        System.out.printf("Nesupakuotų puodelių skaičius: %d", cup);

        reader.close();
    }
}
