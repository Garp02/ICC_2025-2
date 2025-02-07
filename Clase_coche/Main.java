public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("+------------------------------+");
        System.out.println("| Bienvenidos a la clase coche |");
        System.out.println("+-------------------------------+");
        coche coche1 = new coche("Ford", "Fiesta", 2010);
        coche coche2 = new coche("Chevrolet", "Camaro", 2015);
        coche1.mostrar_informacion();
        coche2.mostrar_informacion();
        if(coche1.acelerar(50) > 0)
        {
            System.out.println("El coche 1 ha acelerado a 50 km/h.");
        }
        else
        {
            System.out.println("El coche 1 no ha podido acelerar.");
        }
    }
}
