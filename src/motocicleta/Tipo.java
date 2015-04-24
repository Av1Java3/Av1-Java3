package motocicleta;

public enum Tipo 
{
	CRUISER(1),SPORT(2),OFFROAD(3);
	
	int ref;
private Tipo(int _ref)
{
	ref = _ref;
}
public int getRef() 
{
	return ref;
}



}
