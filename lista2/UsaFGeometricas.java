package br.pucpr.lista2;

public class UsaFGeometricas {
    public static void main(String[] args) {
        Retangulo re = new Retangulo();
        Circulo c = new Circulo();

        c.Area(2);
        c.Perimetro(3);

        re.Area(2, 3);
        re.Perimetro(5,3);
    }
}
