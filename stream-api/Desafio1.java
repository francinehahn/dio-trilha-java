import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Desafio1 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void ordenarArray () {
        Collections.sort(numeros);
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1();
        desafio1.ordenarArray();
    }
}
