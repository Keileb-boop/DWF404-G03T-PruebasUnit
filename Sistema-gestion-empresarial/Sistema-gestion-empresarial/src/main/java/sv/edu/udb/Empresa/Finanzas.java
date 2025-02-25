package sv.edu.udb.Empresa;

import sv.edu.udb.Empleados.Empleado;
import sv.edu.udb.Interfaces.Gestionable;
import java.util.ArrayList;
import java.util.List;

public class Finanzas extends Departamento implements Gestionable {
    private List<Empleado> empleadosActivos;

    public Finanzas() {
        this.empleadosActivos = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado e) {
        empleadosActivos.add(e);
        System.out.println("Empleado registrado en Finanzas: " + e.getNombre());
    }

    @Override
    public void removerEmpleado(Empleado e) {
        if (empleadosActivos.contains(e)) {
            empleadosActivos.remove(e);
            System.out.println("Empleado eliminado de Finanzas: " + e.getNombre());
        } else {
            System.out.println("Empleado no encontrado en Finanzas.");
        }
    }

    @Override
    public double calcularPresupuesto() {
        double totalSalarios = 0;
        for (Empleado e : empleadosActivos) {
            totalSalarios += e.getSalario();
        }
        return totalSalarios;
    }

    public void registrarEmpleado(Empleado e) {
        agregarEmpleado(e);
    }

    public void eliminarEmpleado(Empleado e) {
        removerEmpleado(e);
    }

    @Override
    public void contratar(Empleado e) {
        System.out.println("Finanzas no contrata empleados. Recursos Humanos lo hace.");
    }

    @Override
    public void despedir(Empleado e) {
        System.out.println("Finanzas no despide empleados. Recursos Humanos lo hace.");
    }

    @Override
    public void procesarPago(Empleado e) {
        if (empleadosActivos.contains(e)) {
            System.out.println("Pago procesado para: " + e.getNombre() + " - Salario: $" + e.getSalario());
        } else {
            System.out.println("Error: No se puede pagar a " + e.getNombre() + " porque no está activo.");
        }
    }
}
