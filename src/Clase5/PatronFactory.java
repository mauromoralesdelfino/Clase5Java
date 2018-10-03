package Clase5;

public class PatronFactory {

	/*  
	 * public conexion getConexion(String s)
	 * {
	 * if(s.equals("MySql"))
	 * { 
	 * return new MySql();
	 * }
	 * else
	 * {
	 *  return new Oracle();
	 * }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public ICalculoSueldo getSueldo (TipoCobro e)
	{
		/*if(e.equals(TipoCobro.mensual))
		{
			return new SueldoMensual();
		}
		
		else
		{
			return new SueldoPorHora();
		}*/
		if(e.equals(TipoCobro.mensual))
		{
			return SueldoMensual.getInstance();
		}
		
		else
		{
			return SueldoPorHora.getInstance();
		}
		
		
	}
}
