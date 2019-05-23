import java.util.LinkedList;

public class caja implements Comparable<caja>{
int radio;
int altura;


    public caja(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;


    }

    @Override
    public int compareTo(caja o) {
        if (altura > o.altura  && radio > o.radio) {
            return -1;
        }
        if (altura <  o.altura && radio <  o.radio) {
                return 1;
        }
        return 0;
    }

}
