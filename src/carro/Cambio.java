package carro;

public enum Cambio {

	AUTOMÁTICO(1), SEMI_AUTOMÁTICO(2), MANUAL(3);
	
	int ref;
	private Cambio(int _ref)
	{
		ref = _ref;
		
	}
}
