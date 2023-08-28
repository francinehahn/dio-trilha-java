import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void ordenarArray () {
        List<Integer> numerosOrdenados = numeros
        .stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());

        System.out.println(numerosOrdenados);
    }

    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1();
        desafio1.ordenarArray();
    }
}
