package br.pucpr.lista2;

import java.awt.geom.Area;

public class Retangulo {
    private int quadlado;


    public Retangulo() {

    }

    public int getQuadlado() {
        return quadlado;
    }

    public void setQuadlado(int quadlado) {
        this.quadlado = quadlado;
    }

    public void Area(float maiorL, float menorL){
        float A = maiorL * menorL;
        System.out.println("Área: " + A + " cm²");

    }

    public void Perimetro(float maiorL, float menorL){
        float P = (maiorL + maiorL) + (menorL + menorL);
        System.out.println("Perímetro: " + P + " cm");
    }

}
