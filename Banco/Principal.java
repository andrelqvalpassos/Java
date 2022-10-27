package Banco;

import java.util.Date;

import Banco.Entidades.Agencia;
import Banco.Entidades.Cliente;
import Banco.Entidades.Conta;
import Banco.Entidades.Endereco;

public class Principal {
    public static void main(String[] args) {
        Endereco endSenac = new Endereco("PE", "Recife", "Santa Amaro", "Rubens", 10, "Predio", "53435-590");
        Endereco endCliente = new Endereco("SP", "Diademma", "ABC", "João Almeida", 191, "Casa", "23454-789");
        Agencia agSenac = new Agencia(191, "98234546", "senac@gmail.com");
        Cliente andreCliente = new Cliente("André", "146397754-89", "andre@gmail.com", "987734121", new Date(10/12/2022));
        Conta contaAndre = new Conta(10, andreCliente, agSenac, 200, 2000);
    }
}
