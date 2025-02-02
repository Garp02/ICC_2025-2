package Prueba_1;

//Esta es la clase perro 
public class Perro
{
    //Estos son los atributos de la clase perro. En total son 6.
    String nombre;
    String raza;
    byte edad;
    float peso;
    String color;
    String sexo;
    
    //Estos son los métodos de la clase perro
    void ladrar()
    {
        System.out.println("\n" + nombre + " está ladrando.\n");
    }
    
    void dormir()
    {
        System.out.println("\n" + nombre + " está durmiendo.\n");
    }
    
    void comer()
    {
        System.out.println("\n" + nombre + " está comiendo.\n");
    }
    
    void jugar()
    {
        System.out.println("\n" + nombre + " está jugando.\n");
    }
    
    //Este es el constructor de la clase perro
    public Perro(String nombre, String raza, byte edad, float peso, String color, String sexo)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.sexo = sexo;
    }
}