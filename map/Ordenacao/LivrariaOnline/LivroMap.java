public class LivroMap implements Comparable<LivroMap> {
    private String titulo;
    private String autor;
    private double preco;
    
    public LivroMap(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public int compareTo(LivroMap l) {
        return Double.compare(preco, l.getPreco());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "{titulo: " + titulo + ", autor: " + autor + ", preco: " + preco + "}";
    }
}
