package br.pucpr.lista2;

import java.util.Scanner;

public class Relogio {

    // atributos
    private int hora;
    private int min;

    // get e set


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Relogio(int hora, int min){
        this.hora = hora;
        this.min = min;
    }

    // métodos
    public void proximaHora(){
        for (int i = 0; i == 24; i++){
            System.out.println("Hora: " + i);
        }
    }

    public void proximoMinuto(){
        min += 1;
        if (min == 60){
            hora += 1;
            min = 0;
            if (hora == 24){
                hora = 0;
            }
        }
    }

    public void alterarH(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hora: ");
        hora = teclado.nextInt();

        if (hora < 25){
            System.out.println("Nova hora: " + hora);
        } else {
            System.out.println("Inválida");
        }
    }

    public void horario(){
        System.out.println(hora + ":" + min);
    }
}
