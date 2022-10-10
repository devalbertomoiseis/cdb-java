package academy.companye.metodos;

import java.util.Scanner;

public class Aula01Calcular {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor1 !?");
        Double valor1 = entrada.nextDouble();

        System.out.println("Digite um valor2 !?");
        Double valor2 = entrada.nextDouble();

        System.out.println("Qual operação deseja usar !?");
        String operador = entrada.next();

        switch (operador){
            case "+":
                System.out.println(" O resultado é: " + (valor1 + valor2));
                break;
            case "*":
                System.out.println(" O resultado é: " + (valor1 * valor2));
                break;
            case "-":
                System.out.println(" O resultado é: " + (valor1 - valor2));
                break;
            case "/":
                System.out.println(" O resultado é: " + (valor1 / valor2));
                break;
            default:
                System.out.println("Resultado não encontrado");
        }
    }
    public static Double somar(Double valor1, Double valor2){
        double resultado = valor1 + valor2;
        return resultado;
    }
}
