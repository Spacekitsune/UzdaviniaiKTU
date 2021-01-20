package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3008 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek dalyvavo bėgikų: ");
        int n=reader.nextInt();

        int i=1;
        int k=0;
        int sum=0;
        int min=100;
        while (i<=n) {
            System.out.printf("Įveskite %d bėgiko laiką: ", i);
            k=reader.nextInt();
            if (k<min) {
                min=k;
            }
            sum=sum+k;
            i++;
        }

        double avg=(double)sum/n;
        int best=(int)avg-min;

        System.out.printf("Greičiausio bėgiko laikas: %d sek. %n", min);
        System.out.printf("Jis buvo %d sek geresnis už vidurkį.", best);

        reader.close();
    }
}
