# cc3002-tarea1

El objetivo de esta tarea es implementar un clon del juego de cartas Pokémon. Para eso en esta tarea se implemento
la logica basica del juego, es decir, un entrenador, que tiene un nombre, una lista de sus pokemones y otra lista
de sus energias (Para lo cual se utilizo una clase Trainer), cada energia posee un nombre y ademas es un tipo, ya sea fuego,
agua, planta,lucha, psiquica y relampago (Por lo que se creo una interfaz, una clase abstracta y 6 clases mas para cada
tipo de energia), por ultimo cada pokemon posee un nombre, id, hp y lista de habilidades, al igual que las energias existen
6 tipos por lo que se siguio la misma logica para crearlo. Las habilidades (esta vez solo ataques) tienen un nombre, daño base,
descripcion del ataque y un costo para que el pokemon pueda usar este ataque (en esta implementacion el costo es un hashmap).
Para todo esto se utilizo double dispatch, por lo que nunca se utiliza un instanceOf para preguntar por el tipo de un objeto
(Excepto para los equals).

## Test

Para correr los test lo primero que se debe hacer es clonar el repositorio al computador, luego se abre IntelliJ y se coloca
la opcion de abrir, ahi se selecciona la carpeta donde se clono el repositorio y listo, para correr los simplemente se hace
click derecho en la carpeta de src y se selecciona la opcion de "Run Test With Coverage".
