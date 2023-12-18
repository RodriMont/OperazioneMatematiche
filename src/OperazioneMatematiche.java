

import java.util.Scanner;

public class OperazioneMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisce 2 numeri: ");

        System.out.println("Numero a: ");
        int a = scanner.nextInt();
        System.out.println("Operazione a: ");
        String operazione = scanner.nextLine();
        System.out.println("Numero b: ");
        int b = scanner.nextInt();


        if(operazione.equals("+")){
            int risultato = somma(a, b);
            System.out.println( a + " + " + b + " = " + risultato);

        }else if(operazione.equals("-")){
            int risultato = sosttrazione(a, b);
            System.out.println( a + " - " + b + " = " + risultato);
        }else if(operazione.equals("%")){
            int risultato = modulo(a, b);
            System.out.println( a + " % " + b + " = " + risultato);
        }

        
        scanner.close();
    }

    public static int somma(int a, int b){

        return a + b;
    }
    public static int sosttrazione(int a, int b){

        return a - b;
    }

    public static int modulo(int a, int b){
        return a % b;
    }
    
}
