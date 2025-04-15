package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX37 {
    
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();

        int n2 = 0;
        
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o preco do produto");
            int n1 = teclado.nextInt();
 
            n2 = n2 + n1;
            
            l1.add(n1);

        }

       System.out.println("O valor total eh " + n2);

    }    
    

}
