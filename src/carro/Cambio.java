package carro;

public enum Cambio {

	AUTOM�TICO(1), SEMI_AUTOM�TICO(2), MANUAL(3);
	
	int ref;
	private Cambio(int _ref)
	{
		ref = _ref;
		
	}
}
