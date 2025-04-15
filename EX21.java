package Prova;

import static java.lang.reflect.Array.set;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<Integer> set1 = new java.util.HashSet<>();
        
        double[] set = new double[10];
        double n2 = 0;
        for (int i = 0; i < 10; i++) {

            int r1 = new Random().nextInt(100);
   set[i] = r1;
            if (r1 %4==0) {
           
                set1.add(r1);
            }
            
          

        } 
        
          for (Integer mon2 : set1) {

            System.out.println(mon2);
        
        }

    }
}
