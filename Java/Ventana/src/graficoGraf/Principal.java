
//package graficoGraf;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("GRAFO");
        VistaApp newVentana = new VistaApp();
        ventana.add( newVentana );
        ventana.setSize(700,700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        //JButton btnBin1 = new JButton("1");
        //btnBin1.setBounds(29, 163, 84, 25);
        //ventana.add(btnBin1);
    }
}
