package ejercicio1.empleado_herencia;
public class Empleado_Herencia {
    private String nombre;
    private int edad;
    private double salario;
    private double plus=300;
    private int tipoEmpleado;
    private double comision;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getTipoEmpleado() {
        return tipoEmpleado;
    }
    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    public Empleado_Herencia(String nombre, int edad, double salario, int tipoEmpleado, double comision) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
        this.comision = comision;
    }
}
