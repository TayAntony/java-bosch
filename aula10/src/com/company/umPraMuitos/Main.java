package com.company.umPraMuitos;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "Tay";
        compra.adicionarItem(new Item("Celular", 2, 2500.00));

        //printando uma propriedade específica da compra(nome, preço, quantidade)
        System.out.println(compra.itens.get(0).nome);

        //criando o objeto item e adicionando na função
        Item item1 = new Item("Garrafa", 8, 45);
        compra.adicionarItem(item1);

        //criando o objeto item direto dentro da função
        compra.adicionarItem(new Item("Geladeira", 2, 5000));
        compra.adicionarItem(new Item("Alexa", 4, 1200 ));

        //printando o total de itens adicionados/criados
        System.out.println(compra.itens.size());

        System.out.println(compra.obterValorTotal());
    }
}
