import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class main extends JPanel {
     static   int tamaño = 100;
    static int radio  = 100;
    static  int x = 0;
    static  int y = 0;
    static  int a = 0;
    static  int r = 0;
    static Random rnd = new Random();
    static  Graphics g;
    static Color[] colors = {Color.blue,Color.yellow,Color.MAGENTA,Color.CYAN,Color.orange,Color.black,Color.gray,Color.RED};
    public static void main(String[] args) {
        ArrayList<caja> cajas = new ArrayList<>();
        AtomicInteger t =   new AtomicInteger();
        AtomicInteger r =   new AtomicInteger();
        //panel
        JFrame frame = new JFrame("Graficos Edgar - tercer parcial Graficacion");
        frame.setSize(2000, 2000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField radio = new JTextField("radio");
        JTextField tamaño = new JTextField("tamaño");
        g = frame.getGraphics();
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

            cajas.add(new caja(r.get(),t.get()));

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
                    calcular(qk2);
            //    System.out.println("radio= "+qk2.radio+" altura ="+ qk2.altura);

            }

        });



    }

    public static void calcular(caja caja){
        // index
            if (caja.radio < radio && caja.altura < tamaño
                 && caja.radio > 0 && caja.altura > 0)
                //aqui se va a pintar la caja
                System.out.println(caja.radio+" altura  "+caja.altura);
              radio = caja.radio;
              tamaño = caja.altura;
              pintar(g,radio,tamaño);
        }

  public static void  pintar(Graphics g,int radio, int altura){
        x = x + (( Math.abs((r - radio * 100)/2) ));
      r = radio * 100;
      y =y + (( Math.abs((a - altura * 100)/2) ));
      r = altura * 100;

      if (x ==  Math.abs(( radio * 100)/2) && y == Math.abs(( altura * 100)/2)){
         x = 100;
         y = 100;
      }


        g.setColor(colors[(int) (rnd.nextDouble() * 7 + 1)]);
        g.fillOval( x,  10 + y  ,radio * 100,(altura * 100)/4);
        g.fillRect( x  ,10 + (altura * 100)/8 +y ,radio * 100,altura*100);
        g.fillOval( x,  10 + (altura  * 100)  +y ,radio * 100,(altura * 100)/4);


    }

}



