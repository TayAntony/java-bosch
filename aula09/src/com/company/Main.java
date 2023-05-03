package com.company;

public class Main {

    public static void main(String[] args) {
	Produto prod1 = new Produto();
    prod1.nome = "Notebook";
    Produto prod4 = new Produto("Celular", 2000, 0.30);

        System.out.println(prod1.nome);
        System.out.println(prod1.preco);
        System.out.println(prod1.desconto);
        System.out.println(prod4.retornaStringFormatada());


    }
}
