package aula4.encapsulamento1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String codigo, nome, genero, ano, autorPrincipal;
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o Código, o Nome, o Gênero, o Ano e o Autor Principal do Filme");
        System.out.println("Para sair digite 0");

        codigo = input.next();

        while (Integer.parseInt(codigo) != 0)
        {
            nome = input.next();
            genero = input.next();
            ano = input.next();
            autorPrincipal = input.next();

            Filme filme = new Filme(Integer.parseInt(codigo), nome);
            filme.SetGenero(genero);
            filme.SetAno(Integer.parseInt(ano));
            filme.SetAutorPrincipal(autorPrincipal);
            
            System.out.println(filme.ToString());

            codigo = input.next();
        }

        input.close();
    }
}