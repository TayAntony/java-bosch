package bosch;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        double peso, altura, formula;

        Scanner entrada = new Scanner(System.in);

        // lendo o peso
        System.out.println("Digite seu peso [XX,X]: ");
        peso = entrada.nextDouble();

        //lendo altura
        System.out.println("Digite sua altura [X,XX]: ");
        altura = entrada.nextDouble();

        //fazendo a fórmula de IMC
        formula = peso/(Math.pow (altura, 2));

        System.out.printf("Seu IMC ideal é %.2f \n", formula);

        if (formula <18.5){
            System.out.println("Denutrição");}

        else if (formula >= 18.5 && formula <=24.5){
            System.out.println("Peso normal");}

        else if (formula >=25 && formula <=29.9){
            System.out.println("Sobrepeso");}

        else if(formula >= 30 && formula <= 39.9){
            System.out.println("Obesidade");}

        else{
            System.out.println("Obesidade Mórbida");
        }
    }
}
