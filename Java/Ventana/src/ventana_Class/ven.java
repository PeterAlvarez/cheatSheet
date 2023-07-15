package ventana_Class;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ven extends JFrame {

	private JPanel contentPane;
	JOptionPane modal=new JOptionPane();
	private JTextField campo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ven frame = new ven();
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
	public ven() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox cb1 = new JCheckBox("Inform\u00E1tica");
		cb1.setBounds(82, 87, 95, 21);
		contentPane.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Ing. Civil");
		cb2.setBounds(82, 119, 95, 21);
		contentPane.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("Ing. Industrial");
		cb3.setBounds(82, 148, 95, 21);
		contentPane.add(cb3);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cad="";
				if(cb1.isSelected())
					cad="Informática\n";
				if(cb2.isSelected())
					cad=cad+"Ing. Civil\n";
				if(cb3.isSelected())
					cad=cad+"Ing. Industrial\n";
				modal.showMessageDialog(null, cad);
			}
		});
		
		btnAceptar.setBounds(82, 204, 85, 21);
		contentPane.add(btnAceptar);
		
		JRadioButton rb1 = new JRadioButton("Mujer");
		rb1.setBounds(253, 87, 105, 21);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Hombre");
		rb2.setBounds(253, 119, 105, 21);
		contentPane.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Otro");
		rb3.setBounds(253, 148, 105, 21);
		contentPane.add(rb3);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rb1);
		grupo.add(rb2);
		grupo.add(rb3);
		rb1.setSelected(true);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"uno", "dos", "tres", "cuatro", "cinco"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(371, 87, 55, 101);
		contentPane.add(list);
		
		JTextArea texto = new JTextArea();
		texto.setBounds(59, 10, 118, 71);
		contentPane.add(texto);
		
		JButton btnNewButton = new JButton("seleccionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object lista[]=list.getSelectedValues();
				String cad="";
				for(int i=0; i<lista.length; i++)
					cad=cad+lista[i]+"\n";
				texto.setText(cad);
			}
		});
		btnNewButton.setBounds(210, 12, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("agregar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(210, 43, 85, 21);
		contentPane.add(btnNewButton_1);
		
		campo = new JTextField();
		campo.setBounds(330, 44, 96, 19);
		contentPane.add(campo);
		campo.setColumns(10);
	}
}