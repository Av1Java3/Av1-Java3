package motocicleta;

import veiculos.Cores;
import veiculos.Montadoras;




public class Motocicleta
{
	String chassi;
	float preco;
	Cores cor;
	MCilindrada cilindrada;
	MCapTanque capTanque;
	Modelo modelo;
	Montadoras montadora;
	Tipo tipo;
	
	public Motocicleta(String _chassi,float _preco,Cores _cor,MCilindrada _cilindrada,MCapTanque _capTanque,Modelo _modelo,Montadoras _montadora,Tipos _tipo)
	{
		preco = _preco;
		chassi = _chassi;
		cor = _cor;
		cilindrada = _cilindrada;
		capTanque = _capTanque;
		modelo = _modelo;
		tipo = _tipo;
		montadora = _montadora;
		
		
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
		if (!(obj instanceof Motocicleta)) 
		{
			return false;
		}
		Motocicleta other = (Motocicleta) obj;
		if (chassi == null) 
		{
			if (other.chassi != null) 
			{
				return false;
			}
		} else if (!chassi.equals(other.chassi)) 
		{
			return false;
		}
		return true;
	}



	public float getPreco() {
		return preco;
	}

	public String getChassi() {
		return chassi;
	}

	
	public Cores getCor() {
		return cor;
	}

	

	public MCilindrada getCilindrada() {
		return cilindrada;
	}


	public MCapTanque getCapTanque() {
		return capTanque;
	}

	public MModelo getModelo() {
		return modelo;
	}

	public Montadoras getMontadora() {
		return montadora;
	}

	public MTipo getTipo() {
		return tipo;
	}
	

}
