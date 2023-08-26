import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        this.dicionario.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(this.dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        return this.dicionario.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("casa", "local onde pessoas moram");
        dicionario.adicionarPalavra("cachorro", "animal de estimação");
        dicionario.adicionarPalavra("banana", "fruta com casca amarela rica em potássio");

        dicionario.exibirPalavras();
        System.out.println("Pesquisa por palavra olho: " + dicionario.pesquisarPorPalavra("olho"));
        System.out.println("Pesquisa por palavra casa: " + dicionario.pesquisarPorPalavra("casa"));

        dicionario.removerPalavra("casa");
        dicionario.exibirPalavras();
    }
}
