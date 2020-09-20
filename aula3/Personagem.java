package aula3;

import aula3.Arma;

public class Personagem
{

    public String nome;
    public int tamanho;
    public String cor;
    public float dinheiro;

    public Personagem(String nome, int tamanho, String cor, float dinheiro)
    {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.dinheiro = dinheiro;
    }

    public String GetNome()
    {
        return nome;
    }

    public void SetNome(String nome)
    {
        this.nome = nome;
    }

    public int GetTamanho()
    {
        return tamanho;
    }

    public void SetTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }

    public String GetCor()
    {
        return cor;
    }

    public void SetCor(String cor)
    {
        this.cor = cor;
    }

    public float GetDinheiro()
    {
        return dinheiro;
    }

    public void SetDinheiro(int dinheiro)
    {
        this.dinheiro = dinheiro;
    }

    public void Correr(String direcao)
    {
        System.out.printf("%s está correndo na direção %s\n", nome, direcao);
    }

    public void Atirar(float angulo, Arma a)
    {
        a.Disparar(angulo);
    }

    public void ComprarTiros(float dinheiro, Arma a)
    {
        // Garante que o dinheiro gasto não exceda a quantidade que o personagem possui
        if (this.dinheiro < dinheiro) dinheiro = this.dinheiro;

        // Calcula o tanto de tiros comprados
        int tirosComprados = (int) Math.floor(dinheiro / a.GetCustoPorTiro());

        // Atualiza saldo
        this.dinheiro -= tirosComprados * a.GetCustoPorTiro();

        // Atualiza número de tiros
        a.Recarregar(tirosComprados);
    }

}