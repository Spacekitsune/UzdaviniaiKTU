package UzdaviniaiKTU;
//6. Žiemojantys paukščiai. Gamtininkas registruoja likusius žiemoti paukščius.
//Jo tikslas yra nustatyti, kurios iš trijų paukščių rūšių atstovų liko žiemoti daugiausia.
//Klaviatūra įvedami trijų paukščių rūšių kiekiai, parašykite programą,
//kuri surikiuotų juos iš eilės nuo didžiausio iki mažiausio ir apskaičiuotų,
//kiek skiriasi didžiausias ir mažiausias kiekiai.
//--------------------------
//Įveskite kiek kiekvienos rūšies paukščių liko žiemoti:
//1000 1500 1800
//1800
//1500
//1000
//Skirtumas tarp didžiausio ir mažiausio kiekio: 800
//--------------------------
//Įveskite kiek kiekvienos rūšies paukščių liko žiemoti:
//5000 3500 6200
//6200
//5000
//3500
//Skirtumas tarp didžiausio ir mažiausio kiekio: 2700
import java.util.Scanner;

public class KTU2006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite kiek kiekvienos rūšies paukščių liko žiemoti: ");
        int n1=reader.nextInt();
        int n2=reader.nextInt();
        int n3=reader.nextInt();

        if ((n1>n2)&&(n2>n3)&&(n1>n3)) {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.printf("Skirtumas tarp didžiausio ir mažiausio kiekio: %d", (n1-n3));
        } else if ((n1>n3)&&(n3>2)&&(n1>n2)) {
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);
            System.out.printf("Skirtumas tarp didžiausio ir mažiausio kiekio: %d", (n1-n2));
        } else if ((n2>n1)&&(n1>n3)&&(n2>n3)) {
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
            System.out.printf("Skirtumas tarp didžiausio ir mažiausio kiekio: %d", (n2-n3));
        } else if ((n2>n3)&&(n3>n1)&&(n2>n1)) {
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);
            System.out.printf("Skirtumas tarp didžiausio ir mažiausio kiekio: %d", (n2-n1));
        } else if ((n3>n1)&&(n1>n2)&&(n3>n2)) {
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
            System.out.printf("Skirtumas tarp didžiausio ir mažiausio kiekio: %d", (n3-n2));
        } else {
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
            System.out.printf("Skirtumas tarp didžiausio ir mažiausio kiekio: %d", (n3-n1));
        }




        reader.close();
    }
}
