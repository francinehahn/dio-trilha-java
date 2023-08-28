import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void multiplicarTodosOsElementos() {
        int produto = numeros
            .stream()
            .reduce(1, (subtotal, total) -> subtotal * total);
        
        System.out.println("O produto de todos os elementos da lista é: " + produto);
    }

    public static void main(String[] args) {
        Desafio12 desafio12 = new Desafio12();
        desafio12.multiplicarTodosOsElementos();
    }
}
