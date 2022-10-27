package Banco.Entidades;

import java.util.Date;

public class Cliente {
    // Atributos encapsulados do Objeto
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Date dataNasc;
    private Endereco endereco;

    // Método construtor vazio
    public Cliente() {
    }

    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }



    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Método construtor cheio
    public Cliente(String nome, String cpf, String email, String telefone, Date dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    // Métodos Gets e Sets

    // Método Get serve para informar o valor do atributo
    public String getNome() {
        return nome;
    }

    // Método Set para modificar o valor do atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }   
}
