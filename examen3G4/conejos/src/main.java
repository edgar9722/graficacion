import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class main {
    static   int a = 0;
    static  int b = 1;

    static int c = 1;
    static int d = 0;

    static int p = 0;
    static  int p1 = 0 ;
    static Graphics g;
    static int suma;
    public static void main(String[] args) {
        AtomicInteger m =   new AtomicInteger();

        //panel
        JFrame frame = new JFrame("Graficos Edgar - cuarto parcial Graficacion");
        frame.setSize(1600, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField meses = new JTextField("meses");
        meses.setBounds(20,50,80,20);
        frame.add(meses);

        meses.setVisible(true);
        // boton de agrgar a la lista

        JButton obtenerCAdultos = new JButton("obtener adultos");
        obtenerCAdultos.setBounds(250,100,100,50);
        frame.add(obtenerCAdultos);
        obtenerCAdultos.setVisible(true);

        JLabel label = new JLabel();
        label.setBounds(250,100,40,10);
        frame.add(label);
        label.setVisible(true);
        g = frame.getGraphics();
        obtenerCAdultos.addActionListener(e -> {
            calcular(Integer.parseInt(meses.getText()));

        });

    }

    public static  void calcular(int meses){

        System.out.println("adultos = "+a+"bebes = "+c);
        System.out.println("adultos = "+b+"bebes = "+d);

        for (int i = 0; i < meses  ; i++) {
            if (i == 0) {
                Padulto(g, 0, i);
                Pbebe(g, 1, i);
            }else if (i == 1) {
                Padulto(g, 1, i);
                Pbebe(g, 0, i);
            } else {

                // adultos
                p = b + a;
                a = b;
                b = p;
                Padulto(g, p, i);

                // bebes
                p1 = d + c;
                c = d;
                d = p1;
                System.out.println("adultos = " + p + "bebes = " + p1);
                Pbebe(g, p1, i);


            }


        }
    }

    public static void paint(Graphics g,int Padulta, int Pbebe){


    }
    public static void Padulta(Graphics g){
        g.setColor(Color.PINK);
        g.fillOval(105,400,50,50);
        g.fillOval(110,380,20,30);
        g.fillOval(130,380,20,30);
        g.setColor(Color.black);
        g.fillOval(120,410,10,10);
        g.fillOval(130,410,10,10);
        g.setColor(Color.blue);
        g.fillOval(122,410,6,6);
        g.fillOval(132,410,6,6);

    }

    //imprime la cantidad de conejos
    public static void Pbebe(Graphics g,int num, int y){
        // coordenadas d
        int x1 = 800 ;
        int y1  = y*100  ;

        // dibuja en horizontal los conejos
        for (int i = 0; i < num  ; i++) {
            x1 += 100;
            // un solo conejo
            g.setColor(Color.WHITE);
            g.fillOval(105 + x1,100 + y1,50,50);
            g.fillOval(110 + x1,80 +  y1,20,30);
            g.fillOval(130 + x1,80 +  y1,20,30);
          /*
            g.setColor(Color.black);
            g.fillOval(120 + x1,10 +  y1,10,10);
            g.fillOval(130 + x1,10 +  y1,10,10);
            g.setColor(Color.blue);
            g.fillOval(122 + x1,10 +  y1,6,6);
            g.fillOval(132 + x1,10 +  y1,6,6);
          */

        }


    }


    public static void Padulto(Graphics g,int num, int y){
        // coordenadas d
        int x1 = 800 ;
        int y1  = y*100  ;

        // dibuja en horizontal los conejos
        for (int i = 0; i < num  ; i++) {
            x1 -= 100;
            // un solo conejo
            g.setColor(Color.pink);
            g.fillOval(105 + x1,100 + y1,50,50);
            g.fillOval(110 + x1,80 +  y1,20,30);
            g.fillOval(130 + x1,80 +  y1,20,30);
          /*
            g.setColor(Color.black);
            g.fillOval(120 + x1,10 +  y1,10,10);
            g.fillOval(130 + x1,10 +  y1,10,10);
            g.setColor(Color.blue);
            g.fillOval(122 + x1,10 +  y1,6,6);
            g.fillOval(132 + x1,10 +  y1,6,6);
          */

        }


    }
}
