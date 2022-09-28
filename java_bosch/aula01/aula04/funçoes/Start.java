package funçoes;

import java.util.Scanner;

public class Start {
    public void comeco(){
        System.out.println("A TRAIN WREACK");
        System.out.print("Suponha que dois trens partam ao mesmo tempo de cidades diferentes,\nde maneira que em " +
                "algum momento eles irão colidir.\nVocê não pode fazer nada para impedir a tragédia, a única coisa " +
                "que\nvocê pode fazer é determinar o instante e o local que colidem.\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Scanner input = new Scanner(System.in);
        String velocidade_a;
        String velocidade_b;
        String posicao_a;
        String posicao_b;
        String continuar;
        int convertido_posicao_a;
        int convertido_posicao_b;
        int convertido_velocidade_a;
        int convertido_velocidade_b;

        externo:
        while(true) {
            while (true) {
                try {
                    System.out.print("Digite a velocidade do trem A: ");
                    velocidade_a = input.next();
                    convertido_velocidade_a = Integer.parseInt(velocidade_a);
                    if (convertido_velocidade_a > 300 || convertido_velocidade_a < 0) {
                        System.out.println("Digite um valor entre 0 km e 300 km");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Você digitou um caractere inválido! Tente novamente...");
                }
            } //velocidade trem a

            while (true) {
                try {
                    System.out.print("Digite a velocidade do trem B (negativo): ");
                    velocidade_b = input.next();
                    convertido_velocidade_b = Integer.parseInt(velocidade_b);
                    if (convertido_velocidade_b < -300 || convertido_velocidade_b > 0) {
                        System.out.println("Digite um valor entre -1km e -300km");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Você digitou um caractere inválido! Tente novamente...");
                }
            } //velocidade trem b

            while (true) {
                try {
                    System.out.print("Digite a posição do trem A: ");
                    posicao_a = input.next();
                    convertido_posicao_a = Integer.parseInt(posicao_a);
                    if (convertido_posicao_a > 10000 || convertido_posicao_a < 0) {
                        System.out.println("Digite um valor entre 0 e 10000");
                    } else {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("Você digitou um caractere inválido! Tente novamente...");
                }
            } //posicao trem a

            while (true) {
                try {
                    System.out.print("Digite a posição do trem B: ");
                    posicao_b = input.next();
                    convertido_posicao_b = Integer.parseInt(posicao_b);

                    if (convertido_posicao_b > 10000 || convertido_posicao_b < 0) {
                        System.out.println("Digite um valor entre 0 e 10000");
                    } else {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("Você digitou um caractere inválido! Tente novamente...");
                }
            } //posicao trem b

            if (convertido_velocidade_a == 0 && convertido_velocidade_b == 0) {
                System.out.println("O trens não colidirão, pois estão a 0km/h");
            } else if (convertido_posicao_a == convertido_posicao_b) {
                System.out.println("Por estarem na mesma posição os trens já colidiram!");
            } else if (convertido_posicao_b < convertido_posicao_a) {
                System.out.println("Os trens não vão se colidir, pois o trem A está posicionado a frente do trem B!");
            } else {
                new Equacoes().equacao(convertido_posicao_a, convertido_posicao_b, convertido_velocidade_a, convertido_velocidade_b);
            }

            while (true) {
                System.out.print("Deseja executar novamente? S para SIM, Qualquer tecla para NÃO: ");
                continuar = input.next();
                if (continuar.equalsIgnoreCase("s")) {
                    continue externo;
                } else {
                    System.out.println("FIM DO PROGRAMA");
                    System.exit(0);
                }
            }
        }
    }
}
