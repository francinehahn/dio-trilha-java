import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        this.alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno : this.alunosSet) {
            if (aluno.getMatricula() == matricula) {
                this.alunosSet.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(this.alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(this.alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Maria", 1L, 7.5);
        gerenciadorAlunos.adicionarAluno("Pedro", 2L, 6.0);
        gerenciadorAlunos.adicionarAluno("João", 3L, 8.7);
        gerenciadorAlunos.adicionarAluno("Clara", 4L, 9.0);
        gerenciadorAlunos.adicionarAluno("Laura", 4L, 5.0);

        System.out.println("Todos os alunos:");
        gerenciadorAlunos.exibirAlunos();

        System.out.println("--------------");

        System.out.println("Alunos por nome: " + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota: " + gerenciadorAlunos.exibirAlunosPorNota());
    }
}
