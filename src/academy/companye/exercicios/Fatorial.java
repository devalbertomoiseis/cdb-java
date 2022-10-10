package academy.companye.exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int n;
        int f;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número para o cálculo de fatorial ");
        n = teclado.nextInt();
        System.out.println("\n");

        f = n * (n-1);
        System.out.println(f);

        for (int i = (n -1); i>1; i--) {
            f *= (i-1);
            System.out.println(f);
        }
        System.out.println("\nFatorial = "+f);
    }
}
