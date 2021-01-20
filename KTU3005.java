package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3005 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n=10;
        int counter=0;
        int i=0;
        int sk=0;

        System.out.print("Įveskite draugų sugalvotus skaičius: ");
        while (i<n) {
            sk = reader.nextInt();
            if (sk%2==0) {
                counter++;
            }
            i++;
        }

        if (counter>0) {
            System.out.printf("Atsakymas: %d", counter);
        } else {
            System.out.println("Atsakymas: Nėra");
        }

        reader.close();
    }
}
