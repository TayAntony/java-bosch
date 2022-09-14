package bosch;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        String numero;
        int convertido;

        System.out.println("=-=-=-=- PAR OU ÍMPAR? -=-=-=-=");
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


        if(convertido % 2 == 0){
            System.out.println(numero + " é par");
        } else{
            System.out.println(numero + " é ímpar");
        }
    }
}
