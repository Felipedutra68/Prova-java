package Prova;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1 = 0;

        do {
            System.out.println("Cadrastrar[1]");
            System.out.println("Listrar[2]");
            System.out.println("Sair[3]");
            n1 = teclado.nextInt();

        } while (n1 != 3);

    }
}
