package UzdaviniaiKTU;
//5. Geriausia klasė. Giraitės mokykloje yra keturios dešimtos klasės: a, b, c ir d.
//Direktorius atlieka analizę, nori surasti geriausiai besimokančią dešimtokų klasę,
//pasižiūrėti, keliais balais kiekvienos kitos klasės vidurkis
//yra mažesnis už geriausiai besimokančios klasės vidurkį.
//Parašykite programą, kuri surastų, koks yra didžiausias vidurkis ir keliais balais skiriasi
//likusių klasių vidurkiai nuo geriausiai besimokančios klasės vidurkio.
//--------------------------
//Įveskite klasių vidurkius: 7 8.5 9 6
//Didžiausias vidurkis: 9
//Kitų klasių vidurkiai skiriasi: 2, 0.5, 3
//--------------------------
//Įveskite klasių vidurkius: 7 8 9.5 6
//Didžiausias: 9.5
//Kitų klasių vidurkiai skiriasi: 2.5, 1.5, 3.5
import java.util.Scanner;

public class KTU2005 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite klasių vidurkius: ");
        double a= reader.nextDouble();
        double b= reader.nextDouble();
        double c= reader.nextDouble();
        double d= reader.nextDouble();

        if((a>b)&&(a>c)&&(a>d)) {
           System.out.println("Didžiausias vidurkis: "+a);
           System.out.printf("Kitų klasių vidurkiai skiriasi: %.2f, %.2f, %.2f ",(a-b), (a-c), (a-d));
        } else if ((b>a)&&(b>c)&&(b>d)) {
            System.out.println("Didžiausias vidurkis: "+b);
            System.out.printf("Kitų klasių vidurkiai skiriasi: %.2f, %.2f, %.2f ",(b-a), (b-c), (b-d));
        } else if ((c>a)&&(c>b)&&(c>d)){
            System.out.println("Didžiausias vidurkis: "+c);
            System.out.printf("Kitų klasių vidurkiai skiriasi: %.2f, %.2f, %.2f ",(c-a), (c-b), (c-d));
        } else {
            System.out.println("Didžiausias vidurkis: "+d);
            System.out.printf("Kitų klasių vidurkiai skiriasi: %.2f, %.2f, %.2f ",(d-a), (d-b), (d-c));
        }

        reader.close();
    }
}
