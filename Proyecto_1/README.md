# Proyecto 1. Implementación de la interfaz ServiciosRecipiente.java

Autor: Ibrahim Munive Ramírez
Boleta: 424106083

## Descripción del proyecto

Se implementaron los métodos de la interfaz `ServiciosRecipiente.java` en la clase `Recipiente.java`.

### Métodos implementados:

1. **´public double capacidad´**
2. **´public double capacidadRestante´**
3. **´public boolean estaVacio´**
4. **´public boolean estaLleno´**
5. **´public double rellena´**
6. **´public double vacia´**
7. **´public void vierte´**
8. **´public boolean mismasDimensiones´**
9. **´public boolean mismaCapacidad´**
10. **´public boolean contieneMas´**
11. **´public boolean cabeMas´**
12. **´public Recipiente creaContenedorJusto´**
13. **´public String muestra´**

Estos 13 métodos están definidos e implementados en la clase `Recipiente.java`, y se utilizan para realizar diversas operaciones sobre un recipiente, como calcular su capacidad, verificar si está vacío o lleno, rellenarlo, vaciarlo, comparar su capacidad con otro recipiente, y más.

En el archivo ´Main.java´ se crearon diferentes recipientes y se utilizaron los diferentes métodos. 

Por la manera en la que se creó el método ´muestra´, vienen implícitos los métodos 'capacidad', ´capacidadRestante´, ´estaVacio´ y ´estaLleno´, por lo que no se utilizaron directamente en el ´Main.java´. 

## Instrucciones de uso

Descargar los archivos `Recipiente.java`, `ServiciosRecipiente.java` y `Main.java` y ejecutar el archivo `Main.java` para ver el funcionamiento de los métodos implementados.

## Inconvenientes presentados 

Se planeó agregar colores para una mejor visualización de la información en el método muestra, pero daba error. Para solucionarlo se tuvo que agregar ´%s´ al inicio y al final de la cadena que se quería mostrar en diferente color, luego de eso se tenía que resetear el color. 