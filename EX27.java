package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX27 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> l1 = new ArrayList<>();

        ArrayList<String> l2 = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            System.out.println("Digite um numero");
            String n1 = teclado.nextLine();

            l1.add(n1);

        }

        for (String mon1 : l1) {

            if (mon1.startsWith("a")) {

                l2.add(mon1);

            }

            if (mon1.startsWith("e")) {

                l2.add(mon1);

            }

            if (mon1.startsWith("i")) {

                l2.add(mon1);

            }

            if (mon1.startsWith("o")) {

                l2.add(mon1);

            }

            if (mon1.startsWith("u")) {

                l2.add(mon1);

            }

        }

        for (String mon2 : l2) {

            System.out.println(mon2);

        }
    }
}
