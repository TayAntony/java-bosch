package bosch;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        String numero;
        int convertido;

        System.out.println("=-=-=-=- FIZZ, BUZZ OU FIZZBUZZ -=-=-=-=");

        while (true) {
            try{
                System.out.print("Digite um número: ");
                Scanner entrada = new Scanner(System.in);
                numero = entrada.next();
                convertido = Integer.parseInt(numero);
                break;
            }

            catch (Exception e) {
                System.out.println("Você não digitou um valor válido!");
            }
        }

        if(convertido%2==0 && convertido %5==0){
            System.out.println(numero + " é FizzBuzz");
        } else if(convertido%2==0){
            System.out.println(numero + " é Fizz");
        } else if(convertido%5==0){
            System.out.println(numero + " é Buzz");
        } else{
            System.out.println(numero + " não é divisível por 2 nem por 5!");
        }
    }
}
