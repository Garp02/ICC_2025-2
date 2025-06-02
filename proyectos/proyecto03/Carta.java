import java.util.Random;

public class Carta 
{
    private final int TAM = 3;
    private final int[][] posiciones = { {0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2} };
    private char[][] matriz;
    private static char[] simbolos = {'x', 'o'};
    private static Random rand = new Random();

    public Carta() 
    {
        matriz = new char[TAM][TAM];
        limpiar();
        aplicarSimbolosAleatorios();
    }

    public Carta(char[] DosSimbolos)
    {
        matriz = new char[TAM][TAM];
        limpiar();
        
        for (int i = 0; i < 5; i++) 
        {
            int fila = posiciones[i][0];
            int col = posiciones[i][1];
            matriz[fila][col] = DosSimbolos[i];
        }
    }
    
    public char[][] getMatriz() 
    {
        return matriz;
    }

    private void limpiar() 
    {
        for (int i = 0; i < TAM; i++) 
        {
            for (int j = 0; j < TAM; j++) 
            {
                matriz[i][j] = ' ';
            }
        }
    }

    private void aplicarSimbolosAleatorios() 
    {
        for (int i = 0; i < posiciones.length; i++)
        {
            int fila = posiciones[i][0];
            int col = posiciones[i][1];
            int indiceSimbolo = rand.nextInt(simbolos.length);
            char simbolo = simbolos[indiceSimbolo];
            matriz[fila][col] = simbolo;
        }
    }

    public int compararCon(Carta otra) 
    {
        int dif = 0;
        for (int i = 0; i < posiciones.length; i++) 
        {
            int fila = posiciones[i][0];
            int col = posiciones[i][1];
            if (this.matriz[fila][col] != otra.matriz[fila][col])
            {
                dif++;
            }
        }

        return dif;
    }

    public boolean aceptarCarta(Carta otra) 
    {
        return compararCon(otra) <= 1;
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

    public String toString() 
    {
        String texto = "";
        for (int i = 0; i < TAM; i++) 
        {
            for (int j = 0; j < TAM; j++) 
            {
                texto += matriz[i][j] + " ";
            }

            texto += "\n";
        }

        return texto;
    }
}
