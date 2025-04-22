public class Main 
{
    public static void main(String[] listas) 
    {
        // Crear una nueva lista
        ListaLigada lista = new ListaLigada();
        System.out.println(lista);

        // Insertar 5 elementos
        for (int i = 1; i <= 5; i++) 
        {
            lista.insertar(i);
        }
        System.out.println(lista);

        // Insertar un elemento en un índice válido (índice 2)
        System.out.println("\nInsertando 10 en el índice 2:");
        lista.insertarIndice(10, 2);
        System.out.println(lista);

        // Intentar insertar en un índice inválido
        System.out.println("\nIntentando insertar 20 en un índice inválido (10):");
        boolean resultado = lista.insertarIndice(20, 10);
        System.out.println("Resultado de la inserción: " + resultado);
        System.out.println(lista);
    }
}