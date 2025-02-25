--------------------------------------------------------------------
<h1>📌Sistema de Gestión Empresarial Modular</h1>

*****************************************************
Camila Elizabeth Castillo Joya CJ220498

Erika Fernanda Guardado Alvarado GA220455

Gladis del Carmen Rivas Miranda RM191684

Caleb Alejandro Peñate Deras PD230166

******************************************************
1.Descripción del Problema y Solución

●Problema:

Una empresa tecnológica está en expansión y necesita un software que le ayude a administrar a sus empleados en tres departamentos clave:

1.	Recursos Humanos (RH) → Contrata y despide empleados.
   
2.	Finanzas → Administra pagos y presupuestos.
   
3.	Desarrollo de Software → Contiene desarrolladores asignados a proyectos.

La empresa requiere que Recursos Humanos solo contrate si hay presupuesto, que Finanzas solo pague a empleados activos, y que los gerentes tengan al menos tres desarrolladores bajo su supervisión.

●Solución Implementada

Se diseñó un sistema en Java 17 con Maven, aplicando los principios de la POO.

•	Se usaron herencia y abstracción para modelar Empleado y sus subclases (Desarrollador, Gerente, Contador).

•	Se creó una interfaz Gestionable para definir las acciones comunes de los departamentos.

•	Cada departamento gestiona a sus empleados siguiendo reglas de negocio específicas.

--------------------------------------------------------------------------------------------------------------------------------------------------
2.Cómo Ejecutar el Proyecto

✅ Requisitos Previos

•	Tener instalado Java 17 o superior.

•	Tener Apache Maven instalado y configurado.

•	Un IDE compatible como IntelliJ IDEA, Eclipse o VS Code con soporte para Java y Maven.

✅ Pasos para Ejecutar el Proyecto

1.	Clonar el repositorio o descargar los archivos del proyecto:

git clone https://github.com/Keileb-boop/DWF404-G03T-PruebasUnit.git

2.	Compilar el proyecto con Maven:

mvn clean compile

3.	Ejecutar la aplicación:

mvn exec:java -Dexec.mainClass="sv.edu.udb.Main"

4.	Ejecutar pruebas unitarias:
   
Mvn test

--------------------------------------------------------------------------------------------------------------------------------------------------
3.Explicación de las Pruebas Unitarias

Se han implementado pruebas con JUnit 5 para validar las funcionalidades clave del sistema.

📌 Casos de prueba implementados

1.Simulación de contratación:Verifica que Recursos Humanos puede contratar empleados y que Finanzas recibe la notificación correctamente.

2.Intento de despedir a un gerente sin suficientes desarrolladores:Valida que el sistema impide despedir a un gerente si tiene menos de tres desarrolladores bajo su mando.

3.Registro de pagos:Confirma que solo los empleados activos reciben su salario y que Finanzas no paga a empleados inactivos.
