package prova1;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria Lúcia", 245678);
        Aluno aluno2 = new Aluno("João Batista", 345445);

        System.out.println("Nome\t\tMatrícula");
        System.out.println("-------------------------");
        System.out.println(aluno1.GetNome() + "\t" + aluno1.GetMatricula());
        System.out.println(aluno2.GetNome() + "\t" + aluno2.GetMatricula());
    }
}
