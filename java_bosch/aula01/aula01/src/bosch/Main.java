package bosch;

public class Main {

    public static void main(String[] args) {
	System.out.println("Olá mundo"); //print pulando linha
    System.out.println("Como vai, DEV?"); //print normal

        int raio = 9;
        final double pi = 3.1415; //final é uma constante (um valor que não será alterável no código)
        double areaDoCirculo = pi* raio* raio;

        System.out.printf("A área do círculo é %f e o raio é %d\n", areaDoCirculo, raio);
        //%f double/float, %d inteiro, %c character, %s string, %b boolean

        //============= TIPOS PRIMITIVOS ===============

        /*-Tipo inteiro: byte (de -128 a 127)
                       short (de -32.768 a 32.767)
                       int (de -2.000.000.000 a 2.000.000.000)
                       long(8 bytes/64 bits) */

        byte meuByte = -128;
        System.out.printf("Tamanho do Byte: %d\n", meuByte);

        short meuShort = 32767;
        System.out.println("Tamanho do short: " + meuShort);

        int meuInt = 2_147_483_647; //o _ serve como o . dos milhares e milhoes, para entender melhor visualmente
        System.out.printf("Tamanho do int: %d\n", meuInt);

        long meuLong = 9_223_372_036_854_775_807L; // o L é obrigatório quando se usa o tipo long, mesmo que ja tenha
        // sido declarado antes, caso contrário ele entende como um inteiro
        System.out.printf("Tamanho do long: %d\n", meuLong);


        /*-Tipo real: float (45 dígitos depois da vírgula positivo e negativamente)
                      double (324 dígitos depois da vírgula positivo e negativamente) usar double para numeros reais
                      para não correr o risco de perder informações */

        float meuFloat = 3.4e+38F; //e+38 é o tamanho aproximado de quantos dígitos/38 o número tem, e usa o mesmo
        // raciocínio que o L de Long, para inferir um float
        System.out.printf("Valor do float: %f\n", meuFloat);

        double meuDouble = 1.7e+308;
        System.out.printf("Tamanho do double: %.2f\n", meuDouble); //o .2 é usado para forçar um número decimal a
        // mostrar apenas 2 dígitos depois da virgula


        //-Caractere: char (2 bytes/16 bits)
        char meuChar = 'a';
        System.out.printf("Meu caractere é: %c\n", meuChar);


        //-Lógico: boolean (1 byte/ 8 bits)*/
        boolean meuBoolean = true;
        System.out.printf("Meu booleano é: %b\n", meuBoolean);


        String minhaString = "Olá Tay!"; //string não é um tipo primitivo, é uma classe, por isso começa com letra
        // maiúscula
        System.out.printf("Minha string é: %s\n", minhaString);

        var meusValores = 10; //ao usar var é possível atribuir qualquer valor a variável sem especificar o tipo
        System.out.printf("O valor é: %d\n", meusValores); //no printf tem que mudar o valor do % dependendo de qual
        // o valor da variável
        //é possível usar var apenas dentro do main

        //======== OPERADORES MATEMÁTICOS ==========
        double num1 = 2;
        double num2 = 4;
        System.out.println(num1+num2); //soma
        System.out.println(num1-num2); //subtração
        System.out.println(num1/num2); //divisão
        System.out.println(num1*num2); //multiplicação
        System.out.println(num1%num2); //resto da divisão

        double potencia;
        potencia = Math.pow(num1,num2);
        System.out.println(potencia); //potencia usando biblioteca math

        //não existe sinal de potenciação nem divisão inteira

    }
}
