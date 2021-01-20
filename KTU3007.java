package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3007 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek kartų šokinėjo: ");
        int m=reader.nextInt();

        int i=0;
        int k=0;
        int sum=0;
        while (i<m) {
            System.out.printf("Kiek sušokinėjo kartų %d bandymu: ", i);
            k=reader.nextInt();
            sum=sum+k;
            i++;
        }

        double avg=(double)sum/m;

        System.out.printf("Iš viso: %d %n", sum);
        System.out.printf("Vidutiniškai: %.0f", avg);

        reader.close();
    }
}
