package appGrafo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VistaApp extends JFrame {

	private JPanel contentPane;
	private JTextField textBinario;
	private JTextField textExadecimal;
	String bin="";
	String exa="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaApp frame = new VistaApp();
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
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnBin1 = new JButton("1");
		btnBin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bin+=1;
				textBinario.setText(bin);
			}
		});
		btnBin1.setBounds(29, 163, 84, 25);
		contentPane.add(btnBin1);

		JButton btnBin0 = new JButton("0");
		btnBin0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bin+=0;
				textBinario.setText(bin);
			}
		});
		btnBin0.setBounds(137, 163, 79, 25);
		contentPane.add(btnBin0);

		textBinario = new JTextField();
		textBinario.setBounds(51, 96, 147, 25);
		contentPane.add(textBinario);
		textBinario.setColumns(10);

		JButton btnConvertir = new JButton("Convertir\n");
		btnConvertir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exa = Integer.toHexString(Integer.parseInt(textBinario.getText(), 2));//de bin a exadecimal
				textExadecimal.setText(exa);
			}
		});
		btnConvertir.setBounds(81, 219, 117, 25);
		contentPane.add(btnConvertir);


		textExadecimal = new JTextField();
		textExadecimal.setBounds(290, 99, 129, 34);
		contentPane.add(textExadecimal);
		textExadecimal.setColumns(10);

		JButton btnBorrar = new JButton("borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bin="";
				textExadecimal.setText("");
				textBinario.setText("");
			}
		});
		btnBorrar.setBounds(267, 188, 117, 25);
		contentPane.add(btnBorrar);
	}
}

