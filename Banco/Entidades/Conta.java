package Banco.Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Conta {
    private int numero;
    private Cliente cliente;
    private Agencia agencia;
    private double saldo;
    private double limite;
    private boolean status;
    private ArrayList<Transacao> transacoes;
    private char getTransacao;

    public Conta() {
        this.transacoes = new ArrayList<Transacao>();
    }

    public Conta(int numero, Cliente cliente, Agencia agencia, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.status = true;
    }

    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            Transacao transSacar = new Transacao(TipoTransacao.DÉBITO, new Date(), valor, this.getCliente(), '-');
            this.transacoes.add(transSacar);
            return true;
        } else {
            return false;
        }

    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            Transacao transDepo = new Transacao(TipoTransacao.DEPÓSITO, new Date(), valor, this.getCliente(),
                    this.getTransacao);
            this.transacoes.add(transDepo);
            return true;
        } else {
            return false;
        }
    }

    public boolean tranferir(double valor, Conta contaFav) {
        if (contaFav != null) {
            if (this.saldo + this.limite >= valor) {
                this.saldo -= valor;
                contaFav.saldo += valor;
                Transacao transEmite = new Transacao(TipoTransacao.TRANSFERÊNCIA, new Date(), valor, this.getCliente(),
                        '-');
                contaFav.transacoes.add(transEmite);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String extrato(){
        String = "";
        extrato += this.toString() + "\n";
        for (Transacao trans : this.transacoes){
            extrato += trans.toString() + "\n";
            

        };
    }
    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        return "Conta de " + this.cliente.getNome() + " numero " + this.numero;
    }
}