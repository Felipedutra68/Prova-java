package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX15 {

    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();

        int c1 = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite uma palavra");
            String n1 = teclado.nextLine();

            l1.add(n1);

        }

        for (String n1 : l1) {

            for (int i = 0; i < n1.length(); i++) {
                int c = 0;
                char n = n1.charAt(i);

                if (n == 'e') {
                    c++;
                }
                if (n == 'e') {
                    c++;
                }

                if (c >= 2) {

                    c1++;

                }

            }
        }

        System.out.println("Tem " + c1 / 2 + " palavras que contem 2 e");

    }

}
