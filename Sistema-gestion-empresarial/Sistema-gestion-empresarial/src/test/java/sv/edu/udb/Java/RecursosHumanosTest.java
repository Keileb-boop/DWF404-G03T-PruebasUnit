package sv.edu.udb.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sv.edu.udb.Empleados.Desarrollador;
import sv.edu.udb.Empresa.Finanzas;
import sv.edu.udb.Empresa.RecursosHumanos;

import static org.junit.jupiter.api.Assertions.*;

class RecursosHumanosTest {
    private RecursosHumanos recursosHumanos;
    private Finanzas finanzas;

    @BeforeEach
    void setUp() {
        finanzas = new Finanzas();
        recursosHumanos = new RecursosHumanos(10000, finanzas);
    }

    @Test
    void shouldNotifyFinanzasWhenHiringNewEmployee() {
        Desarrollador dev = new Desarrollador("Juan Perez", 1, 5000, "Proyecto X");
        recursosHumanos.contratar(dev);

        assertTrue(finanzas.calcularPresupuesto() > 0, "Finanzas debe recibir notificación y calcular el nuevo presupuesto.");
    }
}
