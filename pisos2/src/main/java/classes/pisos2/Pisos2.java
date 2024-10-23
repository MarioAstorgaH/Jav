package classes.pisos2;
import javax.swing.JOptionPane;
public class Pisos2 {
    public static void main(String[] args) {
        int i=0;
        int escalones=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de escalones que desea subir"));
        do{
            i=subir(i);
            System.out.println(i);
        }while(i<escalones);
        
    }
    public static int subir(int i){
        i++;
        return i;
    }
}

