package arrayPrimos;

import java.util.ArrayList;

public class Primos {
    double contador;
    ArrayList<Integer> primos = new ArrayList<>();
    ArrayList<Integer> naoPrimos = new ArrayList<>();

    boolean calcular(int numero){
        contador = 0;
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0) {
                contador ++;
            }
        }

        if(contador == 2){
            return true;
        }
        else {
            return false;
        }
    }

    void preencherLista(int numero, String param){
        for(int i = 1; i <= numero; i++){
            if(calcular(i)){
                primos.add(i);
            }
            else{
                naoPrimos.add(i);
            }
        }
        if(param.equals("p")){
            System.out.println("Números primos: " + primos);
        }
        else if(param.equals("n")){
            System.out.println("Números não primos" + naoPrimos);
        }else{
            System.out.println("Opção Inválida");
        }
    }
}
