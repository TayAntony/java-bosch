package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Adhayne", "Beatriz", "Tejero", "Batista", "Alex", "Emilly", "Guilherme", "Naely", "Macharere", "Capovila", "Luiza", "Grazy", "Radija", "Raissa", "Lívia", "Tayssa", "Michael", "Gustavo"));
        Random bound = new Random();
        int ale;
        if(nomes.size() % 2 == 0){
            for(int i= 1;i <= nomes.size(); i++){
                ale = bound.nextInt(nomes.size());
                nomes.remove(ale);
            }
        }else{
            for(int i= 1;i <= nomes.size() + 1; i++){
                ale = bound.nextInt(nomes.size());
                nomes.remove(ale);
            }
        }
        System.out.println("Nomes não removidos: ");
        System.out.println(nomes);
    }
}
