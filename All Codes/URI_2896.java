import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI_2896 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            int t, k, n, temp;
            
            t = input.nextInt();

            while (t != 0) {
                k = input.nextInt();
                n = input.nextInt();

                if (k > n) {
                    temp = (k / n) + (k % n);
                } else if (k < n) {
                    temp = k;
                } else {
                    temp = 1;
                }
                System.out.printf("%d\n", temp);
                t--;
            }
        }
    }
}