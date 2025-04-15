package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX6 {

    public static double n4(int c) {

        if (c >= 3) {

            System.out.println("As listas sao iguais");

        } else {

            System.out.println("As listas sao diferentes");

        }

        return c;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        int c = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();

            l1.add(n1);

        }

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite uma idade");
            int n1 = teclado.nextInt();

            l2.add(n1);

        }
        for (Integer mon1 : l1) {
            for (Integer mon2 : l2) {

                if (mon1 == mon2) {

                    c++;
                }
                }
            }
            n4(c);

        
    }
}
