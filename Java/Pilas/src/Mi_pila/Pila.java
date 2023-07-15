package Mi_pila;

public class Pila {

	private int max;
	private int cima;
	private int pila[];

	public Pila(int max) {
		this.max = max;
		this.cima = 0;
		this.pila = new int[this.max];
	}

	public void vaciarPila() {
		this.cima = 0;
	}

	public int getCima() {
		return this.cima;
	}

	public int getMax() {
		return this.max;
	}

	public boolean siPilaVacia() {
		if (this.cima == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean siPilaLlena() {
		if (this.max == this.cima)
			return true;
		else
			return false;
	}

	public void insertaDato(int dat) {
		if (!(siPilaLlena())) {
			this.pila[this.cima] = dat;
			this.cima++;
		} else {
			System.out.println("pila llena");
		}
	}

	public void mostrarPila() {
		if (!(siPilaVacia())) {
			for (int i = 0; i < this.cima; i++) {
				System.out.println(this.pila[i]);
			}
		} else {
			System.out.println("Pila esta vacia");
		}
	}

	public void eliminaDato() {
		if (!(siPilaVacia())) {
			this.cima--;
		} else {
			System.out.println("no hay elementos a eliminar");
		}
	}

}
