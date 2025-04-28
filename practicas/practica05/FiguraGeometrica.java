package practicas.practica05;

public abstract class FiguraGeometrica 
{
    int base;
    int altura;

    // Constructor
    public FiguraGeometrica(int base, int altura)
    {
        this.base = base;
        this.altura = altura;
    }
    
    // Métodos mutantes

    public void setBase(int base)
    {
        this.base = base;
    }
    
    public void setAltura(int altura)
    {
        this.altura = altura;
    }
    // Métodos de acceso

    public int getBase()
    {
        return base;
    }

    public int getAltura()
    {
        return altura;
    }

    // Métodos de clase
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

}
