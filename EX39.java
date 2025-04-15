package Prova;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX39 {

     public static String somar(String n1, String n2) {

        String f1 = "";

        if (n1 == null ? n2 == null : n1.equals(n2)) {
            f1 = "True";
            System.out.println("A palavra eh um palindromo? " + f1);
        } else {

            f1 = "False";
            System.out.println("A palavra eh um palindromo? " + f1);
        }

        return f1;
    }

    public static void main(String[] args) {

        String n2 = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String n1 = teclado.nextLine();

        for (int i = n1.length() - 1; i >= 0; i--) {

            n2 = n2 + n1.charAt(i);
        }
        somar(n1, n2);

        
    }

    
}
