import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        this.agendaEventos.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.agendaEventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.agendaEventos);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, 6, 20), "Evento1", "Atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 5, 15), "Evento2", "Atracao2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 02), "Evento3", "Atracao3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 4, 25), "Evento4", "Atracao4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
