import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio7 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void encontrarSegundoMaiorNumero() {
        List<Integer> numerosEmOrdemDecrescente = numeros
            .stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());


        int segundoMaiorNumero = numerosEmOrdemDecrescente.get(1);

        System.out.println("O segundo maior número da lista é: " + segundoMaiorNumero);
    }

    public static void main(String[] args) {
        Desafio7 desafio7 = new Desafio7();
        desafio7.encontrarSegundoMaiorNumero();
    }
}
