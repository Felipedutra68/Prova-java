package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX35 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> l1 = new ArrayList<>();

        System.out.println("Digite uma palavra");

        String n1 = teclado.nextLine();

        l1.add(n1);

        do {

            System.out.println("Digite uma palavra");

            n1 = teclado.nextLine();

            l1.add(n1);

        } while (!"fim".equals(n1));

        Collections.sort(l1);

        for (String mon2 : l1) {

            System.out.println(mon2);

        }

    }

}
