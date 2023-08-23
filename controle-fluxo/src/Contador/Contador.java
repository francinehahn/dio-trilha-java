package Contador;

import java.util.Scanner;
import Exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o primeiro número: ");
            int primeiroParametro = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Por favor, digite o segundo número: ");
            int segundoParametro = scanner.nextInt();

            contar(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }   

    public static void contar (int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException, InterruptedException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
            Thread.sleep(500);
        }
    }
}
