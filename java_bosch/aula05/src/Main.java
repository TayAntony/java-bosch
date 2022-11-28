public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Motorola G8 Power";
        p.preco = 1500;
        p.desconto = 0.10;
        System.out.println(p.nome + p.preco + p.desconto);
        System.out.println(p.toString());

        Produto p2 = new Produto();
        p2.nome = "Samsung Galaxy A22";
        p2.preco = 1800;
        p2.desconto = 0.20;
        System.out.println(p2.nome + p2.preco + p2.desconto);

        System.out.println(p.precoComDesconto());
        System.out.println(p2.precoComDesconto());
        System.out.println(p.somar(2, 3));


    }

}