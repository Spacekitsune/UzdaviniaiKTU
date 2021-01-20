package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3009 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek buvo pirkinių: ");
        int n=reader.nextInt();

        int i=1;
        int ct=0;
        int m=0;
        int sumCt=0;
        int sumM=0;
        while (i<=n) {
            System.out.printf("Įveskite %d pirkinio kainą ir svorį: ", i);
            ct=reader.nextInt();
            m=reader.nextInt();
            sumCt=sumCt+ct;
            sumM=sumM+m;
            i++;
        }

        double avg=(double)sumCt/n;
        int lt= (int)avg/100;
        double ct1=avg%100;


        System.out.printf("Pirkinio vidutinė kaina: %d Lt %.0f ct. %n", lt, ct1);
        if (sumM<=5000) {
            System.out.println("Petriukas galės parnešti pirkinius.");
        } else {
            System.out.println("Petriukas nrgalės parnešti pirkinių.");
        }

        reader.close();
    }
}
