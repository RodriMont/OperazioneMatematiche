

import java.util.Scanner;

public class OperazioneMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisce 2 numeri: ");

        
        int a = scanner.nextInt();
        scanner.nextLine();
        String operazione = scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine();


        if(operazione.equals("+")){
            int risultato = somma(a, b);
            System.out.println( a + " + " + b + " = " + risultato);

        }else if(operazione.equals("-")){
            int risultato = sosttrazione(a, b);
            System.out.println( a + " - " + b + " = " + risultato);
        }else if(operazione.equals("%")){
            int risultato = modulo(a, b);
            System.out.println( a + " % " + b + " = " + risultato);
        }else if(operazione.equals("*")){
            int risultato = prodotto(a, b);
            System.out.println( a + " * " + b + " = " + risultato);
        }else if(operazione.equals("/")){
            int risultato = quoziente(a, b);
            System.out.println( a + " / " + b + " = " + risultato);
        }else{
            System.out.println("Operazione sconosciuta");
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
    public static int prodotto(int a, int b){
        return a * b;
    }
    public static int quoziente(int a, int b){
        return a / b;
    }
    
}
