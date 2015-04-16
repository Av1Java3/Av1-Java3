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
	
}
