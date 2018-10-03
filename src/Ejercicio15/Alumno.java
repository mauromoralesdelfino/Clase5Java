package Ejercicio15;

import javax.swing.plaf.nimbus.State;

import Clase5.TipoCobro;

public class Alumno {
	private String nombre;
	private String apellido;
	private String legajo;
	private TipoEstado estado;
	private TipoCarrera carrera;
	private IState s;
	
	public Alumno()
	{}

	
	
	public Alumno(String nombre, String apellido, String legajo, TipoEstado estado, TipoCarrera carrera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.estado = estado;
		this.carrera = carrera;
		
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public TipoEstado getEstado() {
		return estado;
	}

	public void setEstado(TipoEstado estado) {
		this.estado = estado;
	}

	public TipoCarrera getCarrera() {
		return carrera;
	}

	public void setCarrera(TipoCarrera carrera) {
		this.carrera = carrera;
	}



	public IState getS() {
		return s;
	}



	public void setS(IState s) {
		this.s = s;
	}
	
}
