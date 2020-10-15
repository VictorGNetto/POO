package prova1;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula)
    {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String GetNome()
    {
        return this.nome;
    }

    public int GetMatricula()
    {
        return this.matricula;
    }

}
