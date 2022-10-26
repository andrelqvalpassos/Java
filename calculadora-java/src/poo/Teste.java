package poo;

import java.util.HashMap;
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;

public class Teste {
    public static void main(String[] args) {
        Numero n = new Numero();

        boolean continuar = true;
        Scanner scan = new Scanner(System.in);
        while(continuar){
            double x = 0;
            double y = 0;
            int operacao = 0;

            System.out.println("Digite a operacao que deseja: "
            +        "\n 1 para soma"
            +        "\n 2 para subtracao"
            +        "\n 3 para multiplicacao"
            +        "\n 4 para divisao"
            +        "\n 5 para terminar"

            );

            operacao = scan.nextInt();

            if(operacao == 5){
                System.out.println("Fim.");
                continuar = false;
                return;
            }

            System.out.println("Qual valor do primeiro numero: ");
            x = scan.nextDouble();

            System.out.println("Qual valor do primeiro numero: ");
            y = scan.nextDouble();

            switch (operacao){
                case 1:
                imprimicalculadora(operacao, n.soma(x, y), x, y);
                break;
                case 2:
                imprimicalculadora(operacao, n.subtracao(x, y), x, y);
                break;
                case 3:
                imprimicalculadora(operacao, n.multiplicacao(x, y), x, y);
                break;
                case 4:
                imprimicalculadora(operacao, n.divisao(x, y), x, y);
                break;
            }
        }
        scan.close();
    }

    static void imprimicalculadora (int operacao, double resultado, double x, double y){
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, " somado ");
        mapOperacao.put(2, "subtraido");
        mapOperacao.put(3, "multiplicado");
        mapOperacao.put(4, "dividido");

        System.out.println("\n O reultado de " + x + mapOperacao.get(operacao) + "por " + y + " e igual a " + resultado + "\n");

    }
}
