package carro;

import veiculos.Cores;
import veiculos.Modelo;
import veiculos.Montadoras;
import veiculos.Tipos;

public class SpecsCarro 
{
	 Cores cor;
	 Modelo modelo;
	 Montadoras montadora;
	 Tipos tipo;
	 Cambio cambio;
	 Motorizacao motorizacao;
	 
	 private SpecsCarro(Montadoras _montadora, Modelo _modelo,
				Motorizacao _motorizacao, Cambio _cambio, Tipos _tipo, Cores _cor)
	 {
		 	montadora = _montadora;
			modelo = _modelo;
			motorizacao = _motorizacao;
			cambio = _cambio;
			tipo = _tipo;
			cor = _cor;
	 }

	 
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SpecsCarro)) {
			return false;
		}
		SpecsCarro other = (SpecsCarro) obj;
		if (cambio != other.cambio) {
			return false;
		}
		if (cor != other.cor) {
			return false;
		}
		if (modelo != other.modelo) {
			return false;
		}
		if (montadora != other.montadora) {
			return false;
		}
		if (motorizacao != other.motorizacao) {
			return false;
		}
		if (tipo != other.tipo) {
			return false;
		}
		return true;
	}



	public Cores getCor() 
	{
		return cor;
	}

	public void setCor(Cores cor) 
	{
		this.cor = cor;
	}

	public Modelo getModelo() 
	{
		return modelo;
	}

	public void setModelo(Modelo modelo) 
	{
		this.modelo = modelo;
	}

	public Montadoras getMontadora() 
	{
		return montadora;
	}

	public void setMontadora(Montadoras montadora) 
	{
		this.montadora = montadora;
	}

	public Tipos getTipo() 
	{
		return tipo;
	}

	public void setTipo(Tipos tipo) 
	{
		this.tipo = tipo;
	}

	public Cambio getCambio() 
	{
		return cambio;
	}

	public void setCambio(Cambio cambio) 
	{
		this.cambio = cambio;
	}

	public Motorizacao getMotorizacao() 
	{
		return motorizacao;
	}

	public void setMotorizacao(Motorizacao motorizacao) 
	{
		this.motorizacao = motorizacao;
	}
	 
	 

}
