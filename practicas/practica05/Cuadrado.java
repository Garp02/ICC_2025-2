package practicas.practica05;

class Cuadrado extends FiguraGeometrica 
{
    private double lado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }

    @Override
    public double calcularArea() 
    {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() 
    {
        return 4 * lado;
    }

    @Override
    public String toString() 
    {  
        return "Cuadrado [Lado = " + lado + ", Perímetro = " + calcularPerimetro() + ", Área = " + calcularArea() + "]";
    }
}
