package br.pucpr.lista2;

public class UsaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente usuario = new ContaCorrente(1200);
        usuario.sacar(800);
        //usuario.depositar(800);
    }
}
