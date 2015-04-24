package motocicleta;

public enum Cor 
{
	PRETA(1),PRATA(2),AMARELA(3),VERDE(4);
	
	int ref;
	
	private Cor(int _ref)
	{
		ref = _ref;
	}

	public int getRef() {
		return ref;
	}
	
}
