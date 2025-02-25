package sv.edu.udb.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sv.edu.udb.Empleados.Contador;
import sv.edu.udb.Empresa.Finanzas;
import sv.edu.udb.Empresa.RecursosHumanos;

import static org.junit.jupiter.api.Assertions.*;

class FinanzasTest {
    private Finanzas finanzas;
    private RecursosHumanos recursosHumanos;
    private Contador contador;

    @BeforeEach
    void setUp() {
        finanzas = new Finanzas();
        recursosHumanos = new RecursosHumanos(10000, finanzas);
        contador = new Contador("Luis Martinez", 6, 4500);
    }

    @Test
    void shouldOnlyProcessPaymentsForActiveEmployees() {
        recursosHumanos.contratar(contador);
        finanzas.procesarPago(contador);

        assertEquals(4500, finanzas.calcularPresupuesto(), "El contador debería recibir el pago.");
    }

    @Test
    void shouldNotProcessPaymentForInactiveEmployee() {
        recursosHumanos.contratar(contador);
        recursosHumanos.despedir(contador);
        finanzas.procesarPago(contador);

        assertEquals(0, finanzas.calcularPresupuesto(), "No se deben procesar pagos para empleados despedidos.");
    }
}