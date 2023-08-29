import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void removerNumerosImpares() {
        List<Integer> listaNumerosPares = numeros
        .stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

        System.out.println(listaNumerosPares);
    }

    public static void main(String[] args) {
        Desafio4 desafio4 = new Desafio4();
        desafio4.removerNumerosImpares();
    }
}
