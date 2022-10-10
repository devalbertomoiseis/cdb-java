package academy.companye.controle;

import java.text.MessageFormat;
import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //Declaracao das variaveis que utilizaremos
        int n1;
        int n2;
        boolean isOk = false;
        String resposta;

        // Instancia das classes e objetos que utilizaremos
        Scanner entrada = new Scanner(System.in);

        // Solicitação de interação com o usuário
        System.out.println("Informe um numero inteiro qualquer >>> ");
        n1 = entrada.nextInt();

        // Solicitação de interação com o usuário
        System.out.println("Informe outro numero inteiro qualquer >>> ");
        n2= entrada.nextInt();

        // algoritmo para setar o status da flag;
        isOk = (n1 > n2);

        //Estrutura condicional que retorna a resposta que sera impressa ao usuario
        if (isOk == true){
            resposta = MessageFormat.format("O numero {0} é maior que numero {1}", n1, n2);
        }else{
            resposta = MessageFormat.format("Else: O numero {1} é maior que numero {0}", n1, n2);
        }
        //Impressao da resposta de acordo com o retorno da estrutura condicional;

        System.out.println("\n................................................................");
        System.out.println(resposta);
    }
}
