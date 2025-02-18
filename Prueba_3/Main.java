/*
Programa: práctica 1.1
Descripción: Calculadora básica con cinco operaciones
Autor: Ibrahim Munive Ramírez
Número de cuenta: 424106083
Fecha: 11/02/2025
*/

package Prueba_3;

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
            System.out.print("Ingresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            Calculadora calculadora = new Calculadora(numero1, numero2);
            System.out.println("\nSe seleccionó la operación suma.\n");
            System.out.println(numero1 + " + " + numero2 + " = " + calculadora.suma(numero1, numero2));
        }
        else if (opcion == 2)
        {
            System.out.print("\nIngresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            Calculadora calculadora = new Calculadora(numero1, numero2);
            System.out.println("\nSe seleccionó la operación resta.\n");
            System.out.println(numero1 + " - " + numero2 + " = " + calculadora.resta(numero1, numero2));
        }
        else if (opcion == 3)
        {
            System.out.print("\nIngresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            Calculadora calculadora = new Calculadora(numero1, numero2);
            System.out.println("\nSe seleccionó la operación multiplicación.\n");
            System.out.println(numero1 + " x " + numero2 + " = " + calculadora.multiplicacion(numero1, numero2));
        }
        else if (opcion == 4)
        {
            System.out.print("\nIngresa un número real: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingresa un número real: ");
            double numero2 = scanner.nextDouble();
            
            Calculadora calculadora = new Calculadora(numero1, numero2);
            System.out.println("\nSe seleccionó la operación división.\n");
            System.out.println(numero1 + " / " + numero2 + " = " + calculadora.division(numero1, numero2));
        }
        else if (opcion == 5)
        {
            System.out.print("\nIngresa un número entero: ");
            double numero1 = scanner.nextDouble();
            
            Calculadora calculadora = new Calculadora(numero1, 0);
            System.out.println("\nSe seleccionó la operación converisón binaria.\n");
            System.out.println("El número " + (int)numero1 + " en binario es: " + calculadora.binario(numero1) + "\n\n");
        }
        
        else
        {
            System.out.println("\nError: Opción no válida.\n");
        }
        
        scanner.close();
    }
}