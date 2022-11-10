package src;

import src.poo.Fornecedor;
import src.poo.Produto;
import src.poo.ConjuntoProduto;

public class Principal {
    public static void main(String[] args) throws Exception{
        System.out.println("Bem vindo");

        Fornecedor f1 = new Fornecedor("52413687", "85412103", "José");
        Fornecedor f2 = new Fornecedor("41203697", "21045879", "Maria");

        //Produto prod1 = new Produto(1, "Televisão", 2500, f2);
        //Produto prod2 = new Produto(2, "Geladeira", 3000, f1);
        Produto p1 = new Produto(1, "Notebook", (float) 2750.55, f2);
        Produto p2 = new Produto(2, "Tv", (float) 1750.38, f2);
        Produto p3 = new Produto(3, "Celular", (float) 3600.25, f1);
        Produto p4 = new Produto(4, "HD", (float) 320.62, f2);

        ConjuntoProduto conjuntoProdutos = new ConjuntoProduto();
        conjuntoProdutos.adicionarProdutos(p1);
        conjuntoProdutos.adicionarProdutos(p2);
        conjuntoProdutos.adicionarProdutos(p3);
        conjuntoProdutos.adicionarProdutos(p4);



    }

}
