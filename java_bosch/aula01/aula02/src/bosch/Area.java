package bosch;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double base, altura, area;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos descobrir a área de um Triângulo?");
        System.out.println("****************************************");
        System.out.println("Digite o valor da base: ");
        base = entrada.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextDouble();

        area = (base*altura)/2;

        System.out.printf("A área do nosso triângulo é %.1f", area);
    }
}
