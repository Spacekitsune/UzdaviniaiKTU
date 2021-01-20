package UzdaviniaiKTU;
//1. Tiesiniai algoritmai
//1. Pamoka. Parašykite programą, kuri padėtų Petriukui suskaičiuoti,
//kiek pamokų jis turi per savaitę ir kiek tai sudarys minučių.
//Klaviatūra įvedami 5 skaičiai, reiškiantys kiekvienos dienos pamokų skaičių.
//Duomenys
//Kiek pamokų yra pirmadienį? 5
//Kiek pamokų yra antradienį? 6
//Kiek pamokų yra trečiadienį? 4
//Kiek pamokų yra ketvirtadienį? 5
//Kiek pamokų yra penktadienį? 4
//Rezultatai
//Pamokų skaičius: 24
//Tai sudaro minučių: 1080
import  java.util.Scanner;
public class KTU1001 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int pamokaSum=0, min;

        System.out.print("Kiek pamokų yra pirmadienį? ");
        int pamoka = reader.nextInt();
        pamokaSum=pamokaSum+pamoka;

        System.out.print("Kiek pamokų yra antradienį? ");
        pamoka = reader.nextInt();
        pamokaSum=pamokaSum+pamoka;

        System.out.print("Kiek pamokų yra trečiadienį? ");
        pamoka = reader.nextInt();
        pamokaSum=pamokaSum+pamoka;

        System.out.print("Kiek pamokų yra ketvirtadienį? ");
        pamoka = reader.nextInt();
        pamokaSum=pamokaSum+pamoka;

        System.out.print("Kiek pamokų yra penktadienį? ");
        pamoka = reader.nextInt();
        pamokaSum=pamokaSum+pamoka;

        min=pamokaSum*45;

        System.out.println("Rezultatas:");
        System.out.printf("Pamokų skaičius: %d", pamokaSum);
        System.out.println();
        System.out.printf("Tai sudaro minučių: %d", min);

        reader.close();
    }
}
