package formas;

//CONFERIDO
public class Hexagono {
    double lado;
    double perimetro;
    double pi = Math.PI;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    double calcularPerimetro(){
        perimetro = this.lado * 6;
        System.out.printf("O perímetro do hexágono é: %.2f\n", perimetro);
        return perimetro;
    }

    double calcularArea(){
        double apotema = this.lado / (2 * Math.tan(pi/6));
        double area = (perimetro * apotema) / 2;
        System.out.printf("E a área é: %.2f\n", area);
        return area;
    }



    //AINDA FALTA ARRUMAR
}
