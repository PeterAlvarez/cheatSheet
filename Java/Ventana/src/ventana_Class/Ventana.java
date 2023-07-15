package ventana_Class;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField edad;
	JTextArea texto;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton copiar = new JButton("Copiar");
		copiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cad[]=texto.getText().split(" ");
				if(cad.length==1)
					cad=texto.getText().split("\n");
				nombre.setText(cad[0]);
				edad.setText(cad[1]);
				textField.setText(cad[2]);
			}
		});
		copiar.setBounds(284, 195, 85, 21);
		contentPane.add(copiar);
		
		JButton colorFondo = new JButton("Cambiar Fondo");
		colorFondo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(new Color(200, 200, 200));
			}
		});
		colorFondo.setBounds(100, 195, 114, 21);
		contentPane.add(colorFondo);
		
		JLabel titulo = new JLabel("Ventana de prueba");
		titulo.setBackground(Color.PINK);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titulo.setBounds(220, 10, 137, 36);
		contentPane.add(titulo);
		titulo.setOpaque(true);
		
		nombre = new JTextField();
		nombre.setBounds(105, 68, 96, 19);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(49, 71, 46, 13);
		contentPane.add(lblNombre);
		
		edad = new JTextField();
		edad.setBounds(105, 107, 96, 19);
		contentPane.add(edad);
		edad.setColumns(10);
		
		JLabel apellido = new JLabel("Apellido");
		apellido.setBounds(49, 110, 46, 13);
		contentPane.add(apellido);
		
		texto = new JTextArea();
		texto.setBounds(284, 65, 108, 100);
		contentPane.add(texto);
		
		textField = new JTextField();
		textField.setBounds(105, 146, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(49, 149, 46, 13);
		contentPane.add(lblEdad);
		
	}
}