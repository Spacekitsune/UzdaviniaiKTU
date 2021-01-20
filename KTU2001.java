package UzdaviniaiKTU;
//1. Parašiutininkas. Parašiutininkas šoka iš h metrų aukščio. Vos iššokęs, iškart pradeda skleisti
//parašiutą, kuris iki galo išsiskleidžia per t sekundžių. Parašykite programą, kuri apskaičiuotų, ar
//parašiutas spės išsiskleisti prieš parašiutininkui pasiekiant žemę. Laikas, per kurį objektas
//nukrenta iš aukščio h randamas pagal formulę: t = sqrt(2h/g). Čia g - laisvojo kritimo pagreitis, kuris
//yra lygus 9.8 m/s2.Pavyzdžiui, įvedus tokius pradinius duomenis, į ekraną turėtų būti išvedami rezultatai:
//---------------------------------------------
//Iš kokio aukščio šoka parašiutininkas? 200
//Per kiek sekundžių išsiskleidžia jo
//parašiutas? 2
//Parašiutas išsiskleis
//---------------------------------------------
//Iš kokio aukščio šoka parašiutininkas? 50.9
//Per kiek sekundžių išsiskleidžia jo
//parašiutas? 3.3
//Parašiutas neišsiskleis
import java.util.Scanner;
public class KTU2001 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Iš kokio aukščio šoka parašiutininkas? ");
        double h = reader.nextDouble();

        System.out.print("Per kiek sekundžių išsiskleidžia jo parašiutas? ");
        double t = reader.nextDouble();

        double g=9.8;

        double t1=Math.sqrt((2*h)/g);

        if (t<=t1) {
            System.out.println("Parašiutas išsiskleis.");
        } else {
            System.out.println("Parašiutas neišsiskleis.");
        }

        reader.close();
    }
}
