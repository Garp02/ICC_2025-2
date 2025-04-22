/* 
Programa: práctica 2
Descripción: creación de reloj con horas, minutos y segundos. 
Autor: Ibrahim Munive Ramírez
Fecha: 21 de marzo de 2025
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] reloj)
    {
        int opcionRepetir = 1;
        
        Scanner scanner = new Scanner(System.in);
        Reloj reloj1 = new Reloj(0,0,0);

        do
        {
            System.out.println("\n\t\t  Reloj \n");
            System.out.println("\t\t" + reloj1.darHora());

            System.out.println("\n1. Actualizar horas");
            System.out.println("\n2. Actualizar minutos");
            System.out.println("\n3. Actualizar segundos");
            System.out.println("\n4. Establecer hora");

            System.out.print("\nEscoja una opción [1, 2, 3, 4]: ");
            
            int opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1:
                System.out.println("\n\tActualizar horas");
                System.out.println("\nHora previa: " + reloj1.darHora());

                System.out.print("\nIngrese las horas a actualizar: ");
                int horas = scanner.nextInt();

                reloj1.avanzarHora(horas);
                System.out.println("\nHora actualizada: " + reloj1.darHora());
                break;
                
                case 2:
                System.out.println("\n\tActualizar minutos");
                System.out.println("\nHora previa: " + reloj1.darHora());

                System.out.print("\nIngrese los minutos a actualizar: ");
                int minutos = scanner.nextInt();
                
                reloj1.avanzarMinuto(minutos);
                System.out.println("\nHora actualizada: " + reloj1.darHora());
                break;
                
                case 3:
                System.out.println("\n\tActualizar segundos");
                System.out.println("\nHora previa: " + reloj1.darHora());
                
                System.out.print("\nIngrese los segundos a actualizar: ");
                int segundos = scanner.nextInt();
                
                reloj1.avanzarSegundo(segundos);
                System.out.println("\nHora actualizada: " + reloj1.darHora());
                break;
                
                case 4:
                System.out.println("\n\tEstablecer hora");

                System.out.println("\nHora previa: " + reloj1.darHora());
                System.out.print("\nIngrese la hora: ");
                int hora = scanner.nextInt();
                
                System.out.print("\nIngrese el minuto: ");
                int minuto = scanner.nextInt();
                
                System.out.print("\nIngrese el segundo: ");
                int segundo = scanner.nextInt();
                
                reloj1.fijarHora(hora, minuto, segundo);
                System.out.println("\nHora actualizada: " + reloj1.darHora());
                break;
                
                default:
                System.out.println("\n\tError. Opción no válida\n");

            }

            System.out.print("\n¿Desea realizar otra operación? [1 = Sí, 0 = No]: ");
            opcionRepetir = scanner.nextInt();
        }
        while (opcionRepetir != 0);

        System.out.println("\n\tFin del programa\n");
        
        scanner.close();
    }
}