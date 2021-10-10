package br.pucpr.lista2;

public class Quadrado {
    public void quad(Retangulo r){
        float perimetro = r.getQuadlado() * 4;
        float area = r.getQuadlado() * r.getQuadlado();
        System.out.println("Perímetro: " + perimetro + " cm");
        System.out.println("Área: " + area + " cm²");
        return;
    }
}
