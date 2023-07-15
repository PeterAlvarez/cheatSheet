package mesa3_Ejer1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
     * 
     * @throws FileNotFoundException
     */
    public Ventana() throws FileNotFoundException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // creamos el campo Area
        JTextArea textArea = new JTextArea();
        FileReader fr = new FileReader("Texto.txt");// llamamos al archivo Texto.txt donde se encuentran nuestros datos
        BufferedReader br = new BufferedReader(fr);
        String cadena, datos = ""; // creamos variable String para almacenar los datos que obtendremos del archivo
        // Texto.txt

        try { // usaremos un try Exception por comodidad
            while ((cadena = br.readLine()) != null) {// para sersioraste que leera asta la ultima linea del archivo
                // Texto.txt
                datos += br.readLine() + "\n"; // concatenamos el contenido del archivo Texto.txt a datos para despues
                // poder agregarlo al campo textArea
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        textArea.setBounds(36, 41, 170, 220); // area y posicion del campo textArea
        textArea.setText(datos); // llenamos el campo con la funcion setText(datos obtenidos del archivo
        // Texto.txt)
        contentPane.add(textArea); // agregamos textArea con los datos a nuestra ventana

        // creamos el campo patron para hacer (parametro que usaremos para determinar
        // ocurrencias dentro textArea)
        textPatron = new JTextField();
        textPatron.setBounds(271, 69, 133, 30); // area y posicion del campo textPatron
        contentPane.add(textPatron); // agregamos el campo textPatron a la ventana
        textPatron.setColumns(10);

        // Creamos el boton Buscar para poder ejecutar el evento que nos permitira
        // mostras las ocurrencias
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) { // creamos el evento

                String datosdelArchivo = textArea.getText();// obtenemos los datos sacados del textArea
                String[] ocurrencias = datosdelArchivo.split(textPatron.getText());// usamos split para poder verificar
                // las coinsidencias sacaremos el
                // dato
                // que usaremos para cortar el String
                // de textPatron

                textSalida.setText(String.valueOf(ocurrencias.length - 1));// split devolvera un vector y el tamaño del
                // vector sera la cantidad
                // de coincidencias que encontramos y lo
                // mostraremos atraves del campo
                // textSalida
            }
        });
        btnBuscar.setBounds(271, 144, 117, 25);
        contentPane.add(btnBuscar);

        // creamos el campo salida donde mostraremos los resultados del ejercicios
        textSalida = new JTextField();
        textSalida.setBounds(271, 213, 114, 19);
        contentPane.add(textSalida);
        textSalida.setEditable(false);// desactivamos setEditable para que el campo no sea editado en la ventana
        textSalida.setColumns(10);
    }
}
