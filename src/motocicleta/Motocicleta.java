package motocicleta;

import veiculos.*;

public class Motocicleta extends Veiculos
{
	//Valores �nicos para as motos.
	Cilindrada cilindrada;
	CapTanque capTanque;
	SpecsMoto specs;
	
	public Motocicleta(String _chassi,float _preco,SpecsMoto _specs)
	{
		//Dando vari�veis alter�veis �s motos e formas de acess�-las.
		preco = _preco;
		chassi = _chassi;
		specs = _specs;
	}

	public Cilindrada getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Cilindrada cilindrada) {
		this.cilindrada = cilindrada;
	}

	public CapTanque getCapTanque() {
		return capTanque;
	}

	public void setCapTanque(CapTanque capTanque) {
		this.capTanque = capTanque;
	}

	public SpecsMoto getSpecs() {
		return specs;
	}

	public void setSpecs(SpecsMoto specs) {
		this.specs = specs;
	}
	
	
}