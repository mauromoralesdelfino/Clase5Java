package Ejercicio15;

public class Principal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Alumno a1 = new Alumno("nombre","apellido","legajo",TipoEstado.Ingreso,TipoCarrera.TSI);
		Alumno a12 = new Alumno("nombre","apellido","legajo",TipoEstado.Ingreso,TipoCarrera.TSI);
		
		a1.getS().cambiarEstado(a1);
		a12.getS().cambiarEstado(a12);
		
		
	}

}
