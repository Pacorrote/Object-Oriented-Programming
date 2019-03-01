package programming_exercises_c3.pinturas;

public class Painting {
	private String titulo;
	private String artista;
	private String medio;
	private Integer precio;
	public static final float COMISIONGALERIA = (float) 0.2;
	public Painting(String titulo, String artista, String medio, Integer precio) {
		// TODO Auto-generated constructor stub
		this.titulo=titulo;
		this.artista=artista;
		this.medio=medio;
		this.precio=precio;
	}

}
