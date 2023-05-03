package com.company;

public class Jogador {
    int x;
    int y;

//    boolean andar (String direcao){
//        if ("norte".equalsIgnoreCase(direcao)){
//            y++;
//        }
//        else if("sul".equalsIgnoreCase(direcao)){
//            y--;
//        }
//        else if("leste".equalsIgnoreCase(direcao)){
//            x++;
//        }
//        else if("oeste".equalsIgnoreCase(direcao)){
//            x--;
//        }
//        else{
//            return false;
//        }
//        return true;
//    }

    boolean andar(Direcao direcao){
        switch(direcao){
            case NORTE -> y++;
            case SUL -> y--;
            case LESTE -> x++;
            case OESTE -> x--;
        }
        return true;
    }
}
