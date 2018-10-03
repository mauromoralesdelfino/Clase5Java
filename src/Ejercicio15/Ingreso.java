package Ejercicio15;

public class Ingreso implements IState{

	@Override
	public void cambiarEstado(Alumno a,Boolean y) {
		
		a.setS(new Regular());
		System.out.println("Paso a Regular");
		
	}

}
