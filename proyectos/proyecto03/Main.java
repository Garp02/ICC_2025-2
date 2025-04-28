package Programas.proyectos.proyecto03;

import java.util.Scanner;
// import java.util.Random;

public class Main
{
    public static void main (String[] PikAPerro)
    {
        
        Scanner scanner = new Scanner(System.in);
        int opcionRepeticion = 1;
        do
        {
            System.out.println(" \n\t\tPick-a-Perro\n");




            System.out.print("\n¿Desea volver a jugar? [1 = Sí, 0 = No]: ");
            opcionRepeticion = scanner.nextInt();

        }
        while (opcionRepeticion != 0);
        
        System.out.println(" \n\t\tGracias por jugar\n");
        scanner.close();
    }
}