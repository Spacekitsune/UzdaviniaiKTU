package UzdaviniaiKTU;
//4. Bandelės. Julius, grįžęs iš mokyklos namo, rado tokį mamos raštelį:
//Nueik į parduotuvę ir nupirk bandelių su varške.
//Jei viena bandelė kainuos ne daugiau kaip a Lt, nupirk n1 bandelių;
//Jei daugiau nei a, bet mažiau nei b, nupirk n2 bandelių;
//O jei kainuos b arba daugiau, negu b - n3 bandelių.
//Nuėjęs į parduotuvę, Julius pamatė, kad bandelė kainuoja k Lt.
//Parašykite programą, kuri apskaičiuotų, kiek pinigų už bandeles sumokės Julius.
//(a visada mažiau nei b).
//Pavyzdžiui, ekrane įvedus tokius duomenis, turėtų būti išvedami tokie rezultatai:
//Įveskite kainas a ir b: 1.50 1.70
//Įveskite kiekius n1, n2, n3: 3 2 1
//Įveskite bandelės kainą: 1.30
//Už bandeles bus sumokėta: 3.90 Lt.
//--------------------------
//Įveskite kainas a ir b: 1.50 1.70
//Įveskite kiekius n1, n2, n3: 3 2 1
//Įveskite bandelės kainą: 1.60
//Už bandeles bus sumokėta: 3.20 Lt.
//--------------------------
//Įveskite kainas a ir b: 1.50 1.70
//Įveskite kiekius n1, n2, n3: 3 2 1
//Įveskite bandelės kainą: 2.05
//Už bandeles bus sumokėta: 2.05 Lt
import java.util.Scanner;
public class KTU2004 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite kainas a ir b: ");
        double a= reader.nextDouble();
        double b= reader.nextDouble();

        System.out.print("Įveskite kiekius n1, n2, n3: ");
        double n1= reader.nextDouble();
        double n2= reader.nextDouble();
        double n3= reader.nextDouble();

        System.out.print("Įveskite bandelės kainą: ");
        double kaina= reader.nextDouble();
        double sum=0;
        if(kaina<=a) {
            sum=n1*kaina;
        } else if ((kaina>a)&&(kaina<b)) {
            sum=n2*kaina;
        } else {
            sum=n3*kaina;
        }

        System.out.printf("Už bandeles bus sumokėta: %.2f Lt.", sum);

        reader.close();
    }
}
