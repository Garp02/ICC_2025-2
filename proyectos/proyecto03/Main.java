import java.util.Scanner;

public class Main 
{
    public static void main(String[] PickAPerro) 
    {
        Scanner scanner = new Scanner(System.in);
        int jugadores = 0;

        while (true) 
        {
            System.out.println("\t\t Pick A Perro sin perros\n");
            
            System.out.println(" / \\__");
            System.out.println("(    @\\___");
            System.out.println(" /         O");
            System.out.println("/   (_____/");
            System.out.println("/_____/   U");
        
            System.out.print("\nIngresa la cantidad de jugadores (1 a 5): ");

            if (scanner.hasNextInt() == true) 
            {
                jugadores = scanner.nextInt();
                
                if (jugadores >= 1 && jugadores <= 5) 
                {    
                    break;
                }
                
                else
                {
                    System.out.println("Dato no compatible. El número de jugadores debe ser entre 1 y 5.");
                }
            } 
            
            else 
            {
                System.out.println("Entrada no válida.");
                scanner.next();
            }
        }

        Juego juego = new Juego(jugadores);
        juego.jugarRonda();
        scanner.close();
    }
}