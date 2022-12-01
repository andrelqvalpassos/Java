package Atividade.Entidades;

public class Pessoa {
    protected String nome;
    protected String DataNascimento;


    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        DataNascimento = dataNascimento;
    }



    @Override
    public String toString() {
        return "Pessoa [nome da pessoa =" + nome + ", data de nascimento da pessoa =" + DataNascimento + "]";
    }

     
}

