import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio20 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

    public void somarNumerosDivisiveisPor3e5() {
        List<Integer> numerosDivisiveisPor3e5 = numeros
            .stream()
            .filter(n -> n % 3 == 0 && n % 5 == 0)
            .collect(Collectors.toList());

        int soma = numerosDivisiveisPor3e5
            .stream()
            .reduce(0, (subtotal, total) -> subtotal + total);

        System.out.println("A soma dos números divisíveis por 3 e 5 são: " + soma);
    }

    public static void main(String[] args) {
        Desafio20 desafio20 = new Desafio20();
        desafio20.somarNumerosDivisiveisPor3e5();
    }
}
