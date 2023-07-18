package modelo;

public class Capacitacion {
	private int id;
	private String nombre_capacitacion;
	private String correo_capacitacion;
	private String curso_capacitacion;
	
	public Capacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capacitacion(int id, String nombre_capacitacion, String correo_capacitacion, String curso_capacitacion) {
		super();
		this.id = id;
		this.nombre_capacitacion = nombre_capacitacion;
		this.correo_capacitacion = correo_capacitacion;
		this.curso_capacitacion = curso_capacitacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_capacitacion() {
		return nombre_capacitacion;
	}

	public void setNombre_capacitacion(String nombre_capacitacion) {
		this.nombre_capacitacion = nombre_capacitacion;
	}

	public String getCorreo_capacitacion() {
		return correo_capacitacion;
	}

	public void setCorreo_capacitacion(String correo_capacitacion) {
		this.correo_capacitacion = correo_capacitacion;
	}

	public String getCurso_capacitacion() {
		return curso_capacitacion;
	}

	public void setCurso_capacitacion(String curso_capacitacion) {
		this.curso_capacitacion = curso_capacitacion;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre_capacitacion=" + nombre_capacitacion + ", correo_capacitacion="
				+ correo_capacitacion + ", curso_capacitacion=" + curso_capacitacion + ", getId()=" + getId()
				+ ", getNombre_capacitacion()=" + getNombre_capacitacion() + ", getCorreo_capacitacion()="
				+ getCorreo_capacitacion() + ", getCurso_capacitacion()=" + getCurso_capacitacion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}