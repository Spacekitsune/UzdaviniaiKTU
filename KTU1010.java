package UzdaviniaiKTU;
//10. Mariaus saldainiai. Marius kiekvieną dieną gauna po n saldainių. Jis suvalgo po a
//saldainių, o likusius kaupia Kalėdų dovanoms. Kai Marius pradėjo kaupti saldainius, iki Kalėdų
//buvo likę k dienų. Parašykite programą, kuri suskaičiuotų keliems draugams d Marius galės
//paruošti kalėdinius saldainių rinkinius, jei kiekviename rinkinyje bus po a saldainių ir kiek
//saldainių s liks supakavus dovanas.
//Kiek saldainių gauna Marius? 15
//Po kiek saldainių suvalgo? 4
//Kelios dienos liko iki Kalėdų? 22
//Po kiek saldainių bus rinkinyje? 4
//Marius dovanas paruoš 60 draugų.
//Supakavus dovanas liks 2 saldainiai.
import java.util.Scanner;
public class KTU1010 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek saldainių gauna Marius? ");
        int kandi = reader.nextInt();

        System.out.print("Po kiek saldainių suvalgo? ");
        int kandiEat = reader.nextInt();

        System.out.print("Kelios dienos liko iki Kalėdų? ");
        int days = reader.nextInt();

        System.out.print("Po kiek saldainių bus rinkinyje? ");
        int rinkinys = reader.nextInt();

        kandi=kandi-kandiEat;
        int rinkinysTotal=kandi*days;
        int draugai=rinkinysTotal/rinkinys;
        kandi=rinkinysTotal%rinkinys;

        System.out.printf("Marius dovanas paruoš %d draugų.", draugai);
        System.out.println();
        System.out.printf("Supakavus dovanas liks %d saldainiai.", kandi);

        reader.close();
    }
}
