package academy.companye.modulo.basico;

import java.util.Scanner;

public class Variaveis02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobre nome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Nome: " + nome + " Sobre Nome: " + sobreNome);
    }
}
