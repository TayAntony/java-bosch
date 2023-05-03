public class Main {
    public static void main(String[] args) {
    Conta conta = new Conta();
    System.out.println(conta.saldo);
    conta.deposito(100);
    System.out.println(conta.saldo);
    conta.deposito(100, "Transferencia");
    System.out.println(conta.saldo);
    }
}

//        Jogador j1 = new Jogador();
//        j1.x=10;
//        j1.y=20;
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.NORTE);
//        System.out.println(j1.x);
//        System.out.println(j1.y);

//        Jogador j1 = new Jogador();
//        j1.x = 10;
//        j1.y = 10;
//
//        Jogador j2 = new Jogador();
//        j2.x = 10;
//        j2.y = 11;
//
//        System.out.println(j1.vida);
//        System.out.println(j2.vida);
//
//        j1.atacar(j2);
//        System.out.println(j1.vida);
//        System.out.println(j2.vida);

//        Guerreiro g1 = new Guerreiro();
//        g1.x =10;
//        g1.y=10;
//
//        Fera f2 = new Fera();
//        f2.x = 10;
//        f2.y = 11;
//
//        System.out.println(g1.vida);
//        System.out.println(f2.vida);
//
//        g1.atacar(f2);
//        f2.atacar(g1);
//
//        System.out.println(g1.vida);
//        System.out.println(f2.vida);
//
//
//    }
//}