package Prova;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX26 {
    
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int c = 0;
        
        int n1 = 0;
        
        do {
           
            System.out.println("Digite sua senha");        
            c++;
            n1 = teclado.nextInt();

        } while (n1 != 1234 || c < 3 );  
        
        if (n1 == 1234) {
        
         System.out.println("Fez o minimo");    
        }else {
    
        System.out.println("Nen fez o minimo");  
        }
    }

}
