package Clase5;

public class Empleado {
	/*nombre, apellido, cuil, estado, sueldo,
	cantidadHorasTrabajadas y tipoCobro*/
	
	private String nombre;
	private String apellido;
	private String cuil;
	private String estado;
	private Float sueldo;
	private Float cantidadHorasTrabajadas;
	private TipoCobro tipo;
	
	public Empleado()
	{}
	
	public Empleado(String nom, String ape,String kuil, String est, Float su,Float cant, TipoCobro t)
	{
		this.nombre=nom;
		this.apellido=ape;
		this.cuil=kuil;
		this.estado = est;
		this.sueldo =su;
		this.cantidadHorasTrabajadas = cant;
		this.tipo = t;
		
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

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}

	public Float getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}

	public void setCantidadHorasTrabajadas(Float cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}

	public TipoCobro getTipo() {
		return tipo;
	}

	public void setTipo(TipoCobro tipo) {
		this.tipo = tipo;
	}
	
	

}
