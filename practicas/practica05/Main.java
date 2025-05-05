package practicas.practica05;

public class Main 
{
    public static void main(String[] args) 
    {
        // Creación de un Triangulo
        Triangulo triangulo1 = new Triangulo(5, 3, 5, 4, 3);
        FiguraGeometrica triangulo2 = new Triangulo(4, 2.5, 4, 3, 3);

        // Creación de un Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(6, 8);
        FiguraGeometrica rectangulo2 = new Rectangulo(3, 10);

        // Creación de un Cuadrado
        Cuadrado cuadrado1 = new Cuadrado(4);
        FiguraGeometrica cuadrado2 = new Cuadrado(7);

        // Resultados usando polimorfismo
        System.out.println(triangulo1.toString());
        System.out.println(triangulo2.toString());

        System.out.println(rectangulo1.toString());
        System.out.println(rectangulo2.toString());

        System.out.println(cuadrado1.toString());
        System.out.println(cuadrado2.toString());

        // Polimorfismo con FiguraGeometrica
        FiguraGeometrica figura1 = triangulo1;
        FiguraGeometrica figura2 = rectangulo2;
        FiguraGeometrica figura3 = cuadrado2;

        // Mostrando el área y perímetro
        System.out.println("Figura 1 (triangulo): Area = " + figura1.calcularArea() + ", Perimetro = " + figura1.calcularPerimetro());
        System.out.println("Figura 2 (rectangulo): Area = " + figura2.calcularArea() + ", Perimetro = " + figura2.calcularPerimetro());
        System.out.println("Figura 3 (cuadrado): Area = " + figura3.calcularArea() + ", Perimetro = " + figura3.calcularPerimetro());
    }
}
