package formas;

//CONFERIDO

public class Esfera {
    double raio;
    double pi = Math.PI;

    public Esfera(double raio) {
        this.raio = raio;
    }

    double calcularVolume(){
        double volume = (4 * pi * Math.pow(this.raio, 3)) / 3;
        System.out.printf("O volume da esfera é: %.2f\n", volume);
        return volume;
    }

    double areaSuperficial(){
        double areaS = 4*pi*Math.pow(this.raio, 2);
        System.out.printf("E a área superficial: %.2f\n", areaS);
        return areaS;
    }

}


