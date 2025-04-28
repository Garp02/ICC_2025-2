package Programas.proyectos.proyecto03;
import java.util.Arrays;
import java.util.Random;

public class Carta 
{
    private char[][] matriz;
    private final int TAM = 3;
    private final int[][] posiciones = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2} };

    private char[] simbolos = {'x', 'o', '*', '#', '@', '&', '$'};
    private Random rand;

    public Carta()
    {
        matriz = new char[TAM][TAM];
        rand = new Random();
        limpiar();
        aplicarSimbolosAleatorios();
    }

    private void limpiar()
    {
        for (int i = 0; i < TAM; i++)
        {
            Arrays.fill(matriz[i], ' ');
        }
    }

    private void aplicarSimbolosAleatorios() 
    {
        for (int[] pos : posiciones) 
        {
            int fila = pos[0];
            int col = pos[1];
            char simboloRandom = simbolos[rand.nextInt(simbolos.length)];
            matriz[fila][col] = simboloRandom;
        }
    }

    public void siguienteEstado() 
    {
        limpiar();
        aplicarSimbolosAleatorios();
    }

    public void imprimir() 
    {
        for (int i = 0; i < TAM; i++) 
        {
            for (int j = 0; j < TAM; j++) 
            {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
