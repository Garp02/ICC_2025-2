//Este es un intento de crear un programa con clases en Java
package Prueba_1;

public class Prueba_1
{
    public static void main(String[] args)
    {
        //Creamos cuatro objetos de la clase perro:
        Perro perro1 = new Perro("Jack", "Schnauzer", (byte)13, 9.0f, "Sal pimienta", "Macho", "Zoe");
        Perro perro2 = new Perro("Hanook", "Husky", (byte)5, 17.3f, "Blanco", "Macho", "Montserrat");
        Perro perro3 = new Perro("Lua", "Golden Retriever", (byte)2, 15.5f, "Dorado", "Hembra", "Luis");
        Perro perro4 = new Perro("Río", "Golden Retriever", (byte)2, 20.0f, "Dorado", "Macho", "Carlos");
        
        //Invocamos los métodos de la clase perro
        perro1.ladrar();
        perro1.dormir();
        
        perro2.comer();
        perro2.jugar();
        
        perro3.ladrar();
        
        perro4.dormir();
        
        perro2.mostrarDueno();
        perro2.setnombre("Ñak");
        //perro2.getNombre();
        perro2.jugar();
    }
}