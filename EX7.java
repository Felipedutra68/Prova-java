package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();

            l1.add(n1);

        }

        for (Integer mon1 : l1) {

            if (mon1 % 2 != 0) {

                l2.add(mon1);

            }
        }

        Collections.reverse(l2);

        for (Integer mon2 : l2) {

            System.out.println(mon2);

        }

    }

}
