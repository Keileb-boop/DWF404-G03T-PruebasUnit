package sv.edu.udb.Empresa;


import sv.edu.udb.Empleados.Empleado;
import sv.edu.udb.Interfaces.Gestionable;
import java.util.ArrayList;
import java.util.List;

public class RecursosHumanos extends Departamento implements Gestionable {
    private List<Empleado> empleados;
    private double presupuesto;
    private Finanzas finanzas;

    public RecursosHumanos(double presupuesto, Finanzas finanzas) {
        this.empleados = new ArrayList<>();
        this.presupuesto = presupuesto;
        this.finanzas = finanzas;
    }

    @Override
    public void agregarEmpleado(Empleado e) {
        if (presupuesto >= e.getSalario()) {
            empleados.add(e);
            presupuesto -= e.getSalario();
            finanzas.registrarEmpleado(e);
            System.out.println("Empleado contratado: " + e.getNombre());
        } else {
            System.out.println("No hay suficiente presupuesto para contratar a " + e.getNombre());
        }
    }

    @Override
    public void removerEmpleado(Empleado e) {
        if (empleados.contains(e)) {
            empleados.remove(e);
            finanzas.eliminarEmpleado(e);
            System.out.println("Empleado despedido: " + e.getNombre());
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    @Override
    public double calcularPresupuesto() {
        return presupuesto;
    }

    @Override
    public void contratar(Empleado e) {
        agregarEmpleado(e);
    }

    @Override
    public void despedir(Empleado e) {
        removerEmpleado(e);
    }

    @Override
    public void procesarPago(Empleado e) {
        System.out.println("Recursos Humanos no procesa pagos. Finanzas lo hace.");
    }
}
