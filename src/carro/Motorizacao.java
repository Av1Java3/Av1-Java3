package carro;

public enum Motorizacao 
{

	M10(1), M12(2), M14(3), M16(4), M18(5), M20(6), M22(7);
	
	int ref;
	private Motorizacao(int _ref)
	{
		ref = _ref;
		
	}
}
