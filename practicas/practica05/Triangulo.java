package practicas.practica05;
import java.lang.Math;

public class Triangulo extends FiguraGeometrica
{
    public double CalcularArea()
    {
        return (base*altura)/2;
    }

    public double CalcularPerimetro()
    {
        return base + altura + Math.sqrt((base * base) + (altura * altura));
    }

}
