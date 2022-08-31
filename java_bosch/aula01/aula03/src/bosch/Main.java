package bosch;

public class Main {

    public static void main(String[] args) {
        String minhaString = "Like a Bosch";
        String outraString = new String("Work like a Bosch"); //para declarar um objeto tem que chamar o new
        System.out.println(minhaString.endsWith("h")); //verifica se a string termina ou começa (startsWith) com
        // determinado caractere
        System.out.println(minhaString.toUpperCase()); // coloca em caixa alta ou caixa baixa (toLowerCase)
        System.out.println(minhaString.length()); //conta a quantidade de caracteres da string e retorna um número
        System.out.println(10 == 5+5); // = recebe; == compara
        //NUNCA COMPARAR STRING COM ==
        System.out.println(outraString.equals("Work like a Bosch")); //maneira de comparar um objeto(como uma String) pois é complexo
        System.out.println(outraString.equalsIgnoreCase("Work like a Bosch"));//compara o que foi digitado ignorando
        // se é maiúsculo ou minúsculo
        System.out.println(outraString.toUpperCase().equals("WORK LIKE A BOSCH"));
    }
}
