import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaProdutos;

    public CadastroProdutos() {
        this.listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, Long codigo, double preco, int quantidade) {
        this.listaProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(this.listaProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.listaProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Produto 1", 1L, 129.90, 1);
        cadastroProdutos.adicionarProduto("Produto 2", 2L, 29.90, 2);
        cadastroProdutos.adicionarProduto("Produto 3", 3L, 79.90, 2);
        cadastroProdutos.adicionarProduto("Produto 4", 4L, 317.80, 1);
        cadastroProdutos.adicionarProduto("Produto 5", 5L, 39.90, 3);

        System.out.println("Produtos por nome: ");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("-----------------");

        System.out.println("Produtos por preco: ");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
