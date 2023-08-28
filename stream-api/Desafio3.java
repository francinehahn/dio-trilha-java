import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio3 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void verificarNumerosPositivos() {
        List<Integer> numerosNegativos = numeros
            .stream()
            .filter(n -> n < 0)
            .collect(Collectors.toList());
        
        if (numerosNegativos.size() > 0) {
            System.out.println("Há " + numerosNegativos.size() + " números negativos na lista.");
        } else {
            System.out.println("Não há números negativos na lista.");
        }
    }

    public static void main(String[] args) {
        Desafio3 desafio3 = new Desafio3();
        desafio3.verificarNumerosPositivos();
    }
}
