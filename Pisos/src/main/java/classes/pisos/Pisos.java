package classes.pisos;
import javax.swing.JOptionPane;
public class Pisos {
    public static void main(String[] args) {
        int escalones=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de escalones que desea subir"));
        subir(escalones);
    }
    public static void subir(int escalones){
        for(int i=1;i<(escalones+1);i++){
            System.out.println(i);
        }
    }
}
