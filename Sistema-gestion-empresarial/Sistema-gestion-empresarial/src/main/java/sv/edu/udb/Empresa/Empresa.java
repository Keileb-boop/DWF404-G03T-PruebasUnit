package sv.edu.udb.Empresa;

import sv.edu.udb.Empleados.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private RecursosHumanos rh;
    private Finanzas finanzas;
    private List<String> historialEventos;

    public Empresa(double presupuestoInicial) {
        this.finanzas = new Finanzas();
        this.rh = new RecursosHumanos(presupuestoInicial, finanzas);
        this.historialEventos = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado e) {
        rh.contratar(e);
        historialEventos.add("Contratado: " + e.getNombre());
    }

    public void despedirEmpleado(Empleado e) {
        rh.despedir(e);
        historialEventos.add("Despedido: " + e.getNombre());
    }

    public void pagarEmpleado(Empleado e) {
        finanzas.procesarPago(e);
    }

    public void mostrarHistorial() {
        historialEventos.forEach(System.out::println);
    }
}