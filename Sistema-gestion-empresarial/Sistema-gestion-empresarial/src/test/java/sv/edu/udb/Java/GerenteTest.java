package sv.edu.udb.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sv.edu.udb.Empleados.Desarrollador;
import sv.edu.udb.Empleados.Gerente;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {
    private Gerente gerente;

    @BeforeEach
    void setUp() {
        gerente = new Gerente("Carlos Gomez", 3, 7000);
    }

    @Test
    void shouldNotAllowFiringManagerWithLessThanThreeDevelopers() {
        gerente.agregarDesarrollador(new Desarrollador("Dev1", 4, 5000, "Proyecto A"));
        gerente.agregarDesarrollador(new Desarrollador("Dev2", 5, 5200, "Proyecto B"));

        assertTrue(gerente.getTamanoEquipo() < 3, "El gerente aún no tiene 3 desarrolladores.");
    }
}
