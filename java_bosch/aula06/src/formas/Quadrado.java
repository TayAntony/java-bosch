package formas;


public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea(){
        double area = this.lado*this.lado;
        System.out.println("A área do quadrado é: " + area);
        return area;

    }

    double calcularPerimetro(){
        double perimetro = this.lado*4;
        System.out.println("E o perímetro: " + perimetro);
        return perimetro;
    }

}
