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
	
	
		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Carro))
			return false;
		Carro other = (Carro) obj;
		if (cambio != other.cambio)
			return false;
		if (motorizacao != other.motorizacao)
			return false;
		if (specs == null) {
			if (other.specs != null)
				return false;
		} else if (!specs.equals(other.specs))
			return false;
		return true;
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