package mesa3_Ejer1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textPatron;
	private JTextField textSalida;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(36, 41, 170, 220);
		contentPane.add(textArea);
		
		textPatron = new JTextField();
		textPatron.setBounds(271, 69, 133, 30);
		contentPane.add(textPatron);
		textPatron.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String[] vec = textArea.getText().split(textPatron.getText());
				textSalida.setText(String.valueOf(vec.length-1));
			}
		});
		btnBuscar.setBounds(271, 144, 117, 25);
		contentPane.add(btnBuscar);
		
		textSalida = new JTextField();
		textSalida.setBounds(271, 213, 114, 19);
		contentPane.add(textSalida);
		textSalida.setColumns(10);
	}
}
