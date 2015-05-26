package veiculos;

import motocicleta.CapTanque;
import motocicleta.Cilindrada;
import carro.Cambio;
import carro.Motorizacao;

public class Specs 
{
	
	 protected Cores cor;
	 protected Modelo modelo;
	 protected Montadoras montadora;
	 protected Tipos tipo;
	 protected CapTanque captanque;
	 protected Cilindrada cilindrada;
	 protected Motorizacao motorizacao;
	 protected Cambio cambio;

	 
	public CapTanque getCaptanque() {
		return captanque;
	}
	public void setCaptanque(CapTanque captanque) {
		this.captanque = captanque;
	}
	public Cilindrada getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Cilindrada cilindrada) {
		this.cilindrada = cilindrada;
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
	public Cores getCor() {
		return cor;
	}
	public void setCor(Cores cor) {
		this.cor = cor;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public Montadoras getMontadora() {
		return montadora;
	}
	public void setMontadora(Montadoras montadora) {
		this.montadora = montadora;
	}
	public Tipos getTipo() {
		return tipo;
	}
	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Specs))
			return false;
		Specs other = (Specs) obj;
		if (cor != other.cor)
			return false;
		if (modelo != other.modelo)
			return false;
		if (montadora != other.montadora)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	 
	 
	 

}
