package atividadepratica;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int cont = 1;
        int tab = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha um n° para conferir a tabuada: ");
        x = teclado.nextInt();

        for (;cont <= 10;){
            tab = x * y;
            System.out.println(x + " x " + y + " = " + tab);
            y ++;
            cont += 1;
            }
        }
}

