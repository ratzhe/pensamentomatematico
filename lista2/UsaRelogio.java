package br.pucpr.lista2;

public class UsaRelogio {
    public static void main(String[] args) {
        Relogio usuario = new Relogio(16, 20);

        usuario.proximaHora();
        usuario.horario();
        usuario.alterarH();
    }
}
