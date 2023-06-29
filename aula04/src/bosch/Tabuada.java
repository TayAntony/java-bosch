package bosch;

public class Tabuada {
    public static void main(String[] args) {
        int resultado;
        int j;
        int i;

        for( j = 1; j <= 10; j++){
            System.out.printf("=-=-= TABUADA DO %d =-=-=\n", j);
            for (i=0 ; i < 11; i++) {
                resultado = j*i;
                System.out.printf("%d x %d = %d\n", j, i, resultado);
            }
        }

    }
}
