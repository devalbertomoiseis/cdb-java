package academy.companye.exercicios;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        if(valor % 2 == 0 ){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero Impar");
        }
    }
}
