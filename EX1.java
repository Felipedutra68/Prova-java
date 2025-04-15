package Prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX1 {

      public static double net(double n2, double set[])  {  

          ArrayList<Double> l1 = new ArrayList<>();
         
   double n3 = n2 / 5;

   for (double mon1 : set) {

            if (mon1 > n3) {

                l1.add(mon1);

            }
        }

        for (double mon2 : l1) {

            System.out.println(mon2);

        }
     
    return n3;
     }       
 
    
    
    public static void main(String[] args) {

        ArrayList<Double> l1 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        double[] set = new double[5];
        double n2 = 0;
        for (int i = 0; i < set.length; i++) {

            System.out.println("Digite um numero");
            set[i] = teclado.nextDouble();
            n2 += set[i];

        }

        net(n2, set);

        
    }
    
}
