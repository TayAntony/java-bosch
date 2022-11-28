package formas;

//CONFERIDO

public class Paralelepipedo {

    double largura;
    double comprimento;
    double profundidade;

    public Paralelepipedo(double largura, double comprimento, double altura) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.profundidade = altura;
    }

    double calcularVolume(){
        double volume = this.comprimento * this.largura * this.profundidade;
        System.out.printf("O volume do paralelepípedo é: %.2f\n", volume);
        return volume;
    }

    double areaSuperficial(){
        double areaS =
                2*(this.comprimento*this.largura + this.comprimento*this.profundidade + this.largura*this.profundidade);
        System.out.printf("E área superficial: %.2f\n", areaS);
        return areaS;
    }
}
