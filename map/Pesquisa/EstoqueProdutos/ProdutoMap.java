public class ProdutoMap {
    private String nome;
    private int quantidade;
    private double preço;
    
    public ProdutoMap(String nome, int quantidade, double preço) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreço() {
        return preço;
    }

    @Override
    public String toString() {
        return "{nome: " + nome + ", quantidade: " + quantidade + ", preço: " + preço + "}";
    }
}
