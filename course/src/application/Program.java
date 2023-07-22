package application;

import entities.Aviao;
import entities.Carro;
import entities.Onibus;

public class Program {

	public static void main(String[] args) {
		
		
		Carro carro = new Carro();
		Aviao aviao = new Aviao();
		Onibus onibus = new Onibus();
		
		carro.ligar();
		carro.desligar();
		
		aviao.ligar();
		aviao.desligar();
		
		onibus.ligar();
		onibus.desligar();

	}

}
