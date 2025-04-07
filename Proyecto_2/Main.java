import java.util.Scanner;

public class Main
{
    public static void main(String[] cifrados)
    {
        Scanner scanner = new Scanner(System.in);

        int opcionRepetir = 1;
        do
        {
            System.out.println("\n\t\t Estenografía \n");

            System.out.println("\t 1. Descifra Nulo");
            System.out.println("\t 2. Descifra Nulo con espacios");
            System.out.println("\t 3. Contiene Nombre");
            System.out.println("\t 4. Descifra palabras marcadas");
            System.out.println("\t 5. Descifra letras marcadas");

            System.out.print("\nSeleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            while(opcion < 1 || opcion > 5)
            {
                System.out.println("\n\t Opción no válida");
                System.out.print("\nSeleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
                if(opcion >= 1 && opcion <= 5)
                {
                    break;
                }
            }

            switch(opcion)
            {
                case 1:
                System.out.print("\nIngrese un número no negativo: ");
                int numero = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ingrese el mensaje a descifrar: ");
                String mensaje1 = scanner.nextLine();

                System.out.println("El mensaje oculto es: " + Mensaje.descifraNulo(mensaje1, numero));

                break;

                case 2:
                System.out.print("\nIngrese el mensaje a descifrar: ");
                String mensaje2 = scanner.nextLine();

                System.out.println("El mensaje oculto es: " + Mensaje.descifraNuloEspacios(mensaje2));

                break;
                
                case 3:
                System.out.print("\nIngrese el mensaje a descifrar: ");
                String mensaje3 = scanner.nextLine();

                System.out.print("Ingrese el nombre a buscar: ");
                String nombre = scanner.nextLine();
                
                System.out.println("\n¿El mensaje contiene el nombre " + nombre + "? " + (Mensaje.contieneNombre(mensaje3, nombre) ? "Sí" : "No"));

                break;

                case 4:
                System.out.print("\nIngrese el mensaje: ");
                String mensaje4 = scanner.nextLine();

                System.out.print("Ingrese un segundo mensaje: ");
                String mensaje5 = scanner.nextLine();

                System.out.println("\nEl mensaje oculto es: " + Mensaje.descifraPalabrasMarcadas(mensaje4, mensaje5));

                break;

                case 5:
                System.out.print("\nIngrese el mensaje: ");
                String mensaje6 = scanner.nextLine();
                System.out.print("Ingrese un segundo mensaje: ");
                String mensaje7 = scanner.nextLine();

                System.out.println("\nEl mensaje oculto es: " + Mensaje.descifraLetrasMarcadas(mensaje6, mensaje7));

                break;

                default:
                System.out.println("\n\t Opción no válida");
            }

            System.out.print("\n¿Desea realizar otra operación? [1 = Sí, 0 = No]: ");
            opcionRepetir = scanner.nextInt();
        }
        while(opcionRepetir != 0);

        System.out.println("\n\t  Gracias por usar el programa\n");
    
        scanner.close();
    }
}