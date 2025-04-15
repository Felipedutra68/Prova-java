package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX4 {

    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();

        ArrayList<String> l2 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite uma palavra");
            String n1 = teclado.nextLine();

            l1.add(n1);

        }

        for (String mon1 : l1) {

            if (mon1.length() > 4) {

                l2.add(mon1);

            }
        }

        int tamanho = l2.size();

        System.out.println("\nNa nossa sala possuem " + tamanho + " alunos");

    }

}
