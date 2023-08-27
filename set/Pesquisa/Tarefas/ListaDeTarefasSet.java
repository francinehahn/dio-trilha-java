package Tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefasSet {
    private Set<TarefaSet> listaDeTarefas;

    public ListaDeTarefasSet() {
        this.listaDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaDeTarefas.add(new TarefaSet(descricao));
    }

    public void removerTarefa(String descricao) {
        for (TarefaSet tarefa : listaDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                listaDeTarefas.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(listaDeTarefas);
    }

    public int contarTarefas() {
        return listaDeTarefas.size();
    }

    public Set<TarefaSet> obterTarefasConcluidas() {
        Set<TarefaSet> tarefasConcluidas = new HashSet<>();

        for (TarefaSet tarefa : listaDeTarefas) {
            if (tarefa.getConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    public Set<TarefaSet> obterTarefasPendentes() {
        Set<TarefaSet> tarefasPendentes = new HashSet<>();

        for (TarefaSet tarefa : listaDeTarefas) {
            if (!tarefa.getConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (TarefaSet tarefa : listaDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (TarefaSet tarefa : this.listaDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        this.listaDeTarefas.clear();     
    }

    public static void main(String[] args) {
        ListaDeTarefasSet listaDeTarefas = new ListaDeTarefasSet();
        listaDeTarefas.adicionarTarefa("Caminhar com cachorro");
        listaDeTarefas.adicionarTarefa("Ir para a academia");
        listaDeTarefas.adicionarTarefa("Lavar a louça");
        listaDeTarefas.adicionarTarefa("Limpar a casa");

        System.out.println(listaDeTarefas.contarTarefas());
        System.out.println("Todas as tarefas:");
        listaDeTarefas.exibirTarefas();
        listaDeTarefas.marcarTarefaConcluida("Caminhar com cachorro");
        
        System.out.println("----------------");
        System.out.println("Todas as tarefas:");
        listaDeTarefas.exibirTarefas();

        System.out.println("----------------");
        System.out.println("Tarefas concluidas:");
        System.out.println(listaDeTarefas.obterTarefasConcluidas());

        System.out.println("----------------");
        System.out.println("Tarefas pendentes:");
        System.out.println(listaDeTarefas.obterTarefasPendentes());

        System.out.println("----------------");
        listaDeTarefas.limparListaTarefas();
        System.out.println("Todas as tarefas:");
        listaDeTarefas.exibirTarefas();
    }
}
