package atividadepratica;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        int numero;
        int cont = 0;

        Scanner teclado = new Scanner(System.in);

        while (cont <= 9){
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                System.out.println("Par");
            }
            else {
                System.out.println("Ímpar");
            }
            cont += 1;
        }
    }
}
