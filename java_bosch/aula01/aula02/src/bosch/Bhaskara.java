package bosch;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Vamos resolver uma equação de segundo grau?");
        System.out.println("(ax2 + bx + c = 0)");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        a = entrada.nextInt();

        System.out.println("Digite o valor de b: ");
        b = entrada.nextInt();

        System.out.println("Digite o valor de c: ");
        c = entrada.nextInt();

        double delta = Math.pow(b,2)-4*a*c;
        System.out.println(delta);

    }
}
