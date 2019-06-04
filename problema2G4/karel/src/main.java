import javax.swing.*;
import java.awt.*;

public class main extends JPanel {

static  int pasteles = 0 ;
static  int personas = 0;

// la posicion son los pasteles
static int[] personasA = {0,0,0,0,0};

    public static void main(String[] args) {

        JFrame frame = new JFrame("Graficos Edgar HISTOGRAMA 4TO PARCIAL");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField persona = new JTextField("personas");
        JTextField pastel = new JTextField("pasteles");

        persona.setBounds(20,50,80,20);
        pastel.setBounds(120,50,80,20);

        frame.add(persona);
        frame.add(pastel);
        persona.setVisible(true);
        pastel.setVisible(true);

        JButton bt = new JButton("añadir favoritos");
        JButton boton = new JButton("Dibujar histograma");
        bt.setBounds(250,100,200,20);
        frame.add(bt);
        boton.setBounds(250,50,200,20);
        frame.add(boton);
        bt.setVisible(true);
        boton.setVisible(true);
        frame.getContentPane().add(new main());
        frame.setVisible(true);

        bt.addActionListener(e -> {

            Calcular(Integer.parseInt(pastel.getText()),Integer.parseInt(persona.getText()));

        });

        boton.addActionListener(e -> {
            dibujarMundo(frame.getGraphics(),5,5);
            Histograma(frame.getGraphics());
        });

    }

    public static void  dibujarMundo(Graphics g, int c, int r){

        g.setColor(Color.DARK_GRAY);
        g.fillRect(100,200,c*100,r*100);
        g.setColor(Color.GRAY);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                g.fillRect(130+(j*100)+10,225+(i*100)+10,15,15);

            }

        }

        for (int i = 0; i < r; i++) {

        }


    }

    public static  void Calcular(int pastel, int persona){
        personasA[pastel] = personasA[pastel] + persona;
    }

    public static  void Histograma(Graphics g){
        // la i es el pastel
        g.setColor(Color.red);
        int x , y;
        for (int i = 0; i < 5 ; i++) {
          y = 600 - (personasA[i] * 100);
          x = 310 + (i * 100);

          g.fillRect(x ,y,10,personasA[i]*100);

        }
    }

}
