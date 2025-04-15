package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX3 {

    public static void main(String[] args) {

        ArrayList<Double> l1 = new ArrayList<>();

        ArrayList<Double> l2 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o preco do produto");
            double n1 = teclado.nextDouble();

            l1.add(n1);
            
        }

        for (Double mon1 : l1) {

            if (mon1 > 100) {

                l2.add(mon1);

            }
        }

        for (Double mon2 : l2) {

            System.out.println(mon2);

        }

    }

}
