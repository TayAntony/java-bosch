package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] meuArray = new int[5];
        System.out.println(Arrays.toString(meuArray));
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;
        meuArray[3] = 4;
        meuArray[4] = 5;
        Arrays.fill(meuArray, 0);

        for (int i = 0; i < meuArray.length; i++) {
            meuArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(meuArray));

////////////////////////////////////////////////////////////////////////////
        double[] notas = {5.0, 4.8, 7.9, 9.6, 10.0};
        for (double nota : notas) {
            System.out.println(nota);
        }
        System.out.println(notas[notas.length - 1]); //pegar o último valor de uma lista

/////////////////////////////////////////////////////////////////////////////
        String[] nomes = {"João", "Tayssa", "Viktor"};
        System.out.println(nomes[0].charAt(0));//pegar a primeira letra do primeiro nome
        System.out.println(nomes[0].charAt(nomes[0].length() - 1));//pegar a ultima letra do primeiro nome

/////////////////////////////////////////////////////////////////////////////
        ArrayList<String> nomes2 = new ArrayList<>();
        nomes2.add("João");
        nomes2.add("Tay");
        nomes2.add("Vik");
        System.out.println(nomes2.get(0)); //pegando o indice de um array list com get
        System.out.println(nomes2.remove(0));//remove o valor da lista no indice escolhido ou pelo prórpio valor
        // (remove("João"))
        System.out.println(nomes2.size());//o length do array list é size

///////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(2);
    }

}
