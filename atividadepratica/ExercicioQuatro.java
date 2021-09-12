package atividadepratica;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        float salario = 0;
        float aumento = 0.2f;
        String escolha = "";

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Informe o valor do salário: ");
            salario = Float.parseFloat(teclado.nextLine());

            if (salario <= 500){
                salario += (salario * aumento);
                System.out.println("Contemplado com aumento. Salário atual = R$: " + salario);
            }
            else {
                System.out.println("Salário não comtemplado com aumento (superior a R$ 500,00).");
            }

            System.out.println("Tecle enter para continuar ou 'Fim' para sair.");
            escolha = teclado.nextLine();
            if (escolha.equalsIgnoreCase("Fim")){
                System.exit(0);
            }
        }
    }
}
