import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class main extends  JPanel{
    static int colunmas, renglones;
    static int corteC= 0;
    static int corteR =0;
    public static void main(String[] args) {
        AtomicInteger c =   new AtomicInteger();
        AtomicInteger r =   new AtomicInteger();
        AtomicInteger veces =   new AtomicInteger();

        //panel

        JFrame frame = new JFrame("Graficos Edgar - cuarto parcial Graficacion");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField columnas = new JTextField("columnas");
        JTextField renglones = new JTextField("renglones");

        columnas.setBounds(20,50,80,20);
        renglones.setBounds(120,50,80,20);

        frame.add(columnas);
        frame.add(renglones);
        columnas.setVisible(true);
        renglones.setVisible(true);

        JButton bt = new JButton("Hacer Corte");
        JButton boton = new JButton("Dibujar chocolate");
        bt.setBounds(250,100,200,20);
        frame.add(bt);
        boton.setBounds(250,50,200,20);
        frame.add(boton);


        bt.setVisible(true);

        boton.setVisible(true);

        frame.getContentPane().add(new main());
        frame.setVisible(true);




        boton.addActionListener(e -> {
            c.set(Integer.parseInt(columnas.getText()));
            r.set(Integer.parseInt(renglones.getText()));
            dibujarBarra(frame.getGraphics(),c.get(),r.get());
            // dibujar barra de chocolate


        });

        bt.addActionListener(e -> {
            veces.set(veces.get()+1);
            dibujarCort(frame.getGraphics(),veces.get());
        });

    }

    public static  int calcularCortes(int c, int r){
        int cortes = (c + r) - 2;
        return cortes;
    }

    public static void  dibujarBarra(Graphics g, int c, int r){
        colunmas = c;
        renglones = r;
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100,200,c*100,r*100);
        g.setColor(Color.GRAY);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // el 10 es un espacio
                g.fillRect(100+(j*100)+10,200+(i*100)+10,70,70);

            }

        }


    }
    public static void dibujarCort(Graphics g,int veces){
        g.setColor(Color.red);

        if(veces < colunmas){
            corteC +=1;
            g.fillRect(100 + (corteC * 100),200,5,renglones*100);

        }else {

            corteR += 1;
            if(corteR < renglones)
            g.fillRect(100 ,200 + (corteR * 100),colunmas*100,5);
             else System.out.println("ya no puedes cortar");

        }

    }
}
