package Contas;

import Contas.Conta;

public class ContaCorrente extends Conta {
    @Override
    void deposito(double valor){
        this.saldo = this.saldo + valor + 1;
    }
}
