package bosch;

import java.util.Scanner;

public class Contadores {
    public static void main(String[] args) throws InterruptedException{

        int contador = 0;
        while (contador <=20){                            //loop while com contador
            System.out.println("O contador está em: " + contador);
            contador++;

            Thread.sleep(1000);
        }

        //////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < 20; i++) {                   //loop for com contador explícito
            System.out.println(i);
            Thread.sleep(1000);
        }

        ///////////////////////////////////////////////////////////////////////////

        for(;true;){
            System.out.println("hello"); //for infinito sem contador
            break;
        }

        ////////////////////////////////////////////////////////////////////////////

        Scanner input = new Scanner(System.in);
        String valor = "";
        System.out.println("Digite algo (usando while): ");
        valor = input.nextLine();                     //loop while infinito, ate o user digitar sair
        while (!valor.equalsIgnoreCase("sair")){
            System.out.println("Digite algo (usando while): ");
            valor = input.nextLine();
        }

        /////////////////////////////////////////////////////////////////////////////

        do{
            System.out.println("Digite algo (usando do): ");
            valor = input.nextLine();

        } while(!valor.equalsIgnoreCase("sair")); //loop usando do while (primeira repetição sempre acontece)

        /////////////////////////////////////////////////////////////////////////////

        int contaador = 0, acumulador = 0;           // criando um loop while com contador e acumulador

        while(contaador<5){
            contaador++;
            System.out.println("Digite um número (usando while): ");
            acumulador = acumulador+input.nextInt(); //acumulando os valores digitados
            System.out.printf("Contador está em %d e o acumulador está em %d\n", contaador, acumulador);
        }

        ////////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < 5; i++) {                // criando um loop for com contador e acumulador
            contaador = i;
            acumulador+= i*i;
            System.out.printf("Contador está em %d e acumulador está em %d\n", contaador, acumulador);
        }

        /////////////////////////////////////////////////////////////////////////////

        for(int i = 1; i<=10; i++){                 //usando break em laço for
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        for(int i = 1; i<=10; i++){                 //usando continue em laço for
            if(i%2==0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
