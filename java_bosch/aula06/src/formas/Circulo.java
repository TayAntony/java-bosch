package formas;

//CONFERIDO

public class Circulo {
    double raio;
    double pi = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea(){
        double area = pi*Math.pow(this.raio, 2);
        System.out.printf("A área do circulo é: %.2f\n", area);
        return area;
    }

    double calcularPerimetro(){
        double perimetro = 2*(pi*this.raio);
        System.out.printf("E o perímetro/comprimento: %.2f\n", perimetro);
        return perimetro;
    }
}
