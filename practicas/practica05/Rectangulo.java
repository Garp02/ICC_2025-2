package practicas.practica05;

public class Rectangulo extends FiguraGeometrica
{
    public double CalcularArea()
    {
        return base*altura;
    }

    public double CalcularPerimetro()
    {
        return 2 * (base + altura);
    }
}
