package entities;

public class Onibus extends Veiculo {

	@Override
	public void ligar() {
		System.out.println("Ônibus ligado.");
	}
	
	@Override
	public void desligar() {
		System.out.println("Ônibus desligado.");
	}
}
