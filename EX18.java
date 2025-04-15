package Prova;

/**
 *
 * @author ADM
 */
public class EX18 {
    
 public static void main(String[] args) {

        int n1 = 0;

        int[][] set = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}

        };

        boolean in = true;

        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                if (i == c && set[i][c] != 1) {

                    in = false;

                } else if (i != c && set[i][c] != 0) {
                    in = false;
                }

            }
        }
        if (in) {
            System.out.println("A matriz eh uma matriz de identidade");

        } else {

            System.out.println("A matriz nao eh uma matriz de identidade");

        }
    }    

}
