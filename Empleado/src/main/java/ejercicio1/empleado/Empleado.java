package ejercicio1.empleado;
public class Empleado {
    private int codigo;
    private String nombre;
    private float sueldo;
    private float comision;
    private float descuento;

    public Empleado(int codigo, String nombre, float sueldo, float comision, float descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.comision = comision;
        this.descuento = descuento;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getSueldo() {
        return sueldo;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    public float getComision() {
        return comision;
    }
    public void setComision(float comision) {
        this.comision = comision;
    }
    public float getDescuento() {
        return descuento;
    }
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    public float totalSueldo(){
        float total;
        total=(sueldo+comision)-descuento;
        return total;
    }
}