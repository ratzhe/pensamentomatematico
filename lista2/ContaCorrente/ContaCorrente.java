package br.pucpr.lista2;

public class ContaCorrente {
    // atributos
    private double saldo;

    // get e set
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos
    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }
    public ContaCorrente(){
        this.saldo = 0;
    }

    public void imprimirOperacao(int operacao, double vOperacao){
        String o = operacao == 1 ? " - " : " + ";
        var novoSaldo = 0.0;
        if (operacao == 1){
            novoSaldo = getSaldo() - vOperacao;
            System.out.println("operação: " + getSaldo() + o + vOperacao +  " = " + novoSaldo);
        } else {
            novoSaldo = getSaldo() + vOperacao;
            System.out.println("operação: " + getSaldo() + o + vOperacao + " = " + novoSaldo);
        }

    }

    public void sacar(double vSaque){
        if (this.saldo >= vSaque){
            imprimirOperacao(1, vSaque);
            saldo -= vSaque;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(float vDeposito){
        imprimirOperacao(2, vDeposito);
        this.saldo += vDeposito;
    }


}
