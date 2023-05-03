package formas;

//CONFERIDO
public class Cubo {
    double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    double calcularVolume(){
        double volume = Math.pow(this.aresta, 3);
        System.out.printf("O volume do cubo é: %.2f\n", volume);
        return volume;
    }

    double areaSuperficial(){
        double areaS = 6*Math.pow(this.aresta, 2);
        System.out.printf("E área superficial: %.2f\n", areaS);
        return areaS;
    }
}
