package motocicleta;

public class Motocicleta
{
	String chassi;
	float preco;
	Cor cor;
	Cilindrada cilindrada;
	CapTanque capTanque;
	Modelo modelo;
	Montadora montadora;
	Tipo tipo;
	
	public Motocicleta(float _preco,String _chassi,Cor _cor,Cilindrada _cilindrada,CapTanque _capTanque,Modelo _modelo,Montadora _montadora,Tipo _tipo)
	{
		preco = _preco;
		chassi = _chassi;
		cor = _cor;
		cilindrada = _cilindrada;
		capTanque = _capTanque;
		modelo = _modelo;
		tipo = _tipo;
		
		
	}

	public float getPreco() {
		return preco;
	}

	public String getChassi() {
		return chassi;
	}

	
	public Cor getCor() {
		return cor;
	}

	public Cilindrada getCilindrada() {
		return cilindrada;
	}

	public CapTanque getCapTanque() {
		return capTanque;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public Montadora getMontadora() {
		return montadora;
	}

	public Tipo getTipo() {
		return tipo;
	}
	

}
