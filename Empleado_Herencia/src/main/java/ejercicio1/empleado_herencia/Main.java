package ejercicio1.empleado_herencia;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        String nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        double salario=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salario"));
        int tipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog("Que tipo de empleado eres?\n1-Comerciante\n2-Repartidor"));
        int zona=Integer.parseInt(JOptionPane.showInputDialog("En que zona trabajas?(numero)"));
        double comision=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de comision que ganas"));
        Tipo empleado=new Tipo(zona,nombre,edad,salario,tipoEmpleado,comision);
        JOptionPane.showMessageDialog(null,empleado.getSalario()); 
        empleado.setSalario(salario+empleado.plus());
        JOptionPane.showMessageDialog(null,"Tu salario final es de: $"+empleado.getSalario());
    }
}
