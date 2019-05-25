import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class main extends JPanel {


    public static void main(String[] args) {
        LinkedList<caja> cajas = new LinkedList<>();

        AtomicInteger t =   new AtomicInteger();
        AtomicInteger r =   new AtomicInteger();
        //panel
        JFrame frame = new JFrame("Graficos Edgar - tercer parcial Graficacion");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField radio = new JTextField("radio");
        JTextField tamaño = new JTextField("tamaño");

        radio.setBounds(20,50,80,20);
        tamaño.setBounds(120,50,80,20);

        frame.add(radio);
        frame.add(tamaño);
        radio.setVisible(true);
        tamaño.setVisible(true);
   // boton de agrgar a la lista

        JButton boton = new JButton("agragar a la lista");
        JButton boton1 = new JButton("obtener maximo de cajas");

        boton.setBounds(250,50,200,20);
        frame.add(boton);
        boton1.setBounds(250,100,200,20);
        frame.add(boton1);


        boton.setVisible(true);
        boton1.setVisible(true);
        frame.getContentPane().add(new main());
        frame.setVisible(true);


        boton.addActionListener(e -> {
            r.set(Integer.parseInt(radio.getText()));
            t.set(Integer.parseInt(tamaño.getText()));

            cajas.addFirst(new caja(r.get(),t.get()));

        });

        boton1.addActionListener(e -> {
            caja[] arraycaja =  new caja[cajas.size()];
            int i =0;
            for ( caja qk: cajas) {
                arraycaja[i] = qk;
                i++;
            }
            // ordenar el array
            Arrays.sort(arraycaja);

            for (caja qk2:arraycaja) {
                System.out.println("radio= "+qk2.radio+" altura ="+ qk2.altura);

            }


        });

    }





}
