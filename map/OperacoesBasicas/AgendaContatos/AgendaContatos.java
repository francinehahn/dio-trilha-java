import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!this.agendaContatoMap.isEmpty()) {
            this.agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!this.agendaContatoMap.isEmpty()) {
            numeroPorNome = this.agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Maria", 996354785);
        agendaContatos.adicionarContato("João", 996554190);
        agendaContatos.adicionarContato("Paulo", 966377510);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Paulo");
        
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    }
}
