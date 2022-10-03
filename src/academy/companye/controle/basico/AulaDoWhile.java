package academy.companye.controle.basico;

import java.util.Scanner;

public class AulaDoWhile {
    public static void main(String[] args) {
        //Declaracao de variaveis
        int opcao = -1;

        //Instancia das classes objetos que vamos utilizar
        Scanner entrada = new Scanner(System.in);

        do{
            //Apresentação das opções do menu ao usuário
            System.out.println(
                    "--------------Menu-------------" +
                    "\n" +
                            "\n |    1 - Pagar Boleto    | " +
                            "\n |    2 - Transferencia    | " +
                            "\n |    3 - Depositar   | " +
                            "\n |    4 - Sacar    | " +
                            "\n |    5 - Consultar Saldo    | " +
                            "\n" + "\n Inform a opção desejada >>> "
            );
            // Captura a opção do menu digitada pelo usuario
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n\n Aqui ficara a funcionalidade para pagar boleto \n");
                    break;
                case 2:
                    System.out.println("\n\n Aqui ficara a funcionalidade para Transferencia \n");
                    break;
                case 3:
                    System.out.println("\n\n Aqui ficara a funcionalidade para Depositar \n");
                    break;
                case 4:
                    System.out.println("\n\n Aqui ficara a funcionalidade para Sacar \n");
                    break;
                case 5:
                    System.out.println("\n\n Aqui ficara a funcionalidade para Consultar Saldo \n");
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("\n\n voce precisa selecionar uma das opcoes validas  \n");
                    }
                    break;
            }
        }while (opcao != 0);
        System.out.println("\n Obrigado por utilizar nosso sistema !\n");
        entrada.close();
    }
}
