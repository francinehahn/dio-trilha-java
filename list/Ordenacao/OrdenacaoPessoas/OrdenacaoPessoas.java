package OrdenacaoPessoas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Maria", 32, 1.63);
        ordenacaoPessoas.adicionarPessoa("Lucas", 25, 1.80);
        ordenacaoPessoas.adicionarPessoa("Fernanda", 28, 1.75);
        ordenacaoPessoas.adicionarPessoa("Paulo", 34, 1.77);
        ordenacaoPessoas.adicionarPessoa("Clara", 19, 1.56);

        System.out.println("ordenação por altura: " + ordenacaoPessoas.ordenarPorAltura());
        System.out.println("-------------------");
        System.out.println("ordenação por idade: " + ordenacaoPessoas.ordenarPorIdade());
    }
}
