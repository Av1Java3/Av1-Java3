package carro;

public class Carro 
{
	
	String chassi;
	float preco;
	Montadora montadora;
	Modelo modelo;
	Motorizacao motorizacao;
	Cambio cambio;
	Tipo tipo;
	Cor cor;
	
	public Carro (String _chassi, float _preco, Montadora _montadora, Modelo _modelo,
	Motorizacao _motorizacao, Cambio _cambio, Tipo _tipo, Cor _cor)
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
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (!(obj instanceof Carro)) 
		{
			return false;
		}
		Carro other = (Carro) obj;
		if (chassi == null) 
		{
			if (other.chassi != null) 
			{
				return false;
			}
		} 
		else if (!chassi.equals(other.chassi))
		{
			return false;
		}
		return true;
	}



	public String getChassi() {
		return chassi;
	}

	public float getPreco() {
		return preco;
	}

	public Montadora getMontadora() {
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

	public Tipo getTipo() {
		return tipo;
	}

	public Cor getCor() {
		return cor;
	}
	
	
	
	
	
}
