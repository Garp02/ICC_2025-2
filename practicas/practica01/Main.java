/*
Programa: práctica 1
Descripción: Calculadora básica con cinco operaciones
Autor: Ibrahim Munive Ramírez
Número de cuenta: 424106083
Fecha: 11/02/2025
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n==== Calculadora ====\n");
        System.out.println("+-------------------+");
        System.out.println("|                   |");
        System.out.println("|    Syntax ERROR   |");
        System.out.println("|                   |");
        System.out.println("+-------------------+");
        System.out.println("|                   |");
        System.out.println("| 7  8  9   e  b  + |");
        System.out.println("| 4  5  6   i  x  - |");
        System.out.println("| 1  2  3   0  /  = |");
        System.out.println("+-------------------+\n\n");
        System.out.print("Operaciones disponibles:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Binario\n\nElige una opción: ");
        
        int opcion = scanner.nextInt();
        
        if (opcion == 1)
        {
            // Suma
            System.out.print("Ingresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            System.out.println("\nLa suma de " + numero1 + " y " + numero2 + " es: " + (numero1 + numero2) + "\n");
        }
        
        else if (opcion == 2)
        {
            // Resta
            System.out.print("Ingresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            System.out.println("\nLa resta de " + numero1 + " y " + numero2 + " es: " + (numero1 - numero2) + "\n");
        }
        
        else if (opcion == 3)
        {
            // Multiplicación
            System.out.print("Ingresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            System.out.println("\nLa multiplicación de " + numero1 + " y " + numero2 + " es: " + (numero1 * numero2) + "\n");
        }
        
        else if (opcion == 4)
        {
            // División
            System.out.print("Ingresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            if (numero2 == 0)
            {
                System.out.println("\nError: No se puede dividir entre cero.\n");
            }
            
            else
            {
                System.out.println("\nLa división de " + numero1 + " y " + numero2 + " es: " + (numero1 / numero2) + "\n");
            }
        }
        
        else if (opcion == 5)
        {
            // Binario
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            
            String binario = Integer.toBinaryString(numero);
            
            System.out.println("\nEl número " + numero + " en binario es: " + binario + "\n");
        }
        
        else
        {
            // Opción no válida
            System.out.println("\nError: Opción no válida.\n");
        }
        
        scanner.close();
    }    
}
