import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarLivroPorAutor (String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarLivroPorIntervaloDeTempo (int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeTempo = new ArrayList<>();
        
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeTempo.add(livro);
                }
            }
        }

        return livrosPorIntervaloDeTempo;
    }

    public Livro pesquisarLivroPorTitulo (String titulo) {
        Livro livroPorTitulo = null;
        
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1995);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2010);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1985);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 2001);

        System.out.println("Livros por autor: " + catalogoLivros.pesquisarLivroPorAutor("Autor 2"));
        System.out.println("Livros por intervalo de tempo: " + catalogoLivros.pesquisarLivroPorIntervaloDeTempo(2000, 2020));
        System.out.println("Livro por título: " + catalogoLivros.pesquisarLivroPorTitulo("Livro 4"));
        System.out.println("Livro por título: " + catalogoLivros.pesquisarLivroPorTitulo("Livro 10"));
    }
}
