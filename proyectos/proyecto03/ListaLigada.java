public class ListaLigada 
{
    private class Nodo 
    {
        Carta carta;
        Nodo siguiente;

        Nodo(Carta carta) 
        {
            this.carta = carta;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;
    private int longitud;

    public void insertar(Carta carta) 
    {
        Nodo nuevo = new Nodo(carta);
        if (cabeza == null) 
        {
            cabeza = nuevo;
        }

        else 
        {
            Nodo actual = cabeza;
            while (actual.siguiente != null) 
            {
                actual = actual.siguiente;
            }
            
            actual.siguiente = nuevo;
        }

        longitud++;
    }

    public boolean verificarSecuencia() 
    {
        if (cabeza == null || cabeza.siguiente == null) 
        {
            return true;
        }
    
        Nodo actual = cabeza;
    
        while (actual.siguiente != null) 
        {
            if (actual.carta.aceptarCarta(actual.siguiente.carta) == false) 
            {
                return false;
            }
            
            actual = actual.siguiente;
        }

        return true;
    }

    public Carta obtenerUltima() 
    {
        if (cabeza == null)
        { 
            return null;
        }

        Nodo actual = cabeza;
        
        while (actual.siguiente != null) 
        {
            actual = actual.siguiente;
        }
        
        return actual.carta;
    }

    public void vaciar() 
    {
        cabeza = null;
        longitud = 0;
    }

    public void imprimir() 
    {
        Nodo actual = cabeza;
        int i = 1;
        while (actual != null) 
        {
            System.out.println(i);
            actual.carta.imprimir();
            System.out.println();
            actual = actual.siguiente;
            i++;
        }
    }

    public int longitud()
    {
        return longitud;
    }

}