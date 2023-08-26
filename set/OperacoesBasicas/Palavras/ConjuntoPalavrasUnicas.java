package Palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }
    
    public void adicionarPalavra(String palavra) {
        palavrasSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;
        for(Palavra p : palavrasSet) {
            if (p.getPalavra() == palavra) {
                palavraParaRemover = p;
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        for(Palavra p : palavrasSet) {
            if(p.getPalavra() == palavra) {
                return true;
            }
        }

        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }    

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("casa");
        conjuntoPalavrasUnicas.adicionarPalavra("casa");
        conjuntoPalavrasUnicas.adicionarPalavra("cachorro");
        conjuntoPalavrasUnicas.adicionarPalavra("gato");
        conjuntoPalavrasUnicas.adicionarPalavra("celular");
        conjuntoPalavrasUnicas.adicionarPalavra("cama");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("gato");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println("Existe palavra pessoa? " + conjuntoPalavrasUnicas.verificarPalavra("pessoa"));
        System.out.println("Existe palavra casa? " + conjuntoPalavrasUnicas.verificarPalavra("casa"));
    }
}
