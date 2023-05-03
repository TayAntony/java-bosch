package circulo;

public class Main {
    public static void main(String[] args) {
    Circulo c1 = new Circulo(2);
    Circulo c2 = new Circulo(3);

        System.out.println(c1.calcularArea());
        System.out.println(Circulo.calcularAreaStatic(3));

    }
}
