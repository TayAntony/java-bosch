package bosch;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        double quadrado, cubo, pedirNumero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");

        pedirNumero = entrada.nextDouble();

        quadrado = Math.pow(pedirNumero,2);
        System.out.printf("%.1f ao quadrado é %.1f\n",pedirNumero, quadrado);

        cubo = Math.pow(pedirNumero,3);
        System.out.printf("%.1f ao cubo é %.1f",pedirNumero, cubo);

    }
}
