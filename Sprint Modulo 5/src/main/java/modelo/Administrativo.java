package modelo;

public class Administrativo extends Usuario{
    private String Area;

	public Administrativo(int id, String nombre, String tipo, String area) {
		super(id, nombre, tipo);
		Area = area;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	
}
