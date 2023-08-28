import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio9 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void verificarSeHaNumerosRepetidos () {
        Set<Integer> setNumeros = numeros
            .stream()
            .collect(Collectors.toSet());

        if (setNumeros.size() == numeros.size()) {
            System.out.println("Não há números repetidos na lista.");
        } else {
            int numerosRepetidos = numeros.size() - setNumeros.size();
            System.out.println("Há " + numerosRepetidos + " números repetidos na lista.");
        }
    }

    public static void main(String[] args) {
        Desafio9 desafio9 = new Desafio9();
        desafio9.verificarSeHaNumerosRepetidos();
    }
}
