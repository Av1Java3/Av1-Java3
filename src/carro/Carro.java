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

	public Motorizacao getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(Motorizacao motorizacao) {
		this.motorizacao = motorizacao;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}

	public SpecsCarro getSpecs() {
		return specs;
	}

	public void setSpecs(SpecsCarro specs) {
		this.specs = specs;
	}
	
	
}