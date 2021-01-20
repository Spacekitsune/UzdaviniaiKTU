package UzdaviniaiKTU;

import java.util.Scanner;

public class KTU4007 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       int x=0;
       int counterCame=0;
       int counterEnter=0;
       for(int i=1;i>0;i++) {
           System.out.print("Įveskite kiek balų gavo mokinys: ");
           x=reader.nextInt();

           if (x==0) {
               break;
           }
           counterCame++;
           if (x>=5) {
               counterEnter++;
           }
       }

       System.out.printf("Į karnavalą ėjo %d mokiniai, pateko %d.", counterCame, counterEnter);
        reader.close();
    }
}
