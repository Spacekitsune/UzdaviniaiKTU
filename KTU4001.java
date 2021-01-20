package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4001 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sukauptas riešutų kiekis: ");
        int x=reader.nextInt();

        System.out.print("Voveriukų skaičius: ");
        int v=reader.nextInt();
        v=v+1;

        int days=0;
        int sum=0;
        for (int i=1; i<=x;i++) {
            sum=sum+(v*3);
            if (sum>=x) {
                break;
            }
            days++;
        }

        System.out.printf("Riešutų sukaupta %d dienoms %n", days);
        if (days>=92) {
            System.out.println("Riešutų užteks visai žiemai");
        } else {
            System.out.println("Riešutų neužteks visai žiemai");
        }


        reader.close();
    }
}
