package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4004 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite knygos skyrių skaičių: ");
        int m = reader.nextInt();

        int day=0;
        int sum=0;
        int sk=1;

        for (int i = 1; i <= m; i++) {
            if (sum>=m) {
                break;
            }
            sum=sum+(sk * i);
            day++;
        }

        double avg=(double)m/day;

        System.out.printf("Tadas visą knygą perskaitys per %d dienas (-ų).%n", day);
        System.out.printf("Tadas vidutiniškai per dieną perskaitė %.2f skyrius", avg);


        reader.close();
    }
}
