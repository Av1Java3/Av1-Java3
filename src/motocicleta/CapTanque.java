package motocicleta;

public enum CapTanque 
{
	L12_5(1),L17(2),L17_8(3);
	int ref;
private CapTanque(int _ref)
	{
		ref = _ref;
	}

public int getRef() {
	return ref;
}


}