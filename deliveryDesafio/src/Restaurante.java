import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurante {
    public String nome;
    public String cnpj;
    public String endereco;
    public ArrayList<Lanche> lanches;

    public Restaurante(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.lanches = new ArrayList<>();
    }
}
