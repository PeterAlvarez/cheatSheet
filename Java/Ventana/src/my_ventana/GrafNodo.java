package my_ventana;

import java.awt.Graphics;

public class GrafNodo {

	private int x, y;
	public static final int d=60;
	
	public GrafNodo( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public void pintar(Graphics g) {
		g.drawOval(this.x - d/2 , this.y - d/2 , d, d);
	}
}
