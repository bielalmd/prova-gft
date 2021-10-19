import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = entrada.nextInt();

        if((num % 3 == 0) && (num % 6 == 0) && (num % 7 == 0)){
            System.out.println("Divisivel po 3,6,7.");
            
        }else if(num % 3 == 0 && num % 7 == 0){
            System.out.println("Divisivel por 3,7.");
            
        }else if(num % 3 == 0 && num % 6 == 0){
            System.out.println("Divisivel por 3,6.");
            
        } else if(num % 3 == 0){
            System.out.println("Divisivel por 3.");
            
        }else if(num % 6 == 0) {
            System.out.println("Divisivel por 6.");
            
        }else if(num % 7 == 0) {
            System.out.println("Divisivel por 7.");
            
        }else{
            System.out.println("O número informado não é divisivel 3,6,7");
        }

        entrada.close();
    }
}