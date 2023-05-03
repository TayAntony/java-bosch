package com.company.umPraMuitos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item){
        this.itens.add(item);

    }

    double obterValorTotal(){
        double total = 0;
        for (Item item:itens) {
            total += item.qtd * item.preco;
        }
        return total;
    }

}
