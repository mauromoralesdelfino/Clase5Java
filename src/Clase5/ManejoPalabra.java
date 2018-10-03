package Clase5;

public class ManejoPalabra {
	//patron Singleton
	static ManejoPalabra object;
	
	private ManejoPalabra()
	{}

	public static ManejoPalabra getInstance() //desde el main obtener instancia
	{
		if(object==null)
		{
		object = new ManejoPalabra();
		}
		
		return object;

	}


}
