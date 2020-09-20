package aula3;

public class Programa {
	public static void main(String[] args) {
		
		Arma pistola = new Arma(5, 90, 200, 15.0f);
		
		System.out.println("Potência: " + pistola.GetPotencia() + "mm");
		
		pistola.SetPotencia(50);
		
		Personagem p1 = new Personagem("Atirador", 180, "Azul", 300.0f);
		
		p1.Atirar(45, pistola);
		
		System.out.println("Potência: " + pistola.GetPotencia() + "mm");
        System.out.println("Velocidade: " + pistola.GetVelocidade() + "m/s");
        
        System.out.println("Saldo do " + p1.GetNome() + ": " + p1.GetDinheiro());
        System.out.println("Qtd tiros: " + pistola.GetQtdTiros());
        System.out.println("Preço do tiro: " + pistola.GetCustoPorTiro());
        p1.ComprarTiros(40.0f, pistola);
        System.out.println("Novo saldo do " + p1.GetNome() + ": " + p1.GetDinheiro());
        System.out.println("Nova qtd tiros: " + pistola.GetQtdTiros());
		
	}
}