package Prova;

import static EX11.EX3_Int_Media.somar;
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX8 {

    public static ArrayList<Double> somar(ArrayList<Double> set, ArrayList<Double> set1, ArrayList<Double> set3) {

        for (Double nome1 : set) {
            if (set1.contains(nome1)) {
                set3.add(nome1);

            }
        }

        for (Double nome2 : set3) {

            System.out.println(nome2);

        }

        return set3;
    }

    public static void main(String[] args) {

        ArrayList<Double> set1 = new ArrayList<>();

        ArrayList<Double> set = new ArrayList<>();

        ArrayList<Double> set3 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        double[] set12 = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite um numero");
            double n1 = teclado.nextDouble();

            set.add(n1);

        }

        double[] set13 = new double[3];

        for (int o = 0; o < 3; o++) {

            System.out.println("Digite um numero");
            double n2 = teclado.nextDouble();
            set1.add(n2);
            somar(set, set1, set3);
        }

        set3.toArray();

        for (Double nome2 : set3) {

            System.out.println(nome2);

        }

    }
}
