# Taller-12
alumno: Carlos jose torres del rio

Actividades de taller numero 12 de la actividad colaborativa de POO (Realizada en solitario)

Actividad 1:

Clase Ave (Hecho) con 2 interfazes implementadas en esta, cada una con su propio metodo:
    -Volador (Hecho) con un metodo llamado Volar.
    -Cantante (hecho) con un metodo llamado cantar.
Ambas se implementaron en la clase ave para sobreescribir el contenido de ambos metodos.
Se creo un main para tener un objeto de nombre pato (Se cambio a ave para mantener linea visual con la clase) que ejecuta ambos metodos como un system out print.

Actividad 2:

Se solicita una clase Pez con 2 interfaces implementadas, Nadador y respirador.
    -Nadadoro (Hecho) tiene un metodo llamado nadar sim definir contenido.
    -Respirador (Hecho) tiene un metodo llamado respirar sin definiri contenido.
En pez se sobreescribieron ambos metodos, sigiendo la clase anterior como guia por la similitud de los ejercicios.
Nuevamene en el interio del propio archivo se realiza un main para que un objeto derivado de Pez instancie los metodso nadar y respirar sobreescritos en el interior de Pez, llamandolos por un system outprint.

Actividiad 3:

Se pidio que se use una interfaz sin proporcionar las implementaciones para observar los errores de los metodos.
Tambien se pidio crear un exceso de interfaces para demostrar porque. El uso de interfaces sin proposito es una mala practica:

Principalmente se definie como una mala practica porque cae dentro de ser un codigo innecesariamente sobrecargado, porque aunque una interfaz permite realizar multiples herencias, no quiere decir que siempre sean necesarias, es mejor replantearse y pensar bien si el codigo requiere o no todas las interfaces que han sido usadas y solo usar las justas en el proposito del archivo.