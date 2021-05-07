# PracticaKonecta
Prueba practica para vacante de konecta

1. Crear una base de datos en postgreSQL llamada "practica"
2. Editar la contraseña del archivo application.properties (linea 9)
3. Ejecutar

PD: problemas de ingreso de datos, front y consultas realizadas con exito.
Se pueden apreciar haciendo una(s) insercion(es) de manera directa en la base de datos

SQL de apoyo para este ultimo caso:

insert into empleado values(17,'30-02-2011','Juan',1000000);
insert into empleado values(14,'12-06-2017','Pedro',1500000);
insert into empleado values(13,'30-01-2020','Ana',3000000);

insert into solicitud values(1,'123','Revision nomina','Se revisa la nomina de la empresa',17);
insert into solicitud values(2,'124','Proyecto EPM','Gestion de base de datos para EPM',14);
insert into solicitud values(3,'125','Revision nomina','Se revisa la nomina de la empresa',14);
