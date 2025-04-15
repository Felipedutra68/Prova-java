package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX33 {
    
     public static void main(String[] args) {

        java.util.HashSet<String> set = new java.util.HashSet<>();

        Scanner teclado = new Scanner(System.in);
        
        set.add("arroz");
       set.add("coca");
        set.add("carne");

         System.out.println("Digite um produto");        
            
           String n1 = teclado.nextLine();
        
        boolean cont1 = set.contains(n1);

        System.out.println("No supermercado tem " + n1 + " ? " + cont1);
        
     }
}
