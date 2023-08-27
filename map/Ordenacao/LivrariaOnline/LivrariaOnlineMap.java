import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnlineMap {
    private Map<String, LivroMap> livraria;

    public LivrariaOnlineMap() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        this.livraria.put(link, new LivroMap(titulo, autor, preco));
    }   

    public void removerLivro(String titulo) {
        for (Map.Entry<String, LivroMap> entry : this.livraria.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
                String livroRemovido = entry.getKey();
                this.livraria.remove(livroRemovido);
                break;
            }
        }
    }

    public Map<String, LivroMap> exibirLivrosOrdenadosPorPreco() {
        return new TreeMap<>(this.livraria);
    }

    public Map<String, LivroMap> pesquisarLivrosPorAutor(String autor) {
        Map<String, LivroMap> livrosPorAutor = new HashMap<>();
        
        for (Map.Entry<String, LivroMap> entry : this.livraria.entrySet()) {
            if (entry.getValue().getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public LivroMap obterLivroMaisCaro() {
        LivroMap livroMaisCaro = null;
        double precoMaisAlto = -1;
        
        for (Map.Entry<String, LivroMap> entry : this.livraria.entrySet()) {
            LivroMap livro = entry.getValue();
            if (livro.getPreco() > precoMaisAlto) {
                precoMaisAlto = livro.getPreco();
                livroMaisCaro = livro;
            }
        }
        return livroMaisCaro;
    }

    public LivroMap exibirLivroMaisBarato() {
        LivroMap livroMaisBarato = null;
        double precoMaisBaixo = 100000;

        for (Map.Entry<String, LivroMap> entry : this.livraria.entrySet()) {
            LivroMap livro = entry.getValue();

            if (livro.getPreco() < precoMaisBaixo) {
                precoMaisBaixo = livro.getPreco();
                livroMaisBarato = livro;
            }
        }

        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnlineMap livrariaOnline = new LivrariaOnlineMap();
        livrariaOnline.adicionarLivro("link1", "titulo1", "autor1", 59.90);
        livrariaOnline.adicionarLivro("link2", "titulo2", "autor1", 49.90);
        livrariaOnline.adicionarLivro("link3", "titulo3", "autor2", 39.90);
        livrariaOnline.adicionarLivro("link4", "titulo4", "autor3", 49.90);

        System.out.println("Livros ordenados por preço: " + livrariaOnline.exibirLivrosOrdenadosPorPreco());
        livrariaOnline.removerLivro("titulo4");
        System.out.println("Livros ordenados por preço: " + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("Livros por autor: " + livrariaOnline.pesquisarLivrosPorAutor("autor1"));

        System.out.println("Livro mais barato: " + livrariaOnline.exibirLivroMaisBarato());
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
    }
}

