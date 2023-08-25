package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensCarrinho;

    public CarrinhoDeCompras () {
        this.itensCarrinho = new ArrayList<>();
    }

    public void adicionarItem (String nome, double preco, int quantidade) {
        itensCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem (String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itensCarrinho) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        itensCarrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal () {
        double valorTotal = 0;
        for (Item item : itensCarrinho) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens () {
        System.out.println(itensCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Vestido rosa", 229.90, 1);
        carrinhoDeCompras.adicionarItem("Blusa branca", 119.90, 2);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Blusa branca");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
