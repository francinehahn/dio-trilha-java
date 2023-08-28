import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void filtrarNumerosDentroDeIntervalo() {
        List<Integer> numerosDentroDeIntervalo = numeros
            .stream()
            .filter(n -> n > 4 && n < 11)
            .collect(Collectors.toList());

        System.out.println("Intervalo entre 5 e 10: " + numerosDentroDeIntervalo);
    }

    public static void main(String[] args) {
        Desafio13 desafio13 = new Desafio13();
        desafio13.filtrarNumerosDentroDeIntervalo();
    }
}
