import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public void calcularFatorial(int num) {
        if (num < 1) {
            throw new IllegalArgumentException("Não existe fatorial menor do que 1.");
        } else {
            int fatorial = 1;
            for (int i = 2; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
        }
    }

    public static void main(String[] args) {
        Desafio16 desafio16 = new Desafio16();
        desafio16.calcularFatorial(1);
        desafio16.calcularFatorial(3);
        desafio16.calcularFatorial(5);
        desafio16.calcularFatorial(0);
    }
}
