package UzdaviniaiKTU;
//8. Keltas. Parašykite programą, kuri suskaičiuotų, kelis kartus keltui teks kelti per upę k automobilių,
//jeigu vienu metu jis gali perkelti m automobilių. Keltas kelia tik tada, kai yra pilnas (susidaro m automobilių.)
//Taip pat išveskite automobilių skaičių,
//kuriems persikelti per upę nepavyks (jei buvo 11 automobilių,
//o į keltą telpa 10, tai 10 perkels, o vienas liks neperkeltas).
//Automobilių skaičius: 27
//Į keltą telpa automobilių: 10
//Perkels per kartų: 2
//Liks neperkelta: 7
import java.util.Scanner;
public class KTU1008 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Automobilių skaičius: ");
        int auto = reader.nextInt();

        System.out.print("Į keltą telpa automobilių: ");
        int fit = reader.nextInt();

        int n = auto/fit;
        auto=auto%fit;

        System.out.printf("Perkels per kartų: %d", n);
        System.out.println();
        System.out.printf("Liks neperkelta: %d", auto);

        reader.close();
    }
}
