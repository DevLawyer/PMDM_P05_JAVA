# PMDM_P05_JAVA
Repository for the fifth project for PMDM subject.

# VISTA. ///////////////////////////////////////////////////////////////

JFrame 
JPane 1: con JList que muestre todos los empleados.
Filtro de empleados entre dos fechas.

JPane 2: de navegación uno a uno que muestra la información y foto con filtro desplegable por apellido que se complete con una consulta.

# MODELO. //////////////////////////////////////////////////////////////

Clase empleado.

# CONTROLADOR. /////////////////////////////////////////////////////////

Arraylist que almacene la consulta a la BBDD.

Clase AccesoDB:
- Divers.
- Generar la conexión "con".

Clase ConsultaA:
- Pide conexión de AccesoDB.
- statement sin parámetros.
- resultset que es la consulta SQL tal cual. la recibe como un string siendo como Select * from tabla o con el filtro de fechas.
- bucle para construir los objetos con los campos de la consulta y añadirlos al arraylist.
- cerrar todo.
- return arraylist.


Clase ConsultaB:
- Pide conexión de AccesoDB.
- statement con parámetros scroll y read_only.
- resultset consulta.
- avanzar
- retroceder
- primero
- ultimo
