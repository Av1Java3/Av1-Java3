package motocicleta;

public enum Montadora
{
	YAMAHA(1),HONDA(2),HARLEY_DAVIDSON(3),KAWASAKI(4);
	
	int ref;
	
	private Montadora(int _ref)
	{
		ref = _ref;
	}

	public int getRef() {
		return ref;
	}

}
