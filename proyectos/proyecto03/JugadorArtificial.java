public class JugadorArtificial implements Runnable 
{
    private int id;
    private int[] puntajes;
    private int indicePuntaje;
    private Carta[] mesa;
    private ListaLigada secuencia;

    public JugadorArtificial(int id, Carta[] mesa, int[] puntajes, int indicePuntaje) 
    {
        this.id = id;
        this.mesa = mesa;
        this.puntajes = puntajes;
        this.indicePuntaje = indicePuntaje;
        this.secuencia = new ListaLigada();
    }

    public void run() 
    {
        System.out.println("Jugador artificial #" + id + " ha comenzado su turno.");

        // Agregar carta inicial
        secuencia.insertar(new Carta());

        boolean jugando = true;

        while (jugando) 
        {
            Carta ultima = secuencia.obtenerUltima();
            boolean tomoCarta = false;

            synchronized (mesa) // sincroniza el acceso a la mesa
            {
                for (int i = 0; i < mesa.length; i++) 
                {
                    if (mesa[i] != null && ultima.aceptarCarta(mesa[i])) 
                    {
                        secuencia.insertar(mesa[i]);
                        mesa[i] = null;
                        tomoCarta = true;
                        System.out.println("Jugador artificial #" + id + " tomó la carta #" + i);
                        break; // toma una sola carta por turno
                    }
                }
            }

            if (!tomoCarta) 
            {
                jugando = false; // termina si no encontró carta compatible
            } 
            
            else 
            {
                try 
                {
                    Thread.sleep(5000);
                } 
                catch (InterruptedException otromysikuel) 
                {
                    System.out.println("Jugador artificial #" + id + " fue interrumpido.");
                }
            }
        }

        // Verificación de secuencia al final
        if (secuencia.verificarSecuencia()) 
        {
            System.out.println("Jugador artificial #" + id + " tiene una secuencia válida. ¡Cartas ganadas!");
        } 
        
        else 
        {
            System.out.println("Jugador artificial #" + id + " hizo trampa o se equivocó. Pierde sus cartas.");
            secuencia.vaciar();
        }

        System.out.println("Secuencia final del jugador artificial #" + id + ":");
        secuencia.imprimir();
        
        int cartasObtenidas = secuencia.longitud();
        puntajes[indicePuntaje] = cartasObtenidas;
        System.out.println("Jugador artificial #" + id + " obtuvo " + cartasObtenidas + " cartas.");

        System.out.println("---- Fin del turno del jugador artificial #" + id + " ----\n");

    }
}