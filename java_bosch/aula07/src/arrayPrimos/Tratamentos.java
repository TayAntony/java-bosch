package arrayPrimos;

import java.util.Scanner;

public class Tratamentos {

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
                    System.out.println(RED_BACKGROUND + "Digite um número inteiro maior que 0!" + RESET);
                    System.out.print(GREEN_BACKGROUND +"Digite um número para ver seus antecessores\n" +
                            "primos ou não primos: "+RESET);
                    num = escolha.next();
                }
            }catch(Exception e){
                System.out.println(RED_BACKGROUND + "Opção inválida, tente novamente..." + RESET);
                System.out.print(GREEN_BACKGROUND +"Digite um número para ver seus antecessores\n" +
                        "primos ou não primos: "+RESET);
                num = escolha.next();
            }
        }
    }

    static double tratamentoMenu (String num, int valorDigitado) {
        Scanner escolha = new Scanner(System.in);
        while (true) {
            double valorMenu;
            try {
                Integer numero = Integer.parseInt(num);

                if (numero > 0) {
                    if (numero == 1) {
                        Primos primo = new Primos();
                        System.out.println(numero);
                        primo.preencherLista(valorDigitado,"p");
                        break;
                    } else if (numero == 2) {
                        Primos primo = new Primos();
                        primo.preencherLista(valorDigitado, "n");
                        break;
                    } else {
                        System.out.println(RED_BACKGROUND + "Digite apenas 1 ou 2!" + RESET);
                        System.out.print("ESCOLHA: \n[1] VER TODOS OS PRIMOS \n[2] VER TODOS OS NÃO PRIMOS\n");
                        num = escolha.next();
                    }
                } else {
                    System.out.println(RED_BACKGROUND + "Digite um número inteiro maior que 0!" + RESET);
                    System.out.print("ESCOLHA: \n[1] VER TODOS OS PRIMOS \n[2] VER TODOS OS NÃO PRIMOS\n");
                    num = escolha.next();
                }
            } catch (Exception e) {
                System.out.println(RED_BACKGROUND + "Opção inválida, tente novamente..." + RESET);
                System.out.print("ESCOLHA: \n[1] VER TODOS OS PRIMOS \n[2] VER TODOS OS NÃO PRIMOS\n");
                num = escolha.next();
            }
        }
        return 0;
    }
    public static final String RED_BACKGROUND = "\u001B[31m";
    public static final String GREEN_BACKGROUND = "\u001B[32m";
    public static final String PURPLE_BACKGROUND = "\u001B[35m";

    public static final String RESET = "\u001B[0m";

}
