import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private String codigo;
    private List<Aluno> alunos;

    public Turma(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno na turma " + nome + ".");
        } else {
            System.out.println("Alunos na " + nome + ":");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }
}
