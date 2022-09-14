package bosch;

public class Contadores {
    public static void main(String[] args) throws InterruptedException{
        int contador = 0;
        while (contador <=20){
            System.out.println("O contador está em: " + contador);
            contador++;

            Thread.sleep(1000);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
