package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4002 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite kuro bako talpą: ");
        int t=reader.nextInt();

        System.out.print("Įveskite kuro sąnaudas n: ");
        int n=reader.nextInt();

        int lyg=n;
        int nelyg=2*n;
        int sum=0;
        int days=0;

        for(int i=0;i<20; i++) {
            if (sum>=t) {
                break;
            }
            if (i % 2 == 0) {
                sum = sum + nelyg;
            } else if (i % 2 != 0){
                sum = sum + lyg;
            }
            days++;
        }

        System.out.printf("Keliauti bus galima %d dienų/(as)/(ą).", days);

        reader.close();
    }
}
