import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somarTodosOsNumeros() {
        int soma = numeros
            .stream()
            .reduce(0, (subtotal, numero) -> subtotal + numero);

        System.out.println("A soma de todos os números da lista é: " + soma);
    }

    public static void main(String[] args) {
        Desafio8 desafio8 = new Desafio8();
        desafio8.somarTodosOsNumeros();
    }
}
