package classes.prototipo4;

import javax.swing.JOptionPane;

public class Prototipo4 {

    public static void main(String[] args) {
        int x=0,multiplica=0;
        x=pide1();
        JOptionPane.showMessageDialog(null, "El total es:"+(x*x));
        System.exit(0);
    }
    public static int pide1(){
        String dato=null;
        dato=JOptionPane.showInputDialog("Teclea un número");
        int numero=Integer.parseInt(dato);
        return numero;
    }
}
