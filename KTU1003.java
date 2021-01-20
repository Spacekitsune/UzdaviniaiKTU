package UzdaviniaiKTU;
//3. Taupyklė. Jonas turi kiaulę taupyklę, kurioje yra a monetų po 5 ct, b monetų po 20 ct ir c monetų po 2 Lt.
//Kitokios vertės monetų taupyklėje nėra. Parašykite programą,
//kuri suskaičiuotų, kiek pinigų kiaulėje taupyklėje iš viso turi Jonas.
//Atsakymą pateikite litais,
//pvz.: kai taupyklėje yra 12 monetų po 5 ct, 5 monetos po 20 ct ir 6 monetos po 2 Lt,
//tuomet ekrane turi būti rodoma: Taupyklėje yra 13.60 Lt.
//Kiek yra monetų po 5 ct? 5
//Kiek yra monetų po 20 ct? 0
//Kiek yra monetų po 2 Lt? 3
//Taupyklėje yra 6.25 Lt.
import java.util.Scanner;
public class KTU1003 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kiek yra monetų po 5 ct? ");
        int ct5 = reader.nextInt();

        System.out.print("Kiek yra monetų po 20 ct? ");
        int ct20 = reader.nextInt();

        System.out.print("Kiek yra monetų po 2 Lt? ");
        int lt2 = reader.nextInt();

        double suma = (ct5 * 5) + (ct20 * 20) + (lt2 * 200);
        double sumaLt = suma/100;

        System.out.printf("Taupyklėje yra %.2f Lt", sumaLt);

        reader.close();
    }
}
