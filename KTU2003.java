package UzdaviniaiKTU;
//3. Matematika. Petriukas per pusmetį gavo 5 matematikos pažymius.
//Mokytoja nusprendė padaryti vaikams staigmeną: mokiniai, kurių pažymių vidurkis yra didesnis už 9,
//gaus tris saldainius, o mokiniams, kurių vidurkis yra tarp 7 ir 9, įskaitant intervalo galus,
//bus apdovanoti dviem saldainiais. Visi likusieji gaus po vieną saldainį.
//Parašykite programą, kuri pagal įvestus Petriuko pažymius apskaičiuotų, kiek saldainių jis gaus.
//--------------------------
//Kokius pažymius gavo Petriukas? 8 9 6 5 10
//Petriukas gaus du saldainius
//--------------------------
//Kokius pažymius gavo Petriukas? 10 10 8 9 10
//Petriukas gaus tris saldainius
//--------------------------
//Kokius pažymius gavo Petriukas? 5 5 4 5 5
//Petriukas gaus vieną saldainį
import java.util.Scanner;
public class KTU2003 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kokius pažymius gavo Petriukas? ");
        double p1= reader.nextDouble();
        double p2= reader.nextDouble();
        double p3= reader.nextDouble();
        double p4= reader.nextDouble();
        double p5= reader.nextDouble();

        double avg=(p1+p2+p3+p4+p5)/5;

        if (avg>9) {
            System.out.println("Petriukas gaus tris saldainius");
        } else if ((avg<=9)&&(avg>=7)) {
            System.out.println("Petriukas gaus du saldainius.");
        } else {
            System.out.println("Petriukas gaus vieną saldainį.");
        }

        reader.close();
    }
}
