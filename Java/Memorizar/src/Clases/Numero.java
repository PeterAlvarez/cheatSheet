package Clases;

public class Numero {
	private Numero num;
	private int dat;

	public Numero() {
		this.num = null;
		this.dat = 0;
	}

	public Numero getNum() {
		return this.num;
	}

	public void setNum(Numero num) {
		this.num = num;
	}

	public void insertar(int x) {
	
		this.num.insertar(x);
		System.out.println(this.num);
	}

}
