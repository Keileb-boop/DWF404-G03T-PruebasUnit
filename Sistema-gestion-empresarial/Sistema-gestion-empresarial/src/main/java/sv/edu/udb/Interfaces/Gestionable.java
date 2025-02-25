package sv.edu.udb.Interfaces;

import sv.edu.udb.Empleados.Empleado;

public interface Gestionable {
    void contratar(Empleado e);
    void despedir(Empleado e);
    void procesarPago(Empleado e);
}
