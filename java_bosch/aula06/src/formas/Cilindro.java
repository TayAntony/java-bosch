package formas;

//CONFERIDO

public class Cilindro {
    double raio;
    double altura;
    double pi = Math.PI;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double calcularVolume(){
        double areaBase = pi*Math.pow(this.raio, 2);
        double volume = pi * Math.pow(this.raio, 2) * this.altura;
        System.out.printf("O volume do cilindro é: %.2f\n", volume);
        return volume;
    }

    double areaSuperficial(){
        double areaS = 2*pi * this.raio * this.altura + 2*pi * Math.pow(this.raio, 2);
        System.out.printf("E a área superficial: %.2f\n", areaS);
        return areaS;
    }
}
