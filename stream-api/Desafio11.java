import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio11 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somarTodosOsQuadrados() {
        List<Integer> listaQuadrados = numeros
            .stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        
        int soma = listaQuadrados
            .stream()
            .reduce(0, (subtotal, total) -> subtotal + total);
        
        System.out.println("A soma de todos os quadrados é: " + soma);
    }

    public static void main(String[] args) {
        Desafio11 desafio11 = new Desafio11();
        desafio11.somarTodosOsQuadrados();
    }
}
