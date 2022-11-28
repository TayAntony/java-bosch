package bosch;

public class CalcularPrimo {
    double numero;

    public CalcularPrimo(double numero){
        this.numero = numero;
    }

    void calcular(){
        int divisoes = 0;
        for(int i = 0; i<=this.numero; i++){
            if(this.numero % i == 0) {
                divisoes += 1;
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("O número %.1f foi dividido %d vezes. ", this.numero, divisoes);
        if(divisoes == 2){
            System.out.println("E por isso É primo!");
        }
        else {
            System.out.println("E por isso NÃO É primo!");
        }
    }
}
