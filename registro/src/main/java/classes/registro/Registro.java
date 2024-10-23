package classes.registro;
import javax.swing.JOptionPane;
public class Registro {
    public static void main(String[] args) {
        int matricula=matricula();
        String name=name(),carrera=carrera(),grupo=grupo(),turno=turno();
        JOptionPane.showMessageDialog(null, "Los datos del alumno son: \n"+matricula+"\n"+name+"\n"+carrera+"\n"+grupo+"\n"+turno);
    }
    public static int matricula(){
        int matricula=0;
        matricula=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu matricula:"));
        return matricula;
    }
    public static String name(){
        String name;
        name=JOptionPane.showInputDialog("Ingresa tu nombre:");
        return name;
    }
    public static String carrera(){
        String carrera;
        carrera=JOptionPane.showInputDialog("Ingresa tu carrera:");
        return carrera;
    }
    public static String grupo(){
        String grupo;
        grupo=JOptionPane.showInputDialog("Ingresa tu grupo:");
        return grupo;
    }
    public static String turno(){
        String turno;
        turno=JOptionPane.showInputDialog("Ingresa tu turno:");
        return turno;
    }
}
