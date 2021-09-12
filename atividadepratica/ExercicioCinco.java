package atividadepratica;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        float precoRefrigerante = 3;
        int qt_refrigerante = 0;
        float totalrefrigerante = 0;
        float precoGasolina = 2.50f;
        float litros = 0;
        float totalgasolina = 0;
        float totalcompra = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de refrigerantes: ");
        qt_refrigerante = teclado.nextInt();

        System.out.println("Quantidade de litros de gasolina: ");
        litros = teclado.nextFloat();

        totalrefrigerante = precoRefrigerante * qt_refrigerante;
        totalgasolina = precoGasolina * litros;
        totalcompra = totalgasolina + totalrefrigerante;

        System.out.println("Total a pagar = R$ " + totalcompra);
    }
}
