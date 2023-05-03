package com.company;

public class Produto {
    String nome;
    double preco;
    double desconto;


    Produto(){
        this("Sem nome", 99999, 99999);
    }

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    String retornaStringFormatada(){
        return String.format("O produto %s está com o preço %.2f e com desconto %.2f", this.nome, this.preco, this.desconto);
    }

    @Override
    public Produto clone(){
        try{
            Produto clone = (Produto) super.clone();
            return clone;
        }
        catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
