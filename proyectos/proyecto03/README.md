# Proyecto 3. 🃏 Pick A Perro (sin perros)

Autor: Ibrahim Munive Ramírez

Cuenta: 424106083

---

## 🎯 Objetivo del juego

Formar una **secuencia válida** de cartas, donde **cada carta difiera de la anterior en una sola característica**. El jugador humano y los artificiales toman cartas desde una **mesa compartida**. Al final del turno, si su secuencia no es válida, ¡pierden todas sus cartas!

---

## 🚀 Instrucciones básicas

1. Ejecuta el programa.
2. Ingresa el número de jugadores (de 1 a 5).
3. Si solo juegas tú (1 jugador), competirás contra la mesa.
4. Si hay jugadores artificiales, ellos jugarán automáticamente en segundo plano.
5. Elige cartas por su número para agregarlas a tu secuencia.
6. Finaliza tu turno con `-1`.
7. Ganas si tu secuencia es válida **y no dejaste cartas compatibles en la mesa**.

---

## Funcionamiento 

Esta implemnetación del juego se basó en cambiar las tarjetas de perros por arreglos de caracteres. En estos arreglos se consideran cinco posiciones representando
las características cambiantes de las tarjetas. Por simplicidad, solo tendremos dos caracteres, "o" o "x".

Se hizo la implementación concurrente del juego, es decir, no existe una versión de juego por turnos. 


Agradecimientos especiales a ChatGPT por ayudar con el formato del _README.md_. 

---

## 🧩 Estructura del Proyecto

### `Main.java`
- Presenta el juego.
- Solicita y valida la cantidad de jugadores.
- Lanza el juego.

### `Juego.java`
- Controla la lógica principal de una o varias rondas.
- Genera la mesa (30 cartas).
- Imprime la mesa en forma de tablero, con colores.
- Coordina los turnos del jugador humano y los jugadores artificiales.
- Evalúa si las secuencias son válidas.

### `JugadorArtificial.java`
- Representa un jugador artificial.
- Ejecuta su turno en un hilo separado (`Runnable`).
- Tiene su propia secuencia de cartas.
- Accede a la mesa compartida de forma sincronizada.
- Simula análisis y toma de decisiones.
- Valida su secuencia al final.

### `Carta.java`
- Representa una carta como una matriz `3x3` de símbolos (`char`).
- Solo 5 posiciones de la matriz contienen símbolos (esquinas y centro).
- Provee métodos para:
  - Generar cartas aleatorias.
  - Comparar cartas.
  - Verificar compatibilidad.
  - Imprimir visualmente las cartas.

### `ListaLigada.java`
- Estructura dinámica personalizada para almacenar las cartas del jugador.
- Inserta cartas al final.
- Verifica la validez de la secuencia:
  - Cada carta debe diferir de la anterior en **solo una característica**.
- Permite imprimir o vaciar la lista.
- Expone su longitud (usado para puntaje).

---

## 🎨 Representación visual

- La **mesa** se imprime como un tablero de 5 columnas.
- Las cartas alternan color (normal / verde) como un tablero de ajedrez.
- Las cartas del jugador se muestran numeradas y completas.

---

## ♻️ Funcionalidades adicionales

- Soporte multirronda.
- Jugadores artificiales que actúan en paralelo.
- Impresión detallada de los resultados de cada jugador artificial.
- Validación justa: puedes insertar cualquier carta, pero se evalúa **al final** si fuiste coherente.

---

## ❌ Inconvenientes

Durante el desarrollo del proyecto se presentaron varios retos:

- ❗ Inicialmente, se impedía agregar cartas no válidas a la secuencia, lo que iba en contra de la lógica del juego (la validación debía hacerse al final).
- ❗ Hubo dificultad para imprimir cartas en formato tablero y con estética clara, lo cual se resolvió (creo) generando líneas simultáneas por filas.
- ❗ Fue necesario aprender a sincronizar hilos para evitar que múltiples jugadores artificiales accedieran a la misma carta simultáneamente.
- ❗ Se mejoró la visualización de cartas alternando colores y numerando cartas para facilitar la jugabilidad.
- ❗Se traslapaban los textos, se mezclaban y era difícil entender qué sucedía.  


_Disfruta programando como jugando._


¡Gracias por jugar **Pick A Perro sin perros**! 🐾