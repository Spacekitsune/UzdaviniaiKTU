package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4003 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Petriukas gavo saldainių: ");
        int n = reader.nextInt();

        int dose = 0;
        int sum = 0;
        int days = 0;
        int likutis = n;

        for (int i = 0; i < n; i++) {
            System.out.print("Per dieną suvalgė: ");
            dose = reader.nextInt();
            sum = sum + dose;
            if (sum>=n) {
                break;
            }
            likutis=n-sum;
            days++;
        }

        System.out.printf("Petriukui saldainių užteks %d dienoms ir jam liks %d saldainiai.", days, likutis);

        reader.close();
    }
}

