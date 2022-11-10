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
        Agencia agSenac = new Agencia(191, "98234546", "senac@gmail.com", endSenac);
        Cliente andreCliente = new Cliente("André", "146397754-89", "andre@gmail.com", "987734121", new Date(10/12/2022), endCliente);
        Cliente DeborahCliente = new Cliente("Deborah", "125874521-98", "deborah@gmail.com", "874512396", null, endCliente);
        Conta contaAndre = new Conta(10, andreCliente, agSenac, 25000, 2000);
        Conta contaDeborah = new Conta(12, andreCliente, agSenac, 10000, 0);
        //System.out.println(contaAndre.getSaldo());
        //System.out.println(agSenac.getNumero());
        System.out.println(contaAndre);
        contaAndre.depositar(7500);
        contaDeborah.sacar(1800);
        contaAndre.sacar(459);
        contaDeborah.depositar(1200);
        contaDeborah.sacar(4000);
        contaAndre.sacar(130);
        contaDeborah.sacar(2000);
        System.out.println(contaAndre.extrato());
        System.out.println(contaDeborah.extrato());
    }
}
