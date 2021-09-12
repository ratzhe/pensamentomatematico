package atividadepratica;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu salário: R$: ");
        float salario = teclado.nextFloat();

        System.out.println("Informe o percentual de aumento: ");
        float aumento = teclado.nextFloat();

        aumento = (aumento/100) * salario;

        float novosalario = salario + aumento;

        System.out.println("Valor salário = R$: " + salario);
        System.out.println("Valor do aumento = R$: " + aumento);
        System.out.println("Salário atual = R$: " + novosalario);
    }

}
