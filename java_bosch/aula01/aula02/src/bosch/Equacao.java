package bosch;

public class Equacao {
    public static void main(String[] args) {
        double pParenteses, pParenteses1,pp, sParenteses, sParenteses1, pp2, tParenteses, tParenteses1, numerador,
                denominador, chaves, chavesElevado, resultado, umaLinha;

        pParenteses = Math.pow(-3,-2);
        pParenteses1 = Math.pow(4, -2);
        pp = pParenteses/pParenteses1;
        sParenteses = Math.pow(3,-1);
        sParenteses1 = sParenteses/4;
        numerador = 3 * pp + 6 * sParenteses1 - 4;

        tParenteses1 = Math.pow(-3,-1);
        tParenteses = Math.pow(4, -1);
        pp2 = tParenteses1/tParenteses;
        denominador = 7 * pp2 + 2;

        chaves = numerador / denominador;
        chavesElevado = Math.pow(chaves, -1);
        resultado = chavesElevado + 4;

        System.out.println(resultado);

        umaLinha = Math.pow((3*((Math.pow(-3,-2))/(Math.pow(4,-2)))+(6*((Math.pow(3,-1)/4))-4))/(7*((Math.pow(-3,-1))/(Math.pow(4,-1)))+2),-1)+4;
        System.out.println(umaLinha);
    }
}

