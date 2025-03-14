package Prueba_4;

import java.util.Scanner;

public class Excepciones
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nIngresa un número entero: ");
        
        while(scanner.hasNextInt() == false)
        {
            System.out.print("\nError: dato no compatible. \nIngresa un número entero: ");
            scanner.next();
        }
        
        int numero = scanner.nextInt();
        
        System.out.println("\nNúmero ingresado: " + numero);
        scanner.close();
    }    
}
