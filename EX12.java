package Prova;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX12 {
    
public static double net(double n2, double set[], double n3)  {  

    HashSet<Double> set1 = new HashSet<>();
         
 

   for (double mon1 : set) {

            if (mon1 > 5) {

                set1.add(mon1);

            }
        }

        for (double mon2 : set) {

           n3 = n3 + mon2;

        }
     
    //double n4 = n3/set1.length;
               
               
        
    return n3;
     }       
 
    public static void main(String[] args) {

        ArrayList<Double> l1 = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        double n3 = 0;
        
        double[] set = new double[5];
        double n2 = 0;
        for (int i = 0; i < set.length; i++) {

            System.out.println("Digite um numero");
            set[i] = teclado.nextDouble();
            n2 += set[i];

        }

        net(n2, set, n3);

        
    }    

}
