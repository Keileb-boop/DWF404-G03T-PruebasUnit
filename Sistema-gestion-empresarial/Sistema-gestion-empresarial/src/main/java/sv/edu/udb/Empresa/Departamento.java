package sv.edu.udb.Empresa;

import sv.edu.udb.Empleados.Empleado;
import java.util.ArrayList;
import java.util.List;

public abstract class Departamento {
    protected List<Empleado> empleados = new ArrayList<>();

    public abstract void agregarEmpleado(Empleado e);
    public abstract void removerEmpleado(Empleado e);
    public abstract double calcularPresupuesto();
}
