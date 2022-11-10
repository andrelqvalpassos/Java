package src.poo;

public class Produto {
    private int Codigo;
    private String Nome;
    private float valor;
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(int Codigo, String Nome, float valor, Fornecedor fornecedor) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.valor = valor;
        this.fornecedor = fornecedor;

    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Float atualizaPreco(Float valor1) {

        if (valor1 == 0) {

            System.out.println("Valor incorreto, digite um valor diferente de 0");

        } else {
            this.valor = this.valor * ((valor1 / 100) + 1);

        }
        return this.valor;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + Codigo + ", nome=" + Nome + ", valor=" + valor + ", fornecedor=" + fornecedor + "]";
    }

}
