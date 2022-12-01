package Atividade.Entidades;

public class Homem extends PessoaImc {

    public Homem(String nome, String DataNascimento, double peso, double altura) {
        super(nome, DataNascimento, peso, altura);
    }

    @Override
    public String resulIMC() {
        double resultadoIMC = this.calculaIMC(peso, altura);
        if (resultadoIMC < 20.7) {
            return "Abaixo do peso";
        } else if (resultadoIMC > 20.7 & resultadoIMC < 26.4){
            return "\nPeso ideal";
        } else {
            return "\nAcima do peso ideal";
        }

    }

}
