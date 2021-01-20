package UzdaviniaiKTU;
//8. Skaičiai. Per matematikos pamoką teko nustatyti, kurie iš duotųjų teigiamų skaičių a,
//b ir c yra skaičiaus trys kartotiniai. Jei yra keli, reikia išvesti pirmą rastą,
//jeigu nėra nei vieno, reikia išvesti - nėra.
//Parašykite programą, sprendžiančią šį uždavinį.
//--------------------------
//Įveskite a reikšmę. 5
//Įveskite b reikšmę. 2
//Įveskite c reikšmę. 3
//Atsakymas: 3
//--------------------------
//Įveskite a reikšmę. 6
//Įveskite b reikšmę. 3
//Įveskite c reikšmę. 7
//Atsakymas: 6
//--------------------------
//Įveskite a reikšmę. 1
//Įveskite b reikšmę. 2
//Įveskite c reikšmę. 5
//Atsakymas: nėra
import java.util.Scanner;

public class KTU2008 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite a reikšmę. ");
        double a =reader.nextDouble();

        System.out.print("Įveskite b reikšmę. ");
        double b =reader.nextDouble();

        System.out.print("Įveskite c reikšmę. ");
        double c =reader.nextDouble();

        if (a%3==0) {
            System.out.println("Atsakymas: " +a);
        } else if (b%3==0) {
            System.out.println("Atsakymas: " +b);
        } else if (c%3==0) {
            System.out.println("Atsakymas: " +c);
        } else {
            System.out.println("Atsakymas: Nėra ");
        }

        reader.close();
    }
}
