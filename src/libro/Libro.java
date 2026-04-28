package libro;

public class Libro {

	public String titulo;
	public String autor;
	public int numeroPaginas;
	
	public Libro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}
	public static void main(String[]Args) {
		Libro miLibroFavorito = new Libro("Cien años de soledad", "Gabriel", 34);
		
		System.out.println(miLibroFavorito);
	}

}
