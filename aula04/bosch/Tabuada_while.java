package bosch;

public class Tabuada_while {
    public static void main(String[] args) {
        int resultado;
        int i = 1;
        int j = 1;

        while(j <= 10){
            System.out.printf("=-=-= TABUADA DO %d =-=-=\n", j);

            while(i <=10){
                resultado = j*i;
                System.out.printf("%d x %d = %d\n", j, i, resultado);
                i++;
            }
            i=0;
            j++;
        }
    }
}
