import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio14 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public boolean ehNumeroPrimo(int num) {
        int numeroDeDivisores = 0;

        if (num <= 1) return false;

        for(int i = 1; i <= num; i++) {
            if (num % i == 0) numeroDeDivisores++;
            if (numeroDeDivisores > 2) break;
        }

        if (numeroDeDivisores > 2) {
            return false;
        } else {
            return true;
        }
    }

    public void encontrarMaiorNumeroPrimo() {
        List<Integer> listaOrdemDecrescente = numeros
            .stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        
        int maiorNumeroPrimo = 0;

        for (int n : listaOrdemDecrescente) {
            if (ehNumeroPrimo(n)) {
                maiorNumeroPrimo = n;
                break;
            }
        }

        System.out.println("O maior número primo é: " + maiorNumeroPrimo);
    }

    public static void main(String[] args) {
        Desafio14 desafio14 = new Desafio14();
        desafio14.encontrarMaiorNumeroPrimo();
    }
}
