public class coche
{
    //Atributos de la clase coche
    private String marca;
    private String modelo;
    private int year;
    private int velocidad;
    
    //Clase constructor
    public coche(String marca, String modelo, int year)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        velocidad = 0;
    }
    
    //Métodos de la clase
    public int acelerar(int cambio)
    {
        this.velocidad += cambio;
        return this.velocidad;
    }
    
    public int frenar(int cambio)
    {
        if(this.velocidad > 0)
        {
            if(this.velocidad < cambio)
            {
                this.velocidad = 0;
            }
            else
            {
                this.velocidad -= cambio;
            }
        }
        
        else
        {
            System.out.println("\nEl coche está detenido.\n");
        }
        
        return this.velocidad;
    }
    
    public void mostrar_informacion()
    {
        System.out.println("\nMarca: " + marca);
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nAño: " + year);
        System.out.println("\nVelocidad: " + this.velocidad + " km/h");
    }
}
