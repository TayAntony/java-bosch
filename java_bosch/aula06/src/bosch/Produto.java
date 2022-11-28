package bosch;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(){} //construtor sem parâmetros

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    void precoComDesconto(double descontoA){
        System.out.println(preco-(preco*(desconto-descontoA)));
    }

    String retornaPrintFormatado(){
        return String.format("O produto %s está custando %f e com desconto de %f", this.nome,this.preco, this.desconto);
    }

}
