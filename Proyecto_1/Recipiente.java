public class Recipiente implements ServiciosRecipiente 
{
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final double PI = 3.141592653589793;

    private String nombreRecipiente;
    private double radio;
    private double altura;
    private double capacidadActual;

    //Constructor
    public Recipiente(String nombreRecipiente, double radio, double altura)
    {
        this.nombreRecipiente = nombreRecipiente;
        this.radio = radio;
        this.altura = altura;
        this.capacidadActual = 0;
    }

    // Método de acceso para el nombre
    public String getNombreRecipiente()
    {
        return this.nombreRecipiente;
    }

    //Método de acceso para el radio
    public double getRadio()
    {
        return this.radio;
    }

    //Método de acceso para la altura
    public double getAltura()
    {
        return this.altura;
    }

    //Método de acceso para la capacidad actual
    public double getCapacidadActual()
    {
        return this.capacidadActual;
    }
    
    // Método mutante para el nombre 
    public void setNombreRecipiente(String nombreRecipiente)
    {
        this.nombreRecipiente = nombreRecipiente;
    }

    //Método mutante para el radio
    public void setAltura(double radio)
    {
        this.radio = radio;
    }

    //Método mutante para la altura
    public void setRadio(double altura)
    {
        this.altura = altura;
    }

    //Método mutante para la capacidad actual
    public void setCapacidadActual(double capacidadActual)
    {
        this.capacidadActual = capacidadActual;
    }
    
    //? Métodos de la clase a implementar
    public double capacidad()
    {
        double capacidad = PI * (this.radio * this.radio) * this.altura;
        return capacidad;
    }

    public double capacidadRestante()
    {
        double capacidadRes = capacidad() - this.capacidadActual;
        return capacidadRes;
    }

    public boolean estaVacio()
    {
        return (this.capacidadActual == 0.0);
    }

    public boolean estaLleno()
    {
        return(this.capacidadActual == capacidad());
    }

    public double rellena(double cantidad)
    {
        if(this.capacidadActual + cantidad <= capacidad())
        {   
            setCapacidadActual(this.capacidadActual + cantidad);
            return 0;                  
        }
        
        else
        {
            setCapacidadActual(capacidad());
            return ((this.capacidadActual + cantidad) - capacidadRestante());
        }
    }

    public double vacia()
    {
        double cantidadAnterior = this.capacidadActual;
        setCapacidadActual(0.0);
        return cantidadAnterior;
    }

    public void vierte(Recipiente tambo)
    {
        if(this.capacidadActual > tambo.capacidadRestante())
        {
            this.capacidadActual = this.capacidadActual - tambo.capacidadRestante();
            tambo.setCapacidadActual(tambo.capacidad());
        }
        
        else
        {
            tambo.setCapacidadActual(tambo.getCapacidadActual() + this.capacidadActual);
            this.capacidadActual = 0;
        }
    }

    public boolean mismasDimensiones(Recipiente tambo)
    {   
        return (this.radio == tambo.getRadio() && this.altura == tambo.getAltura());
    }

    public boolean mismaCapacidad(Recipiente tambo)
    {
        return (capacidad() == tambo.capacidad());
    }

    public boolean contieneMas(Recipiente tambo)
    {
        return (this.capacidadActual > tambo.getCapacidadActual());
    }

    public boolean cabeMas(Recipiente tambo)
    {
        return (capacidadRestante() > tambo.capacidadRestante());
    }

    public Recipiente creaContenedorJusto()
    {
        Recipiente contenedor = new Recipiente(this.nombreRecipiente, this.radio, this.capacidadActual/(PI*(this.radio * this.radio)));
        contenedor.capacidad();
        return contenedor;
    }

    public String muestra()
    {
        return String.format
        (
            "\n+---------------------------------------+\n" +
            "| %-37s |\n" +
            "+-------------------------+-------------+\n" +
            "| Radio (cm)              |%s%12.3f%s |\n" +
            "| Altura (cm)             |%s%12.3f%s |\n" +
            "| Capacidad (cm3)         |%s%12.3f%s |\n" +
            "| Cantidad actual (cm3)   |%12.3f |\n" +
            "| Cantidad restante (cm3) |%s%12.3f%s |\n" +
            "| ¿Está lleno?            |%12b |\n" +
            "| ¿Está vacío?            |%12b |\n" +
            "+-------------------------+-------------+\n",
            this.nombreRecipiente, GREEN, this.radio, RESET, GREEN, this.altura, RESET, GREEN, capacidad(), RESET, this.capacidadActual, RED, capacidadRestante(), RESET, estaLleno(), estaVacio()
        );
    }
}

