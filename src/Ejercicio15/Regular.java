package Ejercicio15;

public class Regular implements IState {

	@Override
	public void cambiarEstado(Alumno a,Boolean y) {
		a.setEstado(TipoEstado.irregular);
		System.out.println("Paso a Irregular");
		
		
		a.setEstado(TipoEstado.Recibido);
		System.out.println("Paso a Recibido");
	}

}
