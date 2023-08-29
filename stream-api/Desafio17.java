import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio17 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void agruparNumerosEmParesEimpares() {
        Map<String, List<Integer>> numerosAgrupados = numeros
            .stream()
            .collect(Collectors.groupingBy(numero -> {
                if (numero % 2 == 0) {
                    return "Pares";
                } else {
                    return "Ímpares";
                }
            }));

        System.out.println(numerosAgrupados);
    }

    public static void main(String[] args) {
        Desafio17 desafio17 = new Desafio17();
        desafio17.agruparNumerosEmParesEimpares();
    }
}
