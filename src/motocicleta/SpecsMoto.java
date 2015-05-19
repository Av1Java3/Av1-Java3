package motocicleta;

import main.Sup;
import veiculos.Cores;
import veiculos.Modelo;
import veiculos.Montadoras;
import veiculos.Specs;
import veiculos.Tipos;

public class SpecsMoto extends Specs
{
	
	 CapTanque mcapTanque;
	 Cilindrada mcilindrada;
	 
public SpecsMoto()
{
	this(Sup.addCor(), Sup.addCilindrada(),Sup.addCaptanque(), Sup.addModelo(),Sup.addMontadora(),Sup.addTipo() );
}
	 
private SpecsMoto(Cores _cor,Cilindrada _cilindrada,CapTanque _capTanque,Modelo _modelo,
			Montadoras _montadora,Tipos _tipo)
{
	cor = _cor;
	modelo = _modelo;
	montadora = _montadora;
	tipo = _tipo;
	mcapTanque = _capTanque;
	mcilindrada = _cilindrada;
}



@Override
public boolean equals(Object obj)
{
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof SpecsMoto)) {
		return false;
	}
	SpecsMoto other = (SpecsMoto) obj;
	if (cor != other.cor) {
		return false;
	}
	if (mcapTanque != other.mcapTanque) {
		return false;
	}
	if (mcilindrada != other.mcilindrada) {
		return false;
	}
	if (modelo != other.modelo) {
		return false;
	}
	if (montadora != other.montadora) {
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
public CapTanque getMcapTanque() 
{
	return mcapTanque;
}
public void setMcapTanque(CapTanque mcapTanque) 
{
	this.mcapTanque = mcapTanque;
}
public Cilindrada getMcilindrada() 
{
	return mcilindrada;
}
public void setMcilindrada(Cilindrada mcilindrada) 
{
	this.mcilindrada = mcilindrada;
}

}
