package UzdaviniaiKTU;
//6. Trapecijos plotas. Parašykite programą, kuri,
//įvedus trapecijos pagrindų a ir b bei aukštinės h ilgius, apskaičiuotų trapecijos plotą.
//Trapecijos ilgesniojo pagrindo ilgis: 5
//Trapecijos trumpesniojo pagrindo ilgis: 3
//Trapecijos aukštinės ilgis: 4
//Trapecijos plotas: 16
import java.util.Scanner;
public class KTU1006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Trapecijos ilgesniojo pagrindo ilgis: ");
        int a = reader.nextInt();

        System.out.print("Trapecijos trumpesniojo pagrindo ilgis: ");
        int b = reader.nextInt();

        System.out.print("Trapecijos aukštinės ilgis: ");
        int h = reader.nextInt();

        double s=((a+b)/2)*h;

        System.out.printf("Trapecijos plotas: %.2f", s);

        reader.close();
    }
}
