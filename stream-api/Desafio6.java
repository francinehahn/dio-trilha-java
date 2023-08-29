import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio6 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void verificarNumerosMaioresQue10() {
        List<Integer> numerosMaioresQue10 = numeros
            .stream()
            .filter(n -> n > 10)
            .collect(Collectors.toList());
        
        if (numerosMaioresQue10.size() > 0) {
            System.out.println("Há " + numerosMaioresQue10 + " números maiores do que 10 na lista.");
        } else {
            System.out.println("Não há números maiores do que 10 na lista.");
        }
    }

    public static void main(String[] args) {
        Desafio6 desafio6 = new Desafio6();
        desafio6.verificarNumerosMaioresQue10();
    }
}
