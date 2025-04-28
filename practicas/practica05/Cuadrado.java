package practicas.practica05;

public class Cuadrado extends FiguraGeometrica
{
    public double CalcularArea()
    {
        return base*base;
    }

    public double CalcularPerimetro()
    {
        return 4 * base;
    }
}
