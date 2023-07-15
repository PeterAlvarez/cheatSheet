package my_ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{

	JPanel panel  = new JPanel();

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
	}

	public Ventana() {
		setSize(500, 500);

		setTitle("Hola mundo Ventana");
		//setLocation(100, 200);//locacion de la ventana
		setLocationRelativeTo(null);//ventana al centro
//		this.getContentPane().setBackground(Color.ORANGE);

		iniciarComponentes();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().add(panel);
	}


	private void iniciarComponentes () {
//		ColocarBotones();
//		colocarRadioBotones();
//		iniciarEtiqueta();
//		colocarCajasDeTexto();
//		colocarAreasDeTexto();
		colocarListaDesplegable();
	}

	private void colocarListaDesplegable(){
		String [] paises = {"Bolivia","Argentina","Peru"};
		JComboBox listaDespegable = new JComboBox(paises);
		listaDespegable.setBounds(20,20,100,30);
		listaDespegable.addItem("Marte");
		panel.add(listaDespegable);
	}

	private void colocarAreasDeTexto() {
		JTextArea areaTexto=new JTextArea();
		areaTexto.setBounds(20,20,300,200);
		panel.add(areaTexto);
	}



	private void colocarCajasDeTexto() {

		JTextField cajaDeText = new JTextField();
		cajaDeText.setBounds(120,120,100,80);
		cajaDeText.setText("HOLA MUNDO");
		panel.add(cajaDeText);
	}

	private void colocarRadioBotones() {
		JRadioButton radioBoton1=new JRadioButton("Opncion 1", true);
		radioBoton1.setBounds(50,100,100,50);
		panel.add(radioBoton1);

		JRadioButton radioBoton2=new JRadioButton("Opncion 2", true);
		radioBoton2.setBounds(50,100,100,50);
		panel.add(radioBoton2);

		JRadioButton radioBoton3=new JRadioButton("Opncion 3", true);
		radioBoton3.setBounds(50,100,100,50);
		panel.add(radioBoton3);

		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(radioBoton1);
		grupoRadioBotones.add(radioBoton2);
		grupoRadioBotones.add(radioBoton3);


	}


 	private void iniciarEtiqueta () {
		JLabel etiqueta = new JLabel();/*"Hola mundo",SwingConstants.CENTER*///parametros
		//etiqueta.setOpaque(true);//desabilitando Layout por defecto2
		etiqueta.setText("Mundial 2018");
		etiqueta.setBounds(85,10,300,80);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//centrar Horizontalmente el text
		etiqueta.setForeground(Color.BLACK);//cambia color del contenido etiqueta
		etiqueta.setFont(new Font("arial", Font.ITALIC ,40));//fuente y tamaño del text
		//etiqueta.setBackground(Color.BLACK);//cambia color de fondo de etiqueta
		panel.add(etiqueta);

		//import image
//		ImageIcon imagen = new ImageIcon("NombreDeImage.jpg");
//		JLabel etiqueta2=new JLabel(imagen);
	}

	private void ColocarBotones() {
		JButton boton1 = new JButton();
		boton1.setOpaque(true);
		boton1.setText("Aceptar");
//		boton1.setBounds(100,100,100,40);
		boton1.setEnabled(true);
		panel.add(boton1);
	}


}

