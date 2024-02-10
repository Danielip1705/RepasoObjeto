package get_set;

public class CancionImpl implements Cancion {
	private String nombre;
	private String inter;
	private int duracion;
	private Fecha fechaLanzamineto; 
	private String genero;
	private int numR;
	private double calificacion;
	private boolean reproducir;

	public CancionImpl(String nombre, String inter, int duracion, Fecha fechaL,
			String genero,int numR,double calif,boolean reproducir) {
		this.nombre=nombre;
		this.inter=inter;
		this.fechaLanzamineto=fechaL;
		this.genero=genero;
		this.numR=numR;
		this.calificacion=calif;
		this.reproducir=reproducir;	
	}

	public int getNumR() {
		return numR;
	}

	public void setNumR(int numR) {
		this.numR = numR;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public boolean getReproducir() {
		return reproducir;
	}

	public void setReproducir(boolean reproducir) {
		this.reproducir = reproducir;
	}

	public String getNombre() {
		return nombre;
	}

	public String getInter() {
		return inter;
	}

	public int getDuracion() {
		return duracion;
	}

	public Fecha getFechaLanzamineto() {
		return fechaLanzamineto;
	}

	public String getGenero() {
		return genero;
	}
	
	public String toString() {
		return "["+getNombre()+","+getInter()+"]";
	}
	
	

}
