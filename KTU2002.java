package UzdaviniaiKTU;
//2. Didžioji kūdrinė varlė. Didžioji kūdrinė varlė – beuodegis varliagyvis.
//Ji sveria m gramų (m - realusis skaičius). Mokslininkai,
//tyrinėjantys didžiąsias kūdrines varles, nusprendė n varlių stebėti.
//Jei stebimos varlės svers daugiau kaip 5 kilogramus, ekrane turi būti rodomas pranešimas,
//Varlių stebėjimui pakanka“, jei mažiau – ,,Varlių stebėjimui per mažai“.
//--------------------------
//Kiek sveria varlė? 100
//Kiek varlių norima stebėti? 1000
//Varlių stebėjimui pakanka
//--------------------------
//Kiek sveria varlė? 75
//Kiek varlių norima stebėti? 50
//Varlių stebėjimui per mažai
import java.util.Scanner;
public class KTU2002 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek sveria varlė? ");
        double m = reader.nextDouble();

        System.out.print("Kiek varlių norima stebėti? ");
        double n = reader.nextDouble();

        double m1=(m/1000)*n;

        if (m1>=m) {
            System.out.println("Varlių stebėjimui pakanka.");
        } else {
            System.out.println("Varlių stebėjimui per mažai.");
        }

        reader.close();
    }
}
