package Atividade.Entidades;

public abstract class PessoaImc extends Pessoa {
    protected double peso;
    protected double altura;

    public PessoaImc(String nome, String DataNascimento, double peso, double altura) {
        super(nome, DataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC(Double peso, Double altura){
        double resultado = peso /(altura*altura);
        return resultado;

    }

    public abstract String resulIMC();

    @Override
    public String toString() {
        return "\nNome: " + this.nome +
        "\nData de nascimeto: " + this.DataNascimento +
        "\nPeso: " + this.peso +
        "\nAltura: " + this.altura + 
        "\nResultado: "+ this.resulIMC();
    }
    
    
    
}
