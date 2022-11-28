package arrayPrimos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(PURPLE_BACKGROUND +"Olá, seja bem-vindo(a) ao meu código." +RESET);
        primos();
    }

    static void primos(){
        Scanner escolha = new Scanner(System.in);
        System.out.print(GREEN_BACKGROUND +"Digite um número para ver seus antecessores\n" +
                "primos ou não primos: "+RESET);
        String entrada = escolha.next();
        Tratamentos tratar = new Tratamentos();
        double x = Tratamentos.tratamentoErros(entrada);
        menu((int)x);
    }

    static void menu(int valorDigitado){
        Scanner escolha = new Scanner(System.in);
        System.out.print("ESCOLHA: \n[1] VER TODOS OS PRIMOS \n[2] VER TODOS OS NÃO PRIMOS\n");
        String entrada = escolha.next();
        Tratamentos tratar = new Tratamentos();
        double x = Tratamentos.tratamentoMenu(entrada, valorDigitado);
    }
    public static final String RED_BACKGROUND = "\u001B[31m";
    public static final String GREEN_BACKGROUND = "\u001B[32m";
    public static final String PURPLE_BACKGROUND = "\u001B[35m";

    public static final String RESET = "\u001B[0m";


}

