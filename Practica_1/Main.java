/*
 * Programa: práctica 1
 * Descripción: Calculadora básica con cinco operaciones
 * Autor: Ibrahim Munive Ramírez
 * Número de cuenta: 424106083
 * Fecha: 11 de febrero de 2025
 */

package Practica_1;

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
        System.out.println("| 7  8  9   e  %  + |");
        System.out.println("| 4  5  6   i  x  - |");
        System.out.println("| 1  2  3   0  /  = |");
        System.out.println("+-------------------+\n\n");
        System.out.print("Operaciones disponibles:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Binario\n\nElige una opción: ");
        
        int opcion = scanner.nextInt();
        
        switch(opcion)
        {
            //Suma
            case 1:
            System.out.print("Ingresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            System.out.println("\nLa suma de " + numero1 + " y " + numero2 + " es: " + (numero1 + numero2) + "\n");
            
            break;
            
            //Resta
            case 2:
            System.out.print("Ingresa un número real: ");
            numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            numero2 = scanner.nextDouble();
            
            System.out.println("\nLa resta de " + numero1 + " y " + numero2 + " es: " + (numero1 - numero2) + "\n");
            
            break;
            
            //Multiplicación
            case 3:
            System.out.print("Ingresa un número real: ");
            numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            numero2 = scanner.nextDouble();
            
            System.out.println("\nLa multiplicación de " + numero1 + " y " + numero2 + " es: " + (numero1 * numero2) + "\n");
            
            break;
            
            //División
            case 4:
            System.out.print("Ingresa un número real: ");
            numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            numero2 = scanner.nextDouble();
            
            if (numero2 == 0)
            {
                System.out.println("\nError: No se puede dividir entre cero.\n");
            }
            
            else
            {
                System.out.println("\nLa división de " + numero1 + " y " + numero2 + " es: " + (numero1 / numero2) + "\n");
            }
            
            break;
            
            case 5:
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            
            String binario = Integer.toBinaryString(numero);
            
            System.out.println("\nEl número " + numero + " en binario es: " + binario + "\n");
            
            break;
            
            //En caso de que el niño salvaje introduzca otra cosa
            default:
            System.out.println("\nError: Opción no válida.\n");
            break;
        }
        
        scanner.close();
    }    
}
