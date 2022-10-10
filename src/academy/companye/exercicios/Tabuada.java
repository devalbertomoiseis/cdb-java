package academy.companye.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double valor = entrada.nextDouble();

        for(double i = 1; i <= 10; i++){
            System.out.println("Multiplicacao: " + valor + " * " + i + " = " + (valor * i));
        }
    }
}
