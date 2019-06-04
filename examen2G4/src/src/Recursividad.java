import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Método recursivo que dado un número entero en base decimal
 * muestre su equivalente en binario
 */
public class Recursividad extends  JPanel{
    static Graphics g;

static int n;
static int x =0;
    static int x1 =0;
    public static void main(String[] args) {
        AtomicInteger n = new AtomicInteger();
        JFrame frame = new JFrame("Graficos Edgar - tercer parcial Graficacion");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g = frame.getGraphics();
        JTextField ntf = new JTextField("numero decimal");
        ntf.setBounds(20,10,80,20);
        frame.add(ntf);
        ntf.setVisible(true);
        JButton boton = new JButton("generar numero binario");
        boton.setBounds(150,10,200,20);
        frame.add(boton);
        boton.setVisible(true);
        frame.getContentPane().add(new Recursividad());
        frame.setVisible(true);


        boton.addActionListener(e -> {
            do {
                n.set(Integer.parseInt(ntf.getText()));

            }while (n.get() < 0);
            decABin(n.get());
         });


    }



    public static void decABin(int n) {
        if (n < 2) {
            System.out.print(n);
            pintarDiviciones(g,n/2,n % 2);
            pintarBinario(g, n % 2);
            return;
        } else {

            System.out.println(n / 2+" -> "+ n % 2);
            pintarDiviciones(g,n/2,n % 2);
            decABin(n / 2);

            System.out.print(n % 2);
            pintarBinario(g, n % 2);
            return;
        }
    }

    public static void pintarDiviciones(Graphics g,int di,int re){
       x += 1;

       g.drawString(""+di,100,x * 100);
       g.drawString("->",120,x * 100);
       g.drawString(""+re,150,x * 100);


    }
    public static void pintarBinario(Graphics g,int re){
        x1 += 1;

        g.drawString(""+re,300 + (x1 * 10),450);



    }


}