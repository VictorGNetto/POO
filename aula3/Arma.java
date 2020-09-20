package aula3;

public class Arma {

    private int qtdTiros;
    private int potencia;
    private int velocidade;
    private float custoPorTiro;

    public Arma(int qtdTiros, int potencia, int velocidade, float custoPorTiro)
    {
        this.qtdTiros = qtdTiros;
        this.potencia = potencia;
        this.velocidade = velocidade;
        this.custoPorTiro = custoPorTiro;
    }

    public int GetQtdTiros()
    {
        return qtdTiros;
    }

    public void SetQtdTiros(int qtdTiros)
    {
        this.qtdTiros = qtdTiros;
    }

    public int GetPotencia()
    {
        return potencia;
    }

    public void SetPotencia(int potencia)
    {
        this.potencia = potencia;
    }

    public int GetVelocidade()
    {
        return velocidade;
    }

    public void SetVelocidade(int velocidade)
    {
        this.velocidade = velocidade;
    }

    public float GetCustoPorTiro()
    {
        return custoPorTiro;
    }

    public void SetCustoPorTiro(float custoPorTiro)
    {
        this.custoPorTiro = custoPorTiro;
    }

    public void Recarregar(int tiros)
    {
        qtdTiros += tiros;
    }

    public void Disparar(float angulo)
    {
        if (qtdTiros > 0)
        {
            System.out.printf("Disparando com angulação %.2f e Potência %d\n", angulo, potencia);
            qtdTiros--;
        }
        else
        {
            System.out.println("Arma descarregada");
        }
    }
}
