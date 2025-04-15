package Prova;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();

        int c = 0;

        System.out.println("Digite um animal");
        String n1 = teclado.nextLine();

        set.add(n1);

        String m1 = n1;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite um animal");
            n1 = teclado.nextLine();

            set.add(n1);

        }

        for (String n2 : set) {

            if (n2 == m1) {

                c++;

            }
        }

        System.out.println("Animais repitidos: " + c);

    }
}
