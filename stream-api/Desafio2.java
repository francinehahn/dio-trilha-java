import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio2 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somaNumerosPares() {
        List<Integer> numerosPares = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .collect(Collectors.toList());
        
        int soma = numerosPares.stream()
            .reduce(0, (subtotal, numero) -> subtotal + numero);

        System.out.println("Soma dos números pares: " + soma);
    }

    public static void main(String[] args) {
        Desafio2 desafio2 = new Desafio2();
        desafio2.somaNumerosPares();
    }
}
