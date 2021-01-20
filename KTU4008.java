package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4008 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Keliems draugams Linas nori dovanoti atvirukus? ");
        int friend=reader.nextInt();
        System.out.print("Kiek rūšių atvirukų yra parduotuvėje? ");
        int n=reader.nextInt();

        int x=0;
        int sum=0;
        int counter=0;

        for(int i=1;i<=n;i++) {
            System.out.printf("Kiek yra %d rūšies atvirukų? ", i);
            x=reader.nextInt();

            if (sum<=friend) {
                sum=sum+x;
                counter++;
            }
        }

        System.out.printf("%d rūšių atvirukų užtektų visiems Lino draugams", counter);
        reader.close();
    }
}
