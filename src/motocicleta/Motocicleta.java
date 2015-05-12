package motocicleta;

import veiculos.*;

public class Motocicleta extends Veiculos
{
	//Valores únicos para as motos.
	MCilindrada cilindrada;
	MCapTanque capTanque;
	
	public Motocicleta(String _chassi,float _preco,Cores _cor,MCilindrada _cilindrada,MCapTanque _capTanque,Modelo _modelo,Montadoras _montadora,Tipos _tipo)
	{
		//Dando variáveis alteráveis às motos e formas de acessá-las.
		preco = _preco;
		chassi = _chassi;
		cor = _cor;
		cilindrada = _cilindrada;
		capTanque = _capTanque;
		modelo = _modelo;
		tipo = _tipo;
		montadora = _montadora;		
		
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

	public Modelo getmodelo() {
		return modelo;
	}

	public Montadoras getmontadora() {
		return montadora;
	}

	public Tipos gettipo() {
		return tipo;
	}
	

}
