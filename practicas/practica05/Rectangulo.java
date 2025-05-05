package practicas.practica05;

class Rectangulo extends FiguraGeometrica 
{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() 
    {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() 
    {
        return 2 * (base + altura);
    }

    @Override
    public String toString() 
    {
        return "Rectángulo [Base = " + base + ", Altura = " + altura + ", Perímetro = " + calcularPerimetro() + ", Área = " + calcularArea() + "]";
    }
}
