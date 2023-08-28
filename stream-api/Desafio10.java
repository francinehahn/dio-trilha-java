import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
    public void agruparNumerosImparesMultiplosDe3Ou5() {
        Map<String, List<Integer>> numerosAgrupados = numeros.stream()
            .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
            .collect(Collectors.groupingBy(numero -> {
                if (numero % 3 == 0) {
                    return "Ímpar múltiplo de 3";
                } else {
                    return "Ímpar múltiplo de 5";
                }
            }));

        System.out.println(numerosAgrupados);
    }

    public static void main(String[] args) {
        Desafio10 desafio10 = new Desafio10();
        desafio10.agruparNumerosImparesMultiplosDe3Ou5();
    }
}
