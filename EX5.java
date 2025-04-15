package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX5 {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite uma idade");
            int n1 = teclado.nextInt();

            l1.add(n1);

        }

        for (Integer mon1 : l1) {

            if (mon1 > 18 && mon1 <31) {

                l2.add(mon1);

            }
        }

        int tamanho = l2.size();

        System.out.println("\nVoce digitou " + tamanho + "pessoas ente 18 e 30 anos");

    }

}
