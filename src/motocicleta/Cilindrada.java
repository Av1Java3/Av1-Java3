package motocicleta;

public enum Cilindrada 
{
	C1000(1),C900(2),C850(3),C883(4),C750(5);
	
	int ref;
	
	private Cilindrada( int _ref)
	{
		ref  = _ref;
	}

	public int getRef() {
		return ref;
	}
	

}
