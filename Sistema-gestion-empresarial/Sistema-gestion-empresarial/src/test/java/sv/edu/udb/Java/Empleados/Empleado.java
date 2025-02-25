package sv.edu.udb.Empleados;

public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;
    protected String departamento;

    public Empleado(String nombre, int id, double salario, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public double getSalario() { return salario; }
    public String getDepartamento() { return departamento; }
    public String getNombre() { return nombre; }
    public int getId() { return id; }
}
