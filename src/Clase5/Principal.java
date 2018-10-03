package Clase5;

import java.awt.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * uso metodo estatico manejopalabra para acceder a la instancia
		 * */
		
		/*
		 * Fabrica f = new Fabrica();
		 * 
		 * Conexion c = f.getConexion("MySql");
		 * c.abrirConexion
		 * 
		 * 
		 * 
		 * */
		//List<String> ejemploLista = new ArrayList<String>();
		
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		PatronFactory f = new PatronFactory();
		//public Empleado(String nom, String ape,String kuil, String est, Float su,Float cant, TipoCobro t)
		Empleado UnEm = new Empleado("nombre","apellido","cuil","estado",120f , 0f, TipoCobro.mensual);
		Empleado DosEm = new Empleado("nombre","apellido","cuil","estado",150f , 10f, TipoCobro.porHora);
		
		lista.add(UnEm);
		lista.add(DosEm);
		
		for(Empleado e: lista)
		{
			ICalculoSueldo c = f.getSueldo(e.getTipo());
			System.out.println(c.Calcular(e));
		}
		
	}
	
	/*Crear una clase llamada empleado, que tenga nombre, apellido, cuil, estado, sueldo,
cantidadHorasTrabajadas y tipoCobro.
Los tipos de cobro tiene que estar dados por un Enum: mensual o porHora.
Crear una interface llamada ICalculoSueldo, la cual debe poseer un método que se llame
calcular que retornara el monto que debe cobrar el empleado.
Cree dos implementaciones de la interfaz ICalculoSueldo: SueldoMensual y
SueldoPorHora, en la primera debe retornar el atributo sueldo y en la segunda debe
retornar el atributo sueldo por cantidad de horas.
Genere en un test una lista de 5 empleados y liquídele el sueldo. Utilice el patrón Factory
para identificar que implementación utilizar para cada empleado.*/

}
