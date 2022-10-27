package Banco.Entidades;

public class Agencia {
    private int numero;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Agencia() {
    }

    public Agencia(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Agencia(int numero, String telefone, String email, Endereco endereco) {
        this.numero = numero;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
