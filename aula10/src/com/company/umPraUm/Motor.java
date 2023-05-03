package com.company.umPraUm;

public class Motor {
    double fatorInjecao = 1;
    boolean ignicao = false;

    Motor(){

    }

    int giros(){
        if(!ignicao){
            return 0;
        }else{
            return(int) Math.round(fatorInjecao*3000);
        }
    }
}
