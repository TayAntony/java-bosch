package bosch;

public class Operacoes {
    public static void main(String[] args) {
        int x=3, y=4, z=5;
        System.out.println(10+2*20);
        System.out.println(12-9/3);
        System.out.println(10+2==6*2);
        System.out.println(16>8+8);
        System.out.println(x>z || x<z);
        System.out.println(!(x<y) == x>y);
        System.out.println(!(y<x) && x>z || z<y);
        System.out.println(x == z - y && z != y - x || y != z - x);

        // usando ternário
        String resultado;
        double media = 4.9;
        resultado = media >=5 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
