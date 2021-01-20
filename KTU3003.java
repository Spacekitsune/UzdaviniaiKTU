package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3003 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite, kiek snaigių nukrito per pirmąją sekundę ir kiek sekundžių snigo: ");
        int k =reader.nextInt();
        int n =reader.nextInt();

        int s=k;
        int t=2;
        while (t<=n) {
            k=k*2;
            s=s+k;
            t++;
        }

        System.out.printf("Viso iškrito snaigių: %d", s);

        reader.close();
    }
}
