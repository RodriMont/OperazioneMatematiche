

import java.util.Scanner;

public class OperazioneMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisce 2 numeri: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int risultato = somma(a, b);

        System.out.println( a + " + " + b + " = " + risultato);
        scanner.close();
    }

    public static int somma(int a, int b){

        return a + b;
    }
    
}
