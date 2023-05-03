package bosch;

import java.util.Arrays;
import java.util.Scanner;
public class CPF {
    public static final String RESET = "\u001b[0m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    String str_formatada;
    private String valiableStr() {

        Scanner scan = new Scanner(System.in);
        String[] permitidos = "0123456789.-".split("");
        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Digite um CPF para verificar se ele é válido");
            str_formatada = scan.nextLine();
            String[] str = str_formatada.split("");
            String strV;

            try {
                Boolean permitido = false;
                for(String cpf: str){
                    permitido = false;
                    for(String permitir: permitidos){
                        if (cpf.equalsIgnoreCase(permitir)){
                            permitido = true;
                        }
                    }
                    if (!permitido){
                        break;
                    }
                }
                if (!permitido){
                    continue;
                }
                strV = debulhador(str);
            } catch (Exception e) {
                System.out.println("Digite novamente");
                continue;
            }
            if (strV.length() == 9 || strV.length() == 11) {
                return strV;
            }
            System.out.println(VERMELHO + "Digite novamente" + RESET);

        }
    }

    private String debulhador(String[] str) {
        return Arrays.toString(str).replace(".", "").replace("-", "").replace("[","").replace("]","").replace(" ","").replace(",","").replace("'","");
    }

    private boolean verifier(String str) {
        String[] num = str.split("");
        int mult = 12;
        int indice = 0;
        int soma = 0;
        for (int i = 2; i <= 10; i++) {
            int a = Integer.parseInt(num[indice]) * (mult - i);
            soma += a;
            //System.out.println("I: "+indice+", conta: "+num[indice]+" X "+(mult-i)+" = "+a);
            indice += 1;
        }
        int d1 = 11 - (soma % 11);
        if (d1 > 9) {
            d1 = 0;
        }
        soma = 0;
        indice = 0;
        for (int i = 3; i <= 11; i++) {
            int a = Integer.parseInt(num[indice]) * (mult - (i - 2));
            soma += a;
            //System.out.println("I: "+indice+", conta: "+num[indice]+" X "+(mult-i+2)+" = "+a);
            indice += 1;
        }
        soma += (d1 * 2);
//        System.out.println("I : 10, conta: "+d1+" X "+"2"+" = "+(d1*2));
        int d2 = 11 - (soma % 11);
        if (d2 > 9) {
            d2 = 0;
        }

        System.out.print(VERDE + "CPF Correto:  " + RESET);
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print(".");
            }
            System.out.print(num[i]);
        }
        String concat = String.valueOf(d1) + d2;
        System.out.println("-" + concat);
        String cpfVerificado = "";
        if (num.length == 11) {
            String[] clone = str.split("");
            for (int i = 0; i < clone.length; i++) {
                if (i == 9) {
                    cpfVerificado +="-";
                } else if (i % 3 == 0 && i != 0) {
                    cpfVerificado +=".";
                }
                cpfVerificado +=clone[i];
            }
            if (num == clone){
                System.out.print(VERDE + "CPF Digitado: "+ RESET);
            }else{
                System.out.print(AMARELO + "CPF Digitado: "+ RESET);
            }
            System.out.println(str_formatada);

            return (d1 == Integer.parseInt(clone[9]) && d2 == Integer.parseInt(clone[10]));
//            return ((Objects.equals(clone[10], num[10]) && Objects.equals(clone[9], num[9])));
        } else {
            return true;
        }
    }

    public void start() {
        while (true) {
            if (verifier((valiableStr()))) {
                System.out.println(VERDE + "CPF digitado é Válido!" + RESET);

            } else {
                System.out.println(VERMELHO + "CPF digitado foi Inválido" + RESET);
            }
        }
    }
}
