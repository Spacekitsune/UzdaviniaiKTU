package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3004 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek eglučių atvežta? ");
        int n =reader.nextInt();

        int i =0;
        double h=0;
        double sum=0;

        while (i<n) {
            System.out.println("Įveskite 1 eglutės aukštį:");
            h=reader.nextDouble();
            sum=sum+h;
            i++;
        }

        double avg=sum/n;

        System.out.printf("Eglutės aukščio vidurkis: %.1f cm", avg);

        reader.close();
    }
}
