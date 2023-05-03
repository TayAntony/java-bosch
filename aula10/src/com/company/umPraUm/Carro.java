package com.company.umPraUm;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        motor.fatorInjecao += 0.4;
    }

    void frear(){
        motor.fatorInjecao -= 0.4;
    }

    void desligar(){
        motor.ignicao=false;
    }
    void ligar(){
        motor.ignicao=true;
    }

    boolean estaLigado(){
        return motor.ignicao;
    }
}
