package graficoGraf;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import my_ventana.ventana;

public class VistaApp extends JPanel implements MouseListener{
	private Vector<Nodo> VectorNodos;
	private Vector<Enlace> VectorEnlaces;
	private Point p1, p2;
	private JTextField textDistanciaCorto;
	private JTextField textCaminoCorto;

	GrafoPonderado g;
	String nodoA="", nodoB="";

	public VistaApp() {
		this.VectorNodos = new Vector<Nodo>();
		this.VectorEnlaces= new Vector<>();
		this.addMouseListener(this);
		this.g = new GrafoPonderado(15);//creamos grafo
		this.setLayout(null);

		textDistanciaCorto = new JTextField();
		textDistanciaCorto.setBounds(75,200,200,30);
		this.add(textDistanciaCorto);

		JButton btnDistancia = new JButton("Calcular Distancia");
		btnDistancia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nodoInicio = JOptionPane.showInputDialog("Ingrese nodo inicio");
				String nodoFinal = JOptionPane.showInputDialog("Ingrese nodo final");
				textDistanciaCorto.setText(Integer.toString(g.encuentraDistancia(nodoInicio, nodoFinal)));
				textCaminoCorto.setText(g.encuentraCamino(nodoInicio, nodoFinal));
				g.mostrarMatrizRecorrido();
			}
		});

		btnDistancia.setBounds(72,300 , 200,30 );
		this.add(btnDistancia);

		textCaminoCorto = new JTextField();
		textCaminoCorto.setBounds(75,400,200,30);
		this.add(textCaminoCorto);

		JButton btnCompilar = new JButton("Compilar");
		btnCompilar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				g.matrizDeRecorridoOP();
				g.matrizDistanciaOP();
				g.mostrarMatrizRecorrido();
				g.mostrarMatrizDistancia();
				textDistanciaCorto.setText("");
				textCaminoCorto.setText("");
			}
		});
		btnCompilar.setBounds(72,500 , 200,30 );
		this.add(btnCompilar);
	}

	public void paint( Graphics g ) {
		for(Nodo nodos : VectorNodos ) {
			nodos.pintar(g);
		}

		for( Enlace enlaces : VectorEnlaces) {
			enlaces.pinta(g);
		}

	}



	@Override
	public void mouseClicked(MouseEvent e) {
		int arco=0;
		if( e.getButton() == MouseEvent.BUTTON1 ) {
			String nombre=JOptionPane.showInputDialog("Ingrese nombre del Nodo");
			this.VectorNodos.add(new Nodo(e.getX(), e.getY(), nombre));
			g.insertarNodo(nombre);
			repaint();
		}
		if(e.getButton()==MouseEvent.BUTTON3) {
			for( Nodo nodo : VectorNodos ) {
				if(new Rectangle(nodo.getX()-Nodo.d/2, nodo.getY()-Nodo.d/2, Nodo.d,Nodo.d).contains(e.getPoint())) {
					if( p1 == null ) {
						p1 = new Point(nodo.getX(),nodo.getY());
						nodoA=nodo.nombre;
						//						System.out.println(nodoA);
					} else {
						p2 = new Point(nodo.getX(), nodo.getY() );
						String valor = JOptionPane.showInputDialog("Ingrese Valor del arco");
						this.VectorEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y,valor));
						nodoB = nodo.nombre;
						arco = Integer.parseInt(valor);
						//						System.out.println(nodoB);
						repaint();
						p1 = null;
						p2 = null;
					}
				}
			}
		}

		if(nodoA!=""&&nodoB!="") {
			//			System.out.println(nodoA+"dsadas "+nodoB);
			//			System.out.println(g.insertarArco(nodoA, nodoB,arco ));
			System.out.println(g.toString());
			g.insertarArco(nodoA, nodoB, arco);
			nodoA="";
			nodoB="";
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

}
