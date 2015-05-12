package carro;

import veiculos.*;

public class Carro extends Veiculos //Esta classe herda veículos.
{
	Motorizacao motorizacao; //Porém essas duas variáveis são únicas dessa classe.
	Cambio cambio;
	SpecsCarro specs;

	//Construtor da classe carro.
	public Carro (String _chassi, float _preco, SpecsCarro _specs)
	{
		
		chassi = _chassi;
		preco = _preco;
		specs = _specs;
		
	}
	
	
	public String getChassi() {
		return chassi;
	}

	public float getPreco() {
		return preco;
	}

	public Montadoras getMontadora() {
		return montadora;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public Motorizacao getMotorizacao() {
		return motorizacao;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public Cores getCor() {
		return cor;
	}
	
	
	
	
	
}
