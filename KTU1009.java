package UzdaviniaiKTU;
//9. Gimtadienis. Tautvydas rengia gimtadienio šventę. Norėdamas pavaišinti svečius, jis iškepė
//a sausainių. Prasidėjus šventei, jis pastebėjo, kad dar b draugų iškepė lygiai tiek pat sausainių
//kaip ir jis, ir atsinešė į gimtadienį. Šventėje iš viso dalyvavo c žmonių (įskaitant ir patį
//jubiliatą). Norėdamas, kad nei vienas neliktų nuskriaustas, Tautvydas sausainius visiems
//svečiams padalijo po lygiai ir, kadangi šiandien jo gimtadienis, likusius po dalybų nusprendė
//pasilikti sau. Parašykite programą, kuri apskaičiuotų, po kiek sausainių gavo kiekvienas
//gimtadienio dalyvis ir kiek papildomai sausainių atiteko Tautvydui.
//Kiek sausainių iškepė Tautvydas? 20
//Keli draugai dar atsinešė po tiek pat sausainių? 4
//Kiek žmonių iš viso dalyvavo šventėje? 24
//Kiekvienas šventės dalyvis gavo po 4 sausainius
//Tautvydui papildomai atiteko 4 sausainiai
import java.util.Scanner;
public class KTU1009 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek sausainių iškepė Tautvydas? ");
        int vnt = reader.nextInt();

        System.out.print("Keli draugai dar atsinešė po tiek pat sausainių? ");
        int man = reader.nextInt();

        System.out.print("Kiek žmonių iš viso dalyvavo šventėje? ");
        int ppl = reader.nextInt();

        int total=vnt*(man+1);
        int kukiePerPpl=total/ppl;
        int likutis=total%ppl;

        System.out.printf("Kiekvienas šventės dalyvis gavo po %d sausainius", kukiePerPpl);
        System.out.println();
        System.out.printf("Tautvydui papildomai atiteko %d sausainiai", likutis);

        reader.close();
    }
}
