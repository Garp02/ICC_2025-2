# Práctica 5: Figuras Geométricas con Herencia y Polimorfismo

Autor: Ibrahim Munive Ramírez

Número de cuenta: 424106083

## Explicación

La clase `FiguraGeometrica` es una clase **abstracta** que representa una figura genérica. Dentro de esta clase se definen tres métodos:

- `calcularArea()` – Método abstracto, ya que el área depende del tipo de figura.
- `calcularPerimetro()` – También es abstracto por la misma razón.
- `toString()` – Tiene una implementación predeterminada para mostrar detalles básicos de la figura.

Las clases concretas `Triangulo`, `Rectangulo` y `Cuadrado` heredan de `FiguraGeometrica` e **implementan de forma específica** los métodos abstractos, cada una con su lógica particular para calcular área y perímetro.

## Punto 4: Decisión sobre `toString()`

El método `toString()` fue **definido dentro de la superclase `FiguraGeometrica`**, y **no como un método abstracto**, por las siguientes razones:

- **Proporciona una implementación predeterminada común** que incluye información general como tipo de figura, área y perímetro.
- **Permite que las subclases sobrescriban el método** si desean añadir una representación más específica.
- Evita la obligación de implementar `toString()` en cada subclase si la representación genérica ya es suficiente.

### ¿Por qué no abstracto?

Hacerlo abstracto forzaría a todas las subclases a implementar su propio `toString()`, lo cual no siempre es necesario. Al definirlo en la superclase, damos la opción de reutilizarlo o sobrescribirlo según sea conveniente, favoreciendo la reutilización y la flexibilidad.:D

## Polimorfismo

Se utiliza **polimorfismo** en el archivo `Main.java`, donde se crean variables de tipo `FiguraGeometrica`, pero que hacen referencia a objetos de clases concretas:

```java
FiguraGeometrica figura1 = new Triangulo(...);
FiguraGeometrica figura2 = new Rectangulo(...);
FiguraGeometrica figura3 = new Cuadrado(...);
```