package ejercicio1.docente;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        String nombre=JOptionPane.showInputDialog("Ingresa el nombre del docente:");
        double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el sueldo del docente:"));
        int horas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de horas del docente:"));
        String tipo=JOptionPane.showInputDialog("Ingresa el tipo de materia:\nCiencias\nLetras");
        Docente profe= new Docente(nombre,tipo,horas,sueldo);
        profe.mostrarNombre();
        double sueldob=profe.sueldoBruto();
        double descuento=profe.descuento(sueldob);
        double sueldon=profe.sueldoneto(sueldob, descuento);
        System.out.println(""+sueldob);
        System.out.println(""+descuento);
        System.out.println(""+sueldon);
    }
}
