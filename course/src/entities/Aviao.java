package entities;

public class Aviao extends Veiculo {

	
	public void ligar() {
		System.out.println("Avião ligado.");
	}
	
	@Override
	public void desligar() {
		System.out.println("Avião desligado.");
	}
}
