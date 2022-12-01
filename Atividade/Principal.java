package Atividade;

import java.util.ArrayList;
import java.util.Scanner;

import Atividade.Entidades.Homem;
import Atividade.Entidades.Mulher;

public class Principal {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual o tamanho do array");
        int tamanhoarray = pergunta.nextInt();
        
        System.out.println("Digite 1 para homem ou 2 para mulher");
        Scanner pergunta2 = new Scanner(System.in);
        int respostatipo = pergunta2.nextInt();
        if(respostatipo == 1){
            ArrayList listahomem = new ArrayList<Homem>();
            for (int i = 0; i < tamanhoarray; i++){
                System.out.println("\nDigite seu nome");
                Scanner pergunta3 = new Scanner(System.in);
                String nomePessoa = pergunta3.nextLine();

                System.out.println("\nQual sua data de nascimento");
                Scanner pergunta4 = new Scanner(System.in);
                String anivesario = pergunta4.nextLine();

                System.out.println("\nQual seu peso");
                Scanner pergunta5 = new Scanner(System.in);
                Double pesoPessoa = pergunta5.nextDouble();
                System.out.println("\nQual sua altura");
                Scanner pergunta6 = new Scanner(System.in);
                Double alturaPessoa = pergunta6.nextDouble();
                
                listahomem.add(i, (new Homem(nomePessoa, anivesario, pesoPessoa, alturaPessoa)));

            }

            for (int j = 0; j < tamanhoarray; j++){
                System.out.println(listahomem.get(j));
            }
        } 
    }
    
}
