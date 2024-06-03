public class Main {
    public static void main(String[] args) {
        // Criar objetos Aluno
        Aluno aluno1 = new Aluno("Andreza", 22, 1135);
        Aluno aluno2 = new Aluno("Rodrigo", 17, 1136);
        Aluno aluno3 = new Aluno("Shuri", 18, 1137);
        Aluno aluno4 = new Aluno("Ludmilla", 21, 1137);
        Aluno aluno5 = new Aluno("Clara", 19, 1138);

        // Criar objetos Turma
        Turma turmaA = new Turma("Turma A", "1A");
        Turma turmaB = new Turma("Turma B", "1B");

        // Adicionar alunos às turmas
        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.adicionarAluno(aluno3);

        turmaB.adicionarAluno(aluno4);
        turmaB.adicionarAluno(aluno5);
        turmaB.adicionarAluno(aluno1); // Adicionando aluno1 também na Turma B

        // Listar alunos das turmas
        System.out.println("Listando alunos da Turma A:");
        turmaA.listarAlunos();

        System.out.println();

        System.out.println("Listando alunos da Turma B:");
        turmaB.listarAlunos();
    }
}
