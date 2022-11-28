package formas;

//CONFERIDO

public class Triangulo {
    double lado;
    double altura;

    public Triangulo( double altura){
        this.altura = altura;
    }

    double calcularArea(){
        double area = Math.pow(this.altura, 2)/ Math.sqrt(3);
        System.out.printf("A área do triângulo é: %.2f\n" + area);
        return area;
    }

    double calcularPerimetro() {
        double perimetro = 3 * (2 * this.altura) / Math.sqrt(3);
        System.out.printf("E o perímetro: %.2f\n" + perimetro);
        return perimetro;
    }

}
