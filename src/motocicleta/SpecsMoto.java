package motocicleta;

import veiculos.Cores;
import veiculos.Modelo;
import veiculos.Montadoras;
import veiculos.Tipos;

public class SpecsMoto 
{
	 Cores cor;
	 Modelo modelo;
	 Montadoras montadora;
	 Tipos tipo;
	 MCapTanque mcapTanque;
	 MCilindrada mcilindrada;
private SpecsMoto()
	{}



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
public MCapTanque getMcapTanque() 
{
	return mcapTanque;
}
public void setMcapTanque(MCapTanque mcapTanque) 
{
	this.mcapTanque = mcapTanque;
}
public MCilindrada getMcilindrada() 
{
	return mcilindrada;
}
public void setMcilindrada(MCilindrada mcilindrada) 
{
	this.mcilindrada = mcilindrada;
}

}
