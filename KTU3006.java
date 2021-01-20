package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite kauliukų kiekį: ");
        int n=reader.nextInt();

        int k=0;
        int i=1;
        int sum=0;

        while (i<=n) {
            System.out.printf("%d-o kauliuko taškų kiekis: ", i);
            k = reader.nextInt();
            sum=sum+k;
            i++;
        }

        int max=6*n;
        double avg=(double)sum/n;

        System.out.printf("Iš viso buvo galima surinkti taškų: %d", max);
        System.out.println();
        System.out.printf("Tomas iš viso surinko: %d taškų", sum);
        System.out.println();
        System.out.printf("Jo taškų vidurkis: %.1f", avg);
        System.out.println();

        if (sum>max/2) {
            System.out.println("Loterija laimėta.");
        } else {
            System.out.println("Loterija pralaimėta.");
        }


        reader.close();
    }
}
