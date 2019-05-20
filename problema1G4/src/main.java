import javax.swing.*;

public class main extends JPanel {
    public static void main(String[] args) {
        //panel
        JFrame frame = new JFrame("Graficos Edgar - tercer parcial Graficacion");
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField radio = new JTextField("radio");
        JTextField tamaño = new JTextField("tamaño");

        radio.setBounds(0,30,50,20);
        radio.setBounds(70,30,50,20);
        frame.add(radio);
        frame.add(tamaño);
        radio.setVisible(true);
        tamaño.setVisible(true);
   // boton de agrgar a la lista

        JButton boton = new JButton("agragar a la lista");

        boton.setBounds(140,30,80,20);

        frame.add(boton);
        boton.setVisible(true);
        frame.getContentPane().add(new main());


    }




}
