package UzdaviniaiKTU;
//7. Jonuko problema. Jonukas žino, kad mokytoja jam gali duoti spręsti vieną iš trijų kontrolinio darbo variantų.
//Atlikdamas užduotį jis gaus du skaičius a ir b, o jam reikės apskaičiuoti x reikšmę pagal vieną iš trijų formulių.
//Pirmas variantas: x = ab+3;
//Antras variantas: x = a+b;
//Trečias variantas: x = a-b.
//Parašykite programą, kuri padėtų Jonukui pasitikrinti,
//ar jis teisingai skaičiuoja x reikšmę spręsdamas kiekvieno varianto užduotį.
//--------------------------
//Įveskite užduoties variantą. 1
//Įveskite a reikšmę. 5
//Įveskite b reikšmę. 2
//Atsakymas: x = 13
//--------------------------
//Įveskite užduoties variantą. 2
//Įveskite a reikšmę. 5
//Įveskite b reikšmę. 2
//Atsakymas: x = 7
//--------------------------
//Įveskite užduoties variantą. 3
//Įveskite a reikšmę. 2
//Įveskite b reikšmę. 3
//Atsakymas: x = -1
import java.util.Scanner;

public class KTU2007 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite užduoties variantą. ");
        int x=reader.nextInt();

        System.out.print("Įveskite a reikšmę. ");
        int a=reader.nextInt();

        System.out.print("Įveskite b reikšmę. ");
        int b=reader.nextInt();

        int ats=1;

        if (x==1) {
            ats=(a*b)+3;
        } else if (x==2) {
            ats=a+b;
        } else {
            ats=a-b;
        }

        System.out.printf("Atsakymas: x = %d", ats);

        reader.close();
    }
}
