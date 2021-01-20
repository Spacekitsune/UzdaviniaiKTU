package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4005 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite sumą: ");
        int lt=100;
        int m=0;
        int count100=0;
        int sum=0;
        int counter=0;

        for (int i =1; i>0; i++) {
            m = reader.nextInt();
            if (m==0) {
                break;
            }
            if (m>100) {
                count100++;
            }
            sum=sum+m;
            counter++;
        }

        double avg=(double)sum/counter;

        System.out.printf("Buvo įvykdita %d užsakymų, kurių suma viršijo 100Lt.%n", count100);
        System.out.printf("Vidutinė išvežiotų prekių suma: %.2f Lt. %n", avg);
        System.out.printf("Išviso buvo išvežiota %d prekių. %n", counter);

        reader.close();
    }
}
