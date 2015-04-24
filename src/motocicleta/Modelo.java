package motocicleta;

public enum Modelo 
{
	VMAX(1),SUPER_TENERE(2),SUPER_TENERE_DX(3),CB_1000R(4),CBR_1000RR_FIREBLADE(5),
	SHADOW_750(6),IRON_883(7),CUSTOM_1200(8),STREET_BOB(9),VULCAN_900_CLASSIC(10),
	VULCAN_900_CUSTOM(11),VULCAN_900_CLASSIC_LT(12);
	
	int ref;
	
	private Modelo(int _ref)
	{
		ref = _ref;
	}

	public int getRef() {
		return ref;
	}

}
