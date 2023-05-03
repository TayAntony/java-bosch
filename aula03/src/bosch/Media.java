package bosch;

import jdk.swing.interop.SwingInterOpUtils;

public class Media {
    public static void main(String[] args) {
        String situacao;
        double nota = 4.1;
        int presença = 80;
        boolean postura = true;
        if(nota >= 5.0 && presença >= 75 && postura){
            situacao = "APROVADO";
        } else if(nota < 5.0 && presença>= 75 && postura){
            situacao = "RECUPERAÇÃO DE PROVA";
        } else if(nota >= 5.0 && presença < 75 && postura){
            situacao = "SEM FÉRIAS";
        } else if(nota >= 5.0 && presença >= 75 && !postura){
            situacao = "CONVERSA PEDAGÓGICA";
        } else{
            situacao = "REPROVADO";
        }
        System.out.println(situacao);
    }
}
