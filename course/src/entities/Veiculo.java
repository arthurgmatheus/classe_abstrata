package entities;

public abstract class Veiculo {

	private String cor = "Verde";
	private int qtdPessoas = 5;
		
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public abstract void ligar();
	
	public void desligar() {
		System.out.println("Veículo desligado.");
	}
	
	
}
