import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class main {
    int colunmas, renglones;

    public static void main(String[] args) {
        AtomicInteger c =   new AtomicInteger();
        AtomicInteger r =   new AtomicInteger();
        //panel

        JFrame frame = new JFrame("Graficos Edgar - cuarto parcial Graficacion");
        frame.setSize(800, 800);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField columnas = new JTextField("columnas");
        JTextField renglones = new JTextField("renglones");
        JLabel label = new JLabel("");
        label.setBounds(100,100, 80,30 );
        columnas.setBounds(20,50,80,20);
        renglones.setBounds(120,50,80,20);
        frame.add(label);
        frame.add(columnas);
        frame.add(renglones);
        columnas.setVisible(true);
        renglones.setVisible(true);
        label.setVisible(true);

        // boton de agrgar a la lista

        JButton boton = new JButton("agragar a la lista");
        JButton boton1 = new JButton("obtener maximo de cajas");

        boton.setBounds(250,50,200,20);
        frame.add(boton);
        boton1.setBounds(250,100,200,20);
        frame.add(boton1);


        boton.setVisible(true);
        boton1.setVisible(false);
   //     frame.getContentPane().add(new main());
        frame.setVisible(true);


        boton.addActionListener(e -> {
            c.set(Integer.parseInt(columnas.getText()));
            r.set(Integer.parseInt(renglones.getText()));

            int costo =  calcular(c.get(), r.get());
            label.setText(""+costo);

        });


    }
    public static  int calcular(int c, int r){
        int costo = (c + r) - 2;
        return costo;
    }
}
