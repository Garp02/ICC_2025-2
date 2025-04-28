package Programas.proyectos.proyecto03;

public class ListaLigada
{
    // Definición de la clase Nodo como clase interna privada
    private class Nodo
    {
        private String elemento;
        private Nodo siguiente;

        public Nodo(String elemento)
        {
            this.elemento = elemento;
            this.siguiente = null;
        }

        public String getElemento()
        {
            return elemento;
        }

        public Nodo getSiguiente()
        {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente)
        {
            this.siguiente = siguiente;
        }
    }

    private Nodo cabeza;
    private int longitud;
    
    // Constructor de la lista ligada.
    public ListaLigada()
    {
        this.cabeza = null;
        this.longitud = 0;
    }

    // Inserta un elemento al final de la lista.
    public void insertar(String elemento) 
    {
        Nodo nuevoNodo = new Nodo(elemento);
        if (cabeza == null) 
        {
            cabeza = nuevoNodo;
        } 
        
        else 
        {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null)
            {
                actual = actual.getSiguiente();
            }
            
            actual.setSiguiente(nuevoNodo);
        }
        longitud++;
    }
    
    // Elimina la primera ocurrencia del elemento especificado.
    public boolean eliminar(String elemento) 
    {
        if (cabeza == null) 
        {
            return false;
        }

        if (cabeza.getElemento() == elemento) 
        {
            cabeza = cabeza.getSiguiente();
            longitud--;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) 
        {
            if (actual.getSiguiente().getElemento() == elemento) 
            {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                longitud--;
                return true;
            }
            
            actual = actual.getSiguiente();
        }

        return false;
    }
    
    // Inserta un elemento en el índice especificado.
    public boolean insertarIndice(String elemento, int indice) 
    {
        // Validar que el índice esté dentro del rango válido
        if (indice < 0 || indice >= longitud) 
        {
            return false;
        }

        Nodo nuevoNodo = new Nodo(elemento);

        // Caso especial: insertar al inicio
        if (indice == 0) 
        {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            longitud++;
            return true;
        }

        // Insertar en una posición intermedia
        Nodo actual = cabeza;
        for (int i = 0; i < indice - 1; i++) 
        {
            actual = actual.getSiguiente();
        }

        nuevoNodo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevoNodo);
        longitud++;
        return true;
    }

    // Devuelve una representación en cadena de la lista.
    public String toString() 
    {
        if (cabeza == null) 
        {
            return "Lista vacía";
        }

        String resultado = "Lista: ";
        Nodo actual = cabeza;
        while (actual != null) 
        {
            resultado += actual.getElemento();
            if (actual.getSiguiente() != null) 
            {
                resultado += " -> ";
            }
            actual = actual.getSiguiente();
        }
        return resultado;
    }
}