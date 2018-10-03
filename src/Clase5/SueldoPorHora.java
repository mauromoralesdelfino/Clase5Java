package Clase5;

public class SueldoPorHora implements ICalculoSueldo {

	@Override
	public Float Calcular(Empleado em) {
		
		Float sueldo = em.getSueldo();
		Float horas = em.getCantidadHorasTrabajadas();
		Float Total = sueldo*horas;
		return Total;
	}

	
static SueldoPorHora object;
	
	private SueldoPorHora()
	{}

	public static SueldoPorHora getInstance() //desde el main obtener instancia
	{
		if(object==null)
		{
		object = new SueldoPorHora();
		}
		
		return object;

	}
	
	
}
