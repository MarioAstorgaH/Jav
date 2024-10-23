package ejercicio1.empleado;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]){
        int codigo;
        String nombre;
        float sueldo, comision, descuento;
        int numEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Cuántos empleados deseas ingresar?"));
        Empleado empleado[] = new Empleado[numEmpleados];
        for(int i=0;i<numEmpleados;i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Inserta tu código:"));
            nombre=JOptionPane.showInputDialog("Ingresa tu nombre:");
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu sueldo:"));
            comision=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu comision:"));
            descuento=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu descuento:"));
            empleado[i]=new Empleado(codigo,nombre,sueldo,comision,descuento);
            JOptionPane.showMessageDialog(null, "Empleado "+(i+1)+"\nCódigo: "+empleado[i].getCodigo()+"\nNombre: "+empleado[i].getNombre()+"\nSueldo: $"+empleado[i].getSueldo()+"\nComision: $"+empleado[i].getComision()+"\nDescuento: $"+empleado[i].getDescuento()+"\nSueldo total: $"+empleado[i].totalSueldo());
        }
        
    }
}