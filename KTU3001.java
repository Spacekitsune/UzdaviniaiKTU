package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3001 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite intervalo pradžią: ");
        int a =reader.nextInt();

        System.out.print("Įveskite intervalo pabaigą: ");
        int b =reader.nextInt();

        int counter=0;

        while (a<=b) {
            if (a%6==0) {
                counter++;
            } a++;
        }

        System.out.printf("Reikalingų marškinėlių skaičius: %d", counter);

        reader.close();
    }
}
