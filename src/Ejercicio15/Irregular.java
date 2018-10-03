package Ejercicio15;

public class Irregular implements IState {

	@Override
	public void cambiarEstado(Alumno a,Boolean y) {
		a.setEstado(TipoEstado.Regular);
		System.out.println("Paso a Regular");
		
		
		
	}

}
