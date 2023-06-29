package formas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Olá, seja bem-vindo(a) ao FÓRMULA\nQual forma gostaria de fazer hoje?");
        double menu1 = menu1();
    }

    static double menu1(){
        Scanner escolha = new Scanner(System.in);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" +
                "[1] - PLANAS\n" +
                "[2] - ESPACIAIS\n" +
                "[3] - SAIR\n" +
                "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        String menu = escolha.next();
        double valorMenu = converterMenu1(menu);
        return valorMenu;
    }

    static double converterFormas (String num){
        Scanner escolha = new Scanner(System.in);
        while(true){
            try{
                Double numero = Double.parseDouble(num);
                if(numero > 0) {
                    return numero;

                }
                else{
                    System.out.println("Digite um número maior que 0");
                    num = escolha.next();
                }
            }catch(Exception e){
                System.out.println("Opção inválida, tente novamente...");
                num = escolha.next();
            }
        }
    }

    static double converterMenu1(String num){
        Scanner escolha = new Scanner(System.in);
        while (true) {
            double valorMenu;
            try {
                Double numero = Double.parseDouble(num);
                if (numero > 0 && numero < 4) {
                    if (numero == 1){
                        valorMenu = menuPlanas();
                    }
                    else if (numero == 2){
                        valorMenu = menuEspaciais();
                    }
                    else{
                        System.out.println("Até o próximo código :)");
                        System.exit(1);
                    }

                } else {
                    System.out.println("Opção inválida, tente novamente...");
                    num = escolha.next();
                }

            } catch (Exception e) {
                System.out.println("Opção inválida, tente novamente...");
                num = escolha.next();
            }
            escolha.nextLine();
        }
    }

    static double converterMenuPlanas(String num){
        Scanner escolha = new Scanner(System.in);
        while(true){
            double valorMenu;
            try{
                Double numero = Double.parseDouble(num);
                if(numero > 0 && numero < 6) {
                    if(numero == 1){
                        valorMenu = quadrado();
                    }
                    else if(numero == 2){
                        valorMenu = circulo();
                    }
                    else if(numero == 3){
                        valorMenu = triangulo();
                    }
                    else if(numero == 4){
                        valorMenu = retangulo();
                    }
                    else if(numero == 5){
                        valorMenu = hexagono();
                    }

                }else{
                    System.out.println("Opção inválida, tente novamente...");
                    num = escolha.next();
                }

            }catch(Exception e){
                System.out.println("Opção inválida, tente novamente...");
                num = escolha.next();
            }
            escolha.nextLine();
        }
    }

    static double converterMenuEspaciais(String num){
        Scanner escolha = new Scanner(System.in);
        while(true){
            double valorMenu;
            try{
                Double numero = Double.parseDouble(num);
                if(numero > 0 && numero < 7) {
                    if(numero == 1){
                         valorMenu = cubo();
                    }
                    else if(numero == 2){
                        valorMenu = paralelepipedo();
                    }
                    else if(numero == 3){
                        valorMenu = piramide();
                    }
                    else if(numero == 4){
                        valorMenu = esfera();
                    }
                    else if(numero == 5){
                        valorMenu = cilindro();
                    }
                    else if(numero == 6){
                        valorMenu = cone();
                    }

                }else{
                    System.out.println("Opção inválida, tente novamente...");
                    num = escolha.next();
                }

            }catch(Exception e){
                System.out.println("Opção inválida, tente novamente...");
                num = escolha.next();
            }
            escolha.nextLine();
        }
    }

    static double menuEspaciais(){
        Scanner escolha = new Scanner(System.in);

        System.out.println("MENU DE FORMAS ESPACIAIS\n" +
                "1 - CUBO\n" +
                "2 - PARALELEPÍPEDO\n" +
                "3 - PIRÂMIDE (BASE QUADRADA)\n" +
                "4 - ESFERA\n" +
                "5 - CILÍNDRO\n" +
                "6 - CONE");
        String menu = escolha.next();
        double valorMenu = converterMenuEspaciais(menu);
        return valorMenu;
    }

    static double menuPlanas(){
        Scanner escolha = new Scanner(System.in);

        System.out.println("MENU DE FORMAS PLANAS\n" +
                "1 - QUADRADO\n" +
                "2 - CÍRCULO\n" +
                "3 - TRIÂNGULO\n" +
                "4 - RETÂNGULO\n" +
                "5 - HEXÁGONO");
        String menu = escolha.next();
        double valorMenu = converterMenuPlanas(menu);
        return valorMenu;
    }

    static double quadrado(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o lado do seu quadrado: ");
        String menu = valores.next();
        double valor = converterFormas(menu);
        Quadrado quad = new Quadrado(valor);
        quad.calcularArea();
        quad.calcularPerimetro();
        menu1();
        return valor;
    }

    static double circulo(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o raio do seu círculo: ");
        String menu = valores.next();
        double raio = converterFormas(menu);
        Circulo circ = new Circulo(raio);
        circ.calcularArea();
        circ.calcularPerimetro();
        menu1();
        return raio;
    }

    static double triangulo(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite a altura do seu triangulo equilátero: ");
        String menu = valores.next();
        double altura = converterFormas(menu);
        Triangulo tri = new Triangulo(altura);
        tri.calcularArea();
        tri.calcularPerimetro();
        menu1();
        return altura;
    }

    static double retangulo(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo: ");
        String menu = valores.next();
        double largura = converterFormas(menu);
        System.out.println("Digite o comprimento do retângulo: ");
        menu = valores.next();
        double comprimento = converterFormas(menu);
        Retangulo ret = new Retangulo(largura, comprimento);
        ret.calcularArea();
        ret.calcularPerimetro();
        menu1();
        return largura + comprimento;
    }

    static double hexagono(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o lado do seu hexágono: ");
        String menu = valores.next();
        double lado = converterFormas(menu);
        Hexagono hexa = new Hexagono(lado);
        hexa.calcularPerimetro();
        hexa.calcularArea();
        menu1();
        return lado;
    }

    static double cubo(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite a aresta do seu cubo: ");
        String menu = valores.next();
        double aresta = converterFormas(menu);
        Cubo cub = new Cubo(aresta);
        cub.calcularVolume();
        cub.areaSuperficial();
        menu1();
        return aresta;
    }

    static double paralelepipedo(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite a largura do seu paralelepípedo: ");
        String menu = valores.next();
        double largura = converterFormas(menu);
        System.out.println("Comprimento: ");
        menu = valores.next();
        double comprimento = converterFormas(menu);
        System.out.println("Profundidade: ");
        menu = valores.next();
        double profundidade = converterFormas(menu);
        Paralelepipedo para = new Paralelepipedo(largura, comprimento, profundidade);
        para.calcularVolume();
        para.areaSuperficial();
        menu1();
        return largura + comprimento + profundidade;
    }

    static double piramide(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite a base da sua pirâmide: ");
        String menu = valores.next();
        double base = converterFormas(menu);
        System.out.println("Altura: ");
        menu = valores.next();
        double altura = converterFormas(menu);
        Piramide para = new Piramide(base, altura);
        para.calcularVolume();
        para.areaSuperficial();
        menu1();
        return base + altura;
    }

    static double esfera(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o raio da sua esfera: ");
        String menu = valores.next();
        double raio = converterFormas(menu);
        Esfera para = new Esfera(raio);
        para.calcularVolume();
        para.areaSuperficial();
        menu1();
        return raio;
    }

    static double cilindro(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o raio da base do seu cilindro: ");
        String menu = valores.next();
        double raio = converterFormas(menu);
        System.out.println("Digite a altura do seu cilindro: ");
        menu = valores.next();
        double altura = converterFormas(menu);
        Cilindro para = new Cilindro(raio, altura);
        para.calcularVolume();
        para.areaSuperficial();
        menu1();
        return raio + altura;
    }

    static double cone(){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o raio da base do seu cone: ");
        String menu = valores.next();
        double raio = converterFormas(menu);
        System.out.println("Digite a altura do seu cone: ");
        menu = valores.next();
        double altura = converterFormas(menu);
        Cone para = new Cone(raio, altura);
        para.calcularVolume();
        para.areaSuperficial();
        menu1();
        return raio + altura;
    }
}
//TODOS CONFERIDOS E CORRETOS