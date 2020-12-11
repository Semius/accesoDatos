package entidades;

public class Asignatura {

	private int id;
	private String nombre;
	private int horas;
	private int idCiclo;
	
	
	
	
	


	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", idCiclo=" + idCiclo + "]";
	}
	
	
	public Asignatura(int id, String nombre, int horas, int idCiclo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.idCiclo= idCiclo;
	}
	
	public int getIdCiclo() {
		return idCiclo;
	}


	public void setIdCiclo(int idCiclo) {
		this.idCiclo = idCiclo;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
}
