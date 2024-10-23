package ejercicio1.alumnos;
public class Alumnos{
    private int Matricula;
    private String Nombre;
    private int Semestre;
    private String Carrera;
    private double promedio;

    public Alumnos(int Matricula, String Nombre, int Semestre, String Carrera, double promedio) {
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.Semestre = Semestre;
        this.Carrera = Carrera;
        this.promedio = promedio;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public void cal(int promedio){
        if(promedio>=6){
            System.out.println("Estas aprobado");
        }
        else{
            System.out.println("Estas reprobado");
        }
    }
}


