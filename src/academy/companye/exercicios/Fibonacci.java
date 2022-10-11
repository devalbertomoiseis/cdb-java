package academy.companye.exercicios;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        // Entrada de Dados
        Scanner fibo = new Scanner(System.in);
        System.out.println("Digite um numero da casa Fibonacci: ");

        int casa1fibo = 0, casa2fibo = 1;

        for (int numeroqualquer = fibo.nextInt(); numeroqualquer > 0; numeroqualquer--) {

            System.out.print(casa1fibo + " ");

            int casa3fibo = casa1fibo + casa2fibo;

            casa1fibo = casa2fibo;
            casa2fibo = casa3fibo;

        }
        System.out.println("CASAS DE FIBONACCI");
    }
}
