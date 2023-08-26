import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Long codigo; 
    private double preço;
    private int quantidade;
    
    public Produto(String nome, Long codigo, double preço, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Codigo não pode ser igual
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{nome: " + nome + ", codigo: " + codigo + ", preço: " + preço + ", quantidade: " + quantidade + "}";
    }
}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreço(), p2.getPreço());
    }
}
