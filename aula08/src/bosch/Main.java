package bosch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sequência dos 20 primeiros números de Fibonacci");
        int primeiro = 0;
        int segundo = 1;
        int terceiro;
        int cont = 3;
        System.out.printf("%d → %d", primeiro, segundo);
        while (cont <= 20){
            terceiro = primeiro + segundo;
            System.out.printf(" → %d", terceiro);
            primeiro = segundo;
            segundo = terceiro;
            cont += 1;
        }
    }
}
