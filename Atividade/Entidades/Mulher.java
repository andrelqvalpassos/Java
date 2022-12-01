package Atividade.Entidades;

public class Mulher extends PessoaImc {

    public Mulher(String nome, String DataNascimento, double peso, double altura) {
        super(nome, DataNascimento, peso, altura);
    }
    
    @Override
    public String resulIMC() {
        double resultadoIMC = this.calculaIMC(peso, altura);
        if (resultadoIMC < 19) {
            return "Abaixo do peso ideal";
        } else if (resultadoIMC > 19 & resultadoIMC < 25.8){
            return "\nPeso ideal";
        } else {
            return "\nAcima do peso ideal";
        }

    }
    
}
