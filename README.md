# Ejercicio para modelar clases en Java : Gimnasio con socios y actividades

# Parte 1

### Resumen
Se desea modelar el sistema de acceso para un gimnasio donde se realizan actividades, por ejemplo Karate, natacion, musculación, etc. En principio las actividades son por demanda expontanea, es decir que las personas pueden ingresar 

### Actividades
Una actividad tiene un nombre y un id. Cada actividad se realiza por única vez, si una actividad es recurrente tendrá un id distinto.

### Tipos de socios

- Socio full: Puede realizar todas las actividades de manera ilimitada
- Socio por actividades: Puede realizar una lista especifica de actividades asignadas, sin limite, pero solo las asignadas.
- SocioPorCantActividades: Puede realizar una cantidad finita de actividades, que se iran descontando a medida que son utilizadas.
- SocioPrueba: Puede realizar una unica actividad a eleccion por unica vez. No se puede renovar esta actividad.

### Aclaraciones
- Pueden utilizarse otras clases en caso de considerar necesario, como por ejemplo una clase para validar el acceso.
