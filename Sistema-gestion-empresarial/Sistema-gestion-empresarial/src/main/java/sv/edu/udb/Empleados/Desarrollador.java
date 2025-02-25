package sv.edu.udb.Empleados;

public class Desarrollador extends Empleado {
    private String proyecto;

    public Desarrollador(String nombre, int id, double salario, String proyecto) {
        super(nombre, id, salario, "Desarrollo de Software");
        this.proyecto = proyecto;
    }

    public String getProyecto() { return proyecto; }
}
