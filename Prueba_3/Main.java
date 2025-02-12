package Prueba_3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Ingrea un número entero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        if(numero > 0)
        {
            System.out.println("\nEl número " + numero + " es mayor a cero.\n");
        }
        
        else
        {
            System.out.println("\nEl número " + numero + " ingresado es negativo.\n");
        }
        
        
        
    }
}