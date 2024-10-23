package ejercicio1.empleado_herencia;
public class Tipo extends Empleado_Herencia{
    private int zona;
    public Tipo(int zona, String nombre, int edad, double salario, int tipoEmpleado, double comision) {
        super(nombre, edad, salario, tipoEmpleado,comision);
        this.zona = zona;
    }

    public int getZona() {
        return zona;
    }
    public void setZona(int zona) {
        this.zona = zona;
    }
    public double plus(){
        if(getTipoEmpleado()==1){
            if(getEdad()>30 && getComision()>200){
                setComision(getComision()+getPlus());
            }
        }
        else if(getTipoEmpleado()==2){
            if(getZona()==2){
                setComision(getComision()+getPlus());
            }
        }
        return getComision();
    }
}