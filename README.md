# cc3002-tarea2

El objetivo de esta tarea es implementar un clon del juego de cartas Pokémon. Para eso en esta tarea se implemento
la logica basica del juego, es decir, un entrenador, que tiene un nombre y un mazo (Para lo cual se utilizo una clase Trainer), cada energia posee un nombre y ademas es un tipo, ya sea fuego,agua, planta,lucha, psiquica y relampago (Por lo que se creo una interfaz, una clase abstracta y 6 clases mas para cada tipo de energia), por ultimo cada pokemon posee un nombre, id, hp y lista de habilidades, al igual que las energias existen 6 tipos por lo que se siguio la misma logica para crearlo, aunque ademas extiste el pokemon tipo basico, pokemon fase uno y pokemon fase dos, por lo que para cada tipo de pokemon se creo una clase. Las habilidades tienen un nombre, descripcion de la habilidad y un costo para que el pokemon pueda usar esta habilidad (en esta implementacion el costo es un hashmap), ademas los atques son un tipo de habilidad por lo que ademas de las caracteristicas anteriores estos poseen un daño base.Tambien se tienen las cartas de entrenador que se dividen en estadios, soporte y objetos. Cada carta tiene una implementacion especial y un efecto. Por ultimo se creo un controlador que se encarga de la logica del juego, esto quiere decir que ningun entrenador haga cosas que no deberia hacer. Todo esto gracias a la ayuda de Visitor (para desambiguar los tipos y ademas lograr que sea mas extensible el codigo) y double dispatch principalemnte, ademas de otro patrones de diseño como nullObject y template.

Las funcionalidades adicionales que implemente son Wing Buzz, Electric Shock, Great Ball, Lucky Stadium y Profesor Juniper los cuales se testean en TestTarea2.Test1 en el test llamado TrainerCardTest.

## Test

Para correr los test lo primero que se debe hacer es clonar el repositorio al computador, luego se abre IntelliJ y se coloca
la opcion de abrir, ahi se selecciona la carpeta donde se clono el repositorio y listo, para correr los simplemente se hace
click derecho en la carpeta de src y se selecciona la opcion de "Run Test With Coverage". En el package de test estan los package TestTarea1 y TestTarea2, que como dicen sus nombres testean las funcionalidades de ambas tareas (El de la tarea uno tiene modificaciones con respecto a la entrega anterior ya que todo fue modificado)
