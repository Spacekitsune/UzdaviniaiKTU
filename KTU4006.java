package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("1. Suma");
        System.out.println("2. Atimtis");
        System.out.println("3. Daugyba");
        System.out.println("4. Didžiausia reikšmė");
        System.out.println("5. Mažiausia reikšmė");
        System.out.print("Įveskite veiksmo nr.: ");
        int action = reader.nextInt();
        int m=0;
        int sum=0;
        int diff=0;
        int mult=1;
        int max=0;
        int min=0;

        for (int i =1; i>0; i++) {
            m = reader.nextInt();
            if (m==0) {
                break;
            }

            if (action==1) {
                sum=sum+m;
            } else if (action==2) {
               if (i==1) {
                   diff=m;
               } else {
                   diff = diff - m;
               }
            } else if (action==3) {
                mult=mult*m;
            } else if (action==4) {
                if (m>max) {
                    max=m;
                }
            } else if (action==5) {
                if ((m<min)&&(m!=0)) {
                    min=m;
                } else if (i==1) {
                    min=m;
                }
            }
        }

        if (action==1){
            System.out.printf("Suma: %d.%n", sum);
        } else if (action==2) {
            System.out.printf("Skirtumas: %d.%n", diff);
        } else if (action==3) {
            System.out.printf("Sandauga: %d.%n", mult);
        } else if (action==4) {
            System.out.printf("Max: %d.%n", max);
        } else if (action==5) {
            System.out.printf("Min: %d.%n", min);
        } else {
            System.out.println("Neteisingas pasirinkimas.");
        }

        reader.close();
    }
}
