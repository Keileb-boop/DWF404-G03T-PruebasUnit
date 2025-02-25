package sv.edu.udb.Empleados;

import sv.edu.udb.Empleados.*;
import sv.edu.udb.Empresa.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(50000);

        Desarrollador dev1 = new Desarrollador("Caleb Peñate", 1, 1500, "Proyecto creación de sistema de escuela");
        Desarrollador dev2 = new Desarrollador("Gladis Rivas", 2, 2200, "Proyecto  creacion de sistema de boletos");
        Gerente gerente = new Gerente("Camila Castillo", 3, 2000);
        Contador contador = new Contador("Erika Guardado", 4, 2500);

        empresa.contratarEmpleado(dev1);
        empresa.contratarEmpleado(dev2);
        empresa.contratarEmpleado(gerente);
        empresa.contratarEmpleado(contador);

        empresa.pagarEmpleado(dev1);
        empresa.pagarEmpleado(gerente);
        empresa.despedirEmpleado(contador);

        empresa.mostrarHistorial();
    }
}