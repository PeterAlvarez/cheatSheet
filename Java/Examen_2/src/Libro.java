
public class Libro {

	private String titulo;
	private String autor;
	private int nro_paginas;
	
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNro_paginas() {
		return nro_paginas;
	}

	public Libro(){
		this.titulo = null;
		this.autor= null;
		this.nro_paginas = 0;
	}
	
	public Libro(String title){
		this.titulo =title;
	}
	
	public Libro(String title , String autor, int pag){
		this.titulo=title;
		this.autor=autor;
		this.nro_paginas=pag;
	}

	@Override
	public String toString() {
		return "Libro [titulo = " + titulo + ", autor = " + autor + ", nro_paginas = " + nro_paginas + "]";
	}
}
