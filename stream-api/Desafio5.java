import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void mediaNumerosMaioresQue5() {
        List<Integer> numerosMaioresQue5 = numeros
            .stream()
            .filter(n -> n > 5)
            .collect(Collectors.toList());

        int soma = numerosMaioresQue5
            .stream()
            .reduce(0, (subtotal, numero) -> subtotal + numero);

        double media = soma / numerosMaioresQue5.size();

        System.out.println("A média dos números maiores do que 5 é: " + media);
    }

    public static void main(String[] args) {
        Desafio5 desafio5 = new Desafio5();
        desafio5.mediaNumerosMaioresQue5();
    }
}
