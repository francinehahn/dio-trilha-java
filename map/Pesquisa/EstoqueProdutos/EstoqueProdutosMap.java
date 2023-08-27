import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutosMap {
    private Map<Long, ProdutoMap> estoqueProdutosMap;

    public EstoqueProdutosMap() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    
    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        this.estoqueProdutosMap.put(codigo, new ProdutoMap(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if(!this.estoqueProdutosMap.isEmpty()) {
            for (ProdutoMap produto : this.estoqueProdutosMap.values()) {
                valorTotal += produto.getPreço() * produto.getQuantidade();
            }
        }

        return valorTotal;
    }

    public ProdutoMap obterProdutoMaisCaro() {
        ProdutoMap produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!this.estoqueProdutosMap.isEmpty()) {
            for (ProdutoMap produto : this.estoqueProdutosMap.values()) {
                if (produto.getPreço() > maiorPreco) {
                    maiorPreco = produto.getPreço();
                    produtoMaisCaro = produto;
                }
            }
        }

        return produtoMaisCaro;
    }

    public ProdutoMap obterProdutoMaisBarato() {
        ProdutoMap produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!this.estoqueProdutosMap.isEmpty()) {
            for (ProdutoMap produto : this.estoqueProdutosMap.values()) {
                if (produto.getPreço() < menorPreco) {
                    menorPreco = produto.getPreço();
                    produtoMaisBarato = produto;
                }
            }
        }

        return produtoMaisBarato;
    }

    public ProdutoMap obterProdutoMaiorValorTotalNoEstoque() {
        ProdutoMap produtoMaiorValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;

        if (!this.estoqueProdutosMap.isEmpty()) {
            for (ProdutoMap produto : this.estoqueProdutosMap.values()) {
                double valorProdutoEmEstoque = produto.getPreço() * produto.getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorValorNoEstoque = produto;
                }
            }
        }
        return produtoMaiorValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutosMap estoqueProdutos = new EstoqueProdutosMap();
        estoqueProdutos.adicionarProduto(1L, "Prduto1", 2, 59.90);
        estoqueProdutos.adicionarProduto(2L, "Prduto2", 5, 129.90);
        estoqueProdutos.adicionarProduto(3L, "Prduto3", 1, 1159.90);
        estoqueProdutos.adicionarProduto(4L, "Prduto4", 3, 29.90);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade em valor no estoque: " + estoqueProdutos.obterProdutoMaiorValorTotalNoEstoque());
    }
}
