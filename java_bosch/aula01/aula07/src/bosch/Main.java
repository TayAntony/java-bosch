package bosch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Olá, seja bem-vindo(a) ao meu código.");
        double numeroPrimo = primos();

    }

    static double primos(){
        Scanner escolha = new Scanner(System.in);
        System.out.print("Digite um número para ver seu primo: ");
        String entrada = escolha.next();
        double valor = tratamentoErros(entrada);
        CalcularPrimo calcular = new CalcularPrimo(valor);
        calcular.calcular();
        return valor;
    }

    static double tratamentoErros (String num){
        Scanner escolha = new Scanner(System.in);
        while(true){
            double valorMenu;
            try{
                Integer numero = Integer.parseInt(num);
                if(numero > 0) {
                    return numero;
                }
                else{
                    System.out.println("Digite um número inteiro maior que 0!");
                    num = escolha.next();
                }
            }catch(Exception e){
                System.out.println("Opção inválida, tente novamente...");
                num = escolha.next();
            }
        }
    }
}
