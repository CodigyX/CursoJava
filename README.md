# Curso Java

Ejercicios de práctica en **Java**: programación orientada a objetos y resolución de problemas.

## Gestor de tareas

Aplicación de consola con menú para agregar tareas con prioridad y consultar la última registrada.

- `Actividad`: clase abstracta con el método `ejecutar()`.
- `Tarea`: hereda de `Actividad` y agrega la prioridad (herencia y polimorfismo).
- `GestorDeTareas`: menú interactivo con `Scanner` y `switch`.

```bash
javac Actividad.java Tarea.java GestorDeTareas.java
java GestorDeTareas
```

## Problemas de OmegaUp

La carpeta [`OmegaUP`](OmegaUP) contiene soluciones a problemas de la plataforma [omegaUp](https://omegaup.com): condicionales, comparaciones, cálculos y ordenamiento (por ejemplo, año bisiesto, máximo de tres, orden creciente u ordenar alumnos).
