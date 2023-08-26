package Contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Laura Menezes", 996354789);
        agendaContatos.adicionarContato("Pedro", 966354580);
        agendaContatos.adicionarContato("Pedro", 916553670);
        agendaContatos.adicionarContato("Lucas", 995541223);
        agendaContatos.adicionarContato("Laura Silva", 995541223);

        agendaContatos.exibirContato();

        agendaContatos.atualizarNumeroContato("Laura Menezes", 991115611);

        agendaContatos.exibirContato();

        System.out.println("Pesquisar: " + agendaContatos.pesquisarPorNome("Laura"));
    }
}
