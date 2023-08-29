import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio18 {
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

    public void filtrarNumerosPrimos() {
        List<Integer> numerosPrimos = numeros
            .stream()
            .filter(n -> ehNumeroPrimo(n))
            .collect(Collectors.toList());

        System.out.println("Números primos: " + numerosPrimos);
    }

    public static void main(String[] args) {
        Desafio18 desafio18 = new Desafio18();
        desafio18.filtrarNumerosPrimos();
    }
}
