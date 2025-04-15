package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX38 {
    
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        int n2 = 0;
        
        for (int i = 0; i < 10; i++) {

            System.out.println("Digite o preco do produto");
            int n1 = teclado.nextInt();
 
            n2 = n2 + n1;
            
            l1.add(n1);

        }

      for (Integer m1 : l1) {

          if (m1 >20 && m1 < 70 ) { 
              
          l2.add(m1);
              
              
          }
        }

       for (Integer mon2 : l2) {

            System.out.println(mon2);

        }
      
    }        
    

}
