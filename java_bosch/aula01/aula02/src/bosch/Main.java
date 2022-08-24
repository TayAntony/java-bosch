package bosch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(16)); //raiz quadrada tipo double
        System.out.println(Math.pow(2,6)); //potência tipo double
        // a biblioteca Math não precisa ser importada pois é java.lang

        Scanner entrada = new Scanner(System.in); //leitura de dados pelo teclado, o new inicializa a variável
        String nome, sobrenome;
        int idade;

        System.out.println("Digite seu nome:");
        nome = entrada.next(); // o next lê até o próximo caractere de espaço

        System.out.println("Digite seu sobrenome:");
        sobrenome = entrada.next(); // nextLine lê a linha toda

        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        System.out.println("Olá "+ nome + " " + sobrenome + "! Você tem " + idade + " anos");

    }
}
