import java.util.*;

/**
 * Método recursivo que dado un número entero en base decimal
 * muestre su equivalente en binario
 */
public class Recursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca numero : ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print("Binario: ");
        decABin(n);
        System.out.println();
    }

    public static void decABin(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            decABin(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}