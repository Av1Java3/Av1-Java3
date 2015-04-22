package carro;

public enum Tipo 
{

	SEDAN(1), HATCH(2), ESPORTIVO(3), CONVERSIVEL(4), COUPE(5);
	
	int ref;
	private Tipo(int _ref)
	{
		ref = _ref;
		
	}
}
