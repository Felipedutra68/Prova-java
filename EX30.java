package Prova;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX30 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        java.util.HashSet<Integer> set2 = new java.util.HashSet<>();

        java.util.HashSet<Integer> set3 = new java.util.HashSet<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();

            set.add(n1);

        }

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();

            set2.add(n1);

        }

        for (Integer m1 : set) {
            for (Integer m2 : set2) {

                set3.add(m1);
                if (!Objects.equals(m2, m1)) {
                    set3.add(m2);
                }
            }

            for (Integer mon2 : set3) {

                System.out.println(mon2);

            }

        }
    }
}
