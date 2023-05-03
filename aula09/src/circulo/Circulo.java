package circulo;

public class Circulo {
    static double pi = 3.14;
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea(){
        return pi*Math.pow(this.raio, 2);
    }
    static double calcularAreaStatic(double meuRaio){
        return pi*Math.pow(meuRaio,2);
    }
}
