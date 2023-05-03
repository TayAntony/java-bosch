package formas;

//CONFERIDO

public class Piramide {

    double base;
    double altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularVolume(){
        double volume = (this.altura * Math.pow(this.base, 2)) / 3;
        System.out.printf("O volume da pirâmide é: %.2f\n", volume);
        return volume;
    }

    double areaSuperficial() {
        double areaS =
                Math.pow(this.base, 2) + 2*this.base * Math.sqrt(Math.pow(this.base, 2)/4 + Math.pow(this.altura, 2));
        System.out.printf("E área superficial: %.2f\n", areaS);
        return areaS;
    }
} //ARRUMAR AREA SUPERFICIAL
