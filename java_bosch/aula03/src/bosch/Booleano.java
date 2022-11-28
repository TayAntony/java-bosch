package bosch;

public class Booleano {
    public static void main(String[] args){
        //OPERADORES BOOLEANOS
        boolean condiçao1 = true;
        boolean condiçao2 = 15<12;

        System.out.println(condiçao1 && condiçao2); //operador and
        System.out.println(condiçao1 || condiçao2); // operador or
        System.out.println(!condiçao1); //operador not (inverte a condição)

    }
}
