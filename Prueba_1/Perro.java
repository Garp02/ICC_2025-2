package Prueba_1;

//Esta es la clase perro 
public class Perro
{
    //Estos son los atributos de la clase perro.
    public String nombre;
    public String raza;
    public byte edad;
    public float peso;
    public String color;
    public String sexo;
    public String dueno;
    
    //Estos son los métodos de la clase perro
    public void ladrar()
    {
        System.out.println("\n" + nombre + " está ladrando.\n");
    }
    
    public void dormir()
    {
        System.out.println("\n" + nombre + " está durmiendo.\n");
    }
    
    void comer()
    {
        System.out.println("\n" + nombre + " está comiendo.\n");
    }
    
    public void jugar()
    {
        System.out.println("\n" + nombre + " está jugando.\n");
    }
    
    public void mostrarDueno()
    {
        System.out.println("\n" + nombre + " pertenece a " + dueno + ".\n");
    }
    
    public String setnombre(String nuevoNombre)
    {
        this.nombre = nuevoNombre;
        return this.nombre;
    }
    
    public void getNombre()
    {
        System.out.println(setnombre(nombre));
    } 
    
    //Este es el constructor de la clase perro
    public Perro(String nombre, String raza, byte edad, float peso, String color, String sexo, String dueno)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.sexo = sexo;
        this.dueno = dueno;
    }
}