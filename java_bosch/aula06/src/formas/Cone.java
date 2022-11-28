package formas;

//CONFERIDO

public class Cone {
    double raio;
    double altura;
    double pi = Math.PI;
    double geratriz;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;

    }

    double calcularVolume(){
        geratriz = Math.pow(this.raio, 2) + Math.pow(this.altura,2);;
        double volume = (pi * Math.pow(this.raio, 2) * this.altura) / 3;
        System.out.printf("O volume do cone é: %.2f\n", volume);
        return volume;
    }

    double areaSuperficial(){
        double areaS =
                pi * Math.pow(this.raio,2) + pi * this.raio * Math.sqrt(Math.pow(this.raio, 2) + Math.pow(this.altura
                        , 2));
        System.out.printf("E a área superficial: %.2f\n", areaS);
        return areaS;
    }
}
