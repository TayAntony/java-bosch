package formas;

//CONFERIDO

public class Retangulo {
    double largura;
    double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    double calcularArea(){
        double area = this.largura*this.comprimento;
        System.out.println("A área do retângulo é: " + area);
        return area;
    }

    double calcularPerimetro(){
        double perimetro = 2*(this.largura+this.comprimento);
        System.out.println("E o perímetro: " + perimetro);
        return perimetro;
    }
}
