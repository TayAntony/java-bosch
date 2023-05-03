package com.company;

public class Main {

    public static void main(String[] args) {
	 Jogador j1 = new Jogador();
     j1.x = 10;
     j1.y = 20;
     j1.andar(Direcao.NORTE);
     j1.andar(Direcao.NORTE);
     j1.andar(Direcao.LESTE);
     j1.andar(Direcao.NORTE);
     System.out.println(j1.x);
     System.out.println(j1.y);
    }
}
