package carro;

import veiculos.*;

public class Carro extends Veiculos //Esta classe herda ve�culos.
{
	Motorizacao motorizacao; //Por�m essas duas vari�veis s�o �nicas dessa classe.
	Cambio cambio;

	//Este construtor ir� criar valores vari�veis e formas de acess�-los.
	public Carro (String _chassi, float _preco, Montadoras _montadora, Modelo _modelo,
	Motorizacao _motorizacao, Cambio _cambio, Tipos _tipo, Cores _cor)
	{
		
		chassi = _chassi;
		preco = _preco;
		montadora = _montadora;
		modelo = _modelo;
		motorizacao = _motorizacao;
		cambio = _cambio;
		tipo = _tipo;
		cor = _cor;
		
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
