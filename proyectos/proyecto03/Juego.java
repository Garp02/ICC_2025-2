import java.util.Scanner;

public class Juego 
{
    private Carta[] mesa;
    private ListaLigada secuenciaJugador;
    private Scanner scanner;
    private int jugadores;
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";

    public Juego(int jugadores) 
    {
        this.jugadores = jugadores;
        scanner = new Scanner(System.in);
    }

    public void jugarRonda() 
    {
        boolean repetir = true;

        while (repetir) 
        {
            // Preparar nueva mesa y mazo
            mesa = new Carta[30];
            for (int i = 0; i < 30; i++) 
            {
                mesa[i] = new Carta();
            }

            secuenciaJugador = new ListaLigada();
            secuenciaJugador.insertar(new Carta()); // carta inicial

            System.out.println("\nTu carta inicial:");
            imprimirSecuenciaJugador();

            if (jugadores == 1) 
            {
                jugarTurnoHumano();
            } 
            
            else 
            {
                System.out.println("\nIniciando ronda con " + jugadores + " jugadores (1 humano y " + (jugadores - 1) + " artificiales).\n");

                int[] puntajesArtificiales = new int[jugadores - 1];
                Thread[] artificiales = new Thread[jugadores - 1];

                for (int i = 0; i < artificiales.length; i++) 
                {
                    artificiales[i] = new Thread(new JugadorArtificial(i + 1, mesa, puntajesArtificiales, i));
                    artificiales[i].start();
                }
                
                jugarTurnoHumano();
                for (int i = 0; i < artificiales.length; i++) 
                {
                    try 
                    {
                        artificiales[i].join();
                    } 
                    
                    catch (InterruptedException elmysikuel) 
                    {
                        System.out.println("Error esperando al jugador artificial #" + (i + 1));
                    }
                }

                for (int i = 0; i < jugadores - 1; i++) 
                {
                    System.out.println("Jugador artificial #" + (i + 1) + " obtuvo " + puntajesArtificiales[i] + " cartas.");
                }
            }

            // Por si se quiere jugar otra vez
            System.out.print("\n¿Deseas jugar otra ronda? [1 = Sí, 0 = No]: ");
            int opcion = scanner.nextInt();
            repetir = (opcion == 1);
        }

        System.out.println("\nGracias por jugar.");
    }

    private void imprimirMesaEnTablero() 
    {
        int columnas = 5; // cartas por fila

        for (int i = 0; i < mesa.length; i += columnas) 
        {
            int fin = Math.min(i + columnas, mesa.length);

            // Línea de encabezados
            for (int j = i; j < fin; j++) 
            {
                if (mesa[j] != null) 
                {
                    System.out.printf("  #%02d ", j);
                } 
                
                else 
                {
                    System.out.print(" (vacia) ");
                }
            }

            System.out.println();

            for (int fila = 0; fila < 3; fila++) 
            {
                for (int j = i; j < fin; j++) 
                {
                    if (mesa[j] != null) 
                    {
                        char[][] m = mesa[j].getMatriz();
                        String color = (j % 2 == 0) ? RESET : GREEN; // blanco o verde
                        System.out.print(color);
                        for (int col = 0; col < 3; col++) 
                        {
                            System.out.print(m[fila][col] + " ");
                        }
                        System.out.print(RESET); // reset
                    } 
                    
                    else 
                    {
                        System.out.print("      ");
                    }
                }
                System.out.println();
            }

            System.out.println(); // separación entre bloques
        }
    }

    private void imprimirSecuenciaJugador() 
    {
        System.out.println("\nTus cartas actuales:");
        secuenciaJugador.imprimir();
    }

    private boolean hayCartaCompatible(Carta ultima) 
    {
        for (int i = 0; i < mesa.length; i++) 
        {
            if (mesa[i] != null && ultima.aceptarCarta(mesa[i])) 
            {
                return true;
            }
        }
        return false;
    }

    private void jugarTurnoHumano() 
    {
        boolean jugando = true;

        while (jugando) 
        {
            imprimirMesaEnTablero();
            System.out.print("Elige una carta por número (-1 para terminar): ");
            int opcion = scanner.nextInt();

            if (opcion == -1) 
            {
                boolean esValida = secuenciaJugador.verificarSecuencia();
                boolean pudoHaberSeguido = hayCartaCompatible(secuenciaJugador.obtenerUltima());

                if (!esValida || pudoHaberSeguido) 
                {
                    System.out.println("Secuencia inválida o pudiste haber tomado más cartas. Pierdes todas.");
                    secuenciaJugador.vaciar();
                } 

                else 
                {
                    System.out.println("Secuencia válida. ¡Cartas ganadas!");
                }
                
                jugando = false;
            } 
            
            else if (opcion >= 0 && opcion < mesa.length && mesa[opcion] != null) 
            {
                Carta seleccionada = mesa[opcion];

                secuenciaJugador.insertar(seleccionada);
                mesa[opcion] = null;
                System.out.println("\nCarta agregada (la validación se hará al final).");
                imprimirSecuenciaJugador();
                System.out.println("\nMesa actualizada:");
                imprimirMesaEnTablero();
            } 
            
            else 
            {
                System.out.println("Opción inválida.");
            }
        }

        System.out.println("\nTu secuencia final fue:");
        secuenciaJugador.imprimir();
        System.out.println("Jugador humano obtuvo " + secuenciaJugador.longitud() + " cartas.");

    }
}