package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU3002 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite žingsnių kiekį iki mokyklos: ");
        int step =reader.nextInt();

       int clap=0;
       int click=0;
       int i =1;

       while ( i<=step) {
           if (i%10==0) {
               clap++;
           } else if (i%5==0){
               click++;
           }
           i++;
       }

       System.out.printf("Suplojimų bus: %d", clap);
       System.out.println();
       System.out.printf("Spragtelėjimų bus: %d", click);

        reader.close();
    }
}
