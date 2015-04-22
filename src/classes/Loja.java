package classes;

import java.util.ArrayList;

import motocicleta.Motocicleta;
import carro.Cambio;
import carro.Carro;
import carro.Cor;
import carro.Modelo;
import carro.Montadora;
import carro.Motorizacao;
import carro.Tipo;

public class Loja
{

	String nome = "Doomhammer Motors";
	String endereco = "Rua dos bobos n 0";
	
	ArrayList<Carro> estoqueCarros = new ArrayList<>();
	ArrayList<Motocicleta> estoqueMotos = new ArrayList<>();
	
	
	public void adicionarCarro()
	{
		Cambio _cambio = null;
		Cor _cor = null;
		Modelo _modelo = null;
		Montadora _montadora = null;
		Tipo _tipo = null;
		Motorizacao _motorizacao = null; 
		String _chassi = "";
		float _preco = 0;
	
		Carro aux = new Carro(_chassi, _preco, _montadora, _modelo, _motorizacao, _cambio, _tipo, _cor);
		estoqueCarros.add(aux);
	}
	
		
}
