package br.pucpr.lista2;

public class Circulo {
    public void Area(float raio){
        float A = 3.14f * (raio * raio);
        System.out.println("Área do círculo: " + A + " cm²");
    }

    public void Perimetro(float raio){
        float P = 2 * raio * 3.14f;
        System.out.println("Perímetro do círculo: " + P + " cm");
    }
}
