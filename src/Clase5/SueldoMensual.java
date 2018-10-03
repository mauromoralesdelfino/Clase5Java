package Clase5;

public class SueldoMensual implements ICalculoSueldo {

	@Override
	public Float Calcular(Empleado em) {
		// TODO Auto-generated method stub
		return em.getSueldo();
	}
	
	
static SueldoMensual object;
	
	private SueldoMensual()
	{}

	public static SueldoMensual getInstance() //desde el main obtener instancia
	{
		if(object==null)
		{
		object = new SueldoMensual();
		}
		
		return object;

	}


}
