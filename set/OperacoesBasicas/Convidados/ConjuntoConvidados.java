package Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado convidado: convidadosSet) {
            if(convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Maria", 1);
        conjuntoConvidados.adicionarConvidado("Pedro", 2);
        conjuntoConvidados.adicionarConvidado("Laura", 3);
        conjuntoConvidados.adicionarConvidado("Suzana", 4);
        conjuntoConvidados.adicionarConvidado("João", 4);

        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
