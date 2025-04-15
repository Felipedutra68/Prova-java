package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < 8; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();

            l1.add(n1);

        }

        Collections.sort(l1);

        l1.remove(0);
        l1.remove(0);
        l1.remove(0);
        l1.remove(0);
        l1.remove(0);
        l1.remove(0);
        l1.remove(1);

        System.out.println(l1);

    }
}
