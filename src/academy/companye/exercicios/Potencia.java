package academy.companye.exercicios;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = leitor.nextInt();
        int potencia;

        System.out.println("A Potencia de 0 a 15 do número escolhido:");
        for(int i=0; i<= 15;i++)
        {

            potencia = (int)Math.pow(num,i);
            System.out.println(num +"x"+i+"="+ potencia);
        }
    }
}
