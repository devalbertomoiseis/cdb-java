package academy.companye.exercicios;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        // o Objeto fibo do tipo scanner foi criado , e passado como argumento o
        // objeto system.in no construtor.

        Scanner fibo = new Scanner(System.in);

        System.out.println("Digite um numero da casa Fibonacci: ");

        //ABAIXO sobre o int

        // atribui o numero 0 para o inteiro chamado de casa1fibo
        //e
        // atribui o numero 1 para o inteiro chamado de casa2fibo

        int casa1fibo = 0, casa2fibo = 1;

        //ABAIXO sobre o for
        // 1° expressão para o numero que digitar irá atribuir fibo.nextInt que lê o valor digitado
        // e o armazena em uma variável do tipo int

        //  2° condição se o numero digitado for maior que 0 , ira repetir o laço o tanto de numero que digitarmos.

        // 3° expressão  para o numero digitado ira repetir uma vez.

        for (int numeroqualquer = fibo.nextInt(); numeroqualquer > 0; numeroqualquer--) {

            // Logo abaixo entre as aspas estarão o numero que foi informado , esse numero será
            // o de cada casa da sequência de Fibonacci.
            // exemplo A CASA DE NUMERO 0 EM FIBONACCI É 0, A CASA DE NUMERO 1 DE FIBONACCI É 1
            // A CASA DE NUMERO 2 DE FIBONACCI É 1 , A CASA DE NUMERO 3 DE FIBONACCI É 2

            System.out.print(casa1fibo + " ");

            // daqui para baixo eu não sabia o comando a incluir , mas sabia
            // que teria que atribuir adição;




            // comando para concluir o for

            // o 3° numero inteiro é casa3fibo que atribui o valor da soma entre
            //casa1fibo + casa2fibo

            int casa3fibo = casa1fibo + casa2fibo;  // sendo 0+1 = 1

            //para casa1fibo atribui casa2fibo , sendo o resultado de 0+1 = 1

            casa1fibo = casa2fibo; //sendo 0 recebe 1 = 0+1  = 1

            //para casa2fibo atribui casa3fibo , sendo 1+ (0+1)

            casa2fibo = casa3fibo; //sendo 1 + 1 = 2

            // e assim por diante até concluir o numero de vezes que digitamos o laço
            // no Scaner.




        }
        System.out.println("CASAS DE FIBONACCI");
    }
}
