import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class main {
    static   int a = 0;
    static  int b = 1;
    static int p = 0;
    static int suma;
    public static void main(String[] args) {
        AtomicInteger m =   new AtomicInteger();

        //panel
        JFrame frame = new JFrame("Graficos Edgar - cuarto parcial Graficacion");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField meses = new JTextField("meses");
        meses.setBounds(20,50,80,20);
        frame.add(meses);
        meses.setVisible(true);
        // boton de agrgar a la lista
        JButton obtenerCAdultos = new JButton("obtener adultos");
        obtenerCAdultos.setBounds(250,50,30,10);
        frame.add(obtenerCAdultos);
        obtenerCAdultos.setVisible(true);
        frame.setVisible(true);
        JLabel label = new JLabel();
        label.setBounds(250,100,40,10);
        frame.add(label);
        label.setVisible(true);

        obtenerCAdultos.addActionListener(e -> {
            calcular(Integer.parseInt(meses.getText()));

        });

    }

    public static  void calcular(int meses){

        System.out.println(a);
        System.out.println(1);
        for (int i = 0; i < 6 ; i++) {
            p = b + a;
            a = b;
            b = p;
            System.out.println(p);

        }
        // conejos adultos
        System.out.println("conejos adultos = "+p);

    }
}
