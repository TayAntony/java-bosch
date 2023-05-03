package bosch;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        double fahrenheit, celsius;
        Scanner entrada = new Scanner(System.in);

// convertendo para celsius
        System.out.println("Digite um número em ºF: ");
        fahrenheit = entrada.nextDouble();
        celsius = (fahrenheit - 32)*5/9;

        System.out.printf("%.1fºF em celsius é %.1fºC\n", fahrenheit, celsius);

// convertendo para fahrenheit
        System.out.println("Digite um número em ºC: ");
        celsius = entrada.nextDouble();
        fahrenheit = (celsius * 9/5) +32;

        System.out.printf("%.1fºC em fahrenheit é %.1fºF", celsius, fahrenheit);

    }
}
