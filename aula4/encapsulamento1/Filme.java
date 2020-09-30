package aula4.encapsulamento1;

public class Filme {
    private static int filmesCriados = 0;

    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autorPrincipal;

    public Filme(int codigo, String nome)
    {
        this.codigo = codigo;
        this.nome = nome;

        Filme.filmesCriados += 1;
    }

    public String ToString()
    {
        return this.nome + " (" + this.autorPrincipal + ", " + this.ano + ") - " + this.genero + " : Código " + this.codigo;
    }

    public static int FilmesCriados()
    {
        return Filme.filmesCriados;
    }

    public int GetCodigo()
    {
        return this.codigo;
    }

    public void SetCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String GetNome()
    {
        return this.nome;
    }

    public void SetNome(String nome)
    {
        this.nome = nome;
    }
    
    public String GetGenero()
    {
        return this.genero;
    }

    public void SetGenero(String genero)
    {
        this.genero = genero;
    }

    public int GetAno()
    {
        return this.ano;
    }

    public void SetAno(int ano)
    {
        this.ano = ano;
    }

    public String GetAutorPrincipal()
    {
        return this.autorPrincipal;
    }

    public void SetAutorPrincipal(String autorPrincipal)
    {
        this.autorPrincipal = autorPrincipal;
    }
}
