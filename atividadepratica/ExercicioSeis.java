package atividadepratica;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        float percentualParcela = 0.3f;
        float prestacao = 0;
        float salario = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor do salário = R$ ");
        salario = teclado.nextFloat();

        System.out.println("Valor da prestação = R$: ");
        prestacao = teclado.nextFloat();

        if (prestacao <= (salario * percentualParcela)){
            System.out.println("Empréstimo concedido.");
        }

        else {
            System.out.println("Empréstimo negado.");
        }
    }
}
