public class Main
{
    public static void main(String[] arg)
    {
        coche coche1 = new coche("Ford", "Fiesta", 2010);
        coche1.mostrar_informacion();
        System.out.println("¿Desea acelerar? [S/N]: S");
        char respuesta = 'S';
        if(respuesta == 's' || respuesta == 'S')
        {
            coche1.acelerar(100);
            coche1.mostrar_informacion();
        }
        
        else
        {
            System.out.println("No se aceleró el coche");
        }
    }
}
