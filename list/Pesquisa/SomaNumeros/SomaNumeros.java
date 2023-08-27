package SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for(int num : listaNumeros) {
            soma += num;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (int num : listaNumeros) {
            if (num > maiorNumero) {
                maiorNumero = num;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = listaNumeros.get(0);
        for (int num : listaNumeros) {
            if (num < menorNumero) {
                menorNumero = num;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(35);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(18);

        somaNumeros.exibirNumeros();

        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());

        System.out.println("Soma: " + somaNumeros.calcularSoma());
    }
}


