public class Mensaje
{
    // Métodos de clase 
    public static String descifraNulo(String original, int n)
    {
        if (n <= 0)
        {
            return "";
        }
        
        String mensajeOculto = "";
        boolean enPalabra = false;
        boolean encontrado = false;
        int posicionEnPalabra = 0;
        char caracterBuscado = 0;
        
        for (int i = 0; i < original.length(); i++) 
        {
            char c = original.charAt(i);

            if (c != ' ') 
            {
                if (enPalabra == false) 
                {
                    enPalabra = true;
                    posicionEnPalabra = 0;
                    encontrado = false;
                }

                posicionEnPalabra++;
                
                if (posicionEnPalabra == n) 
                {
                    caracterBuscado = c;
                    encontrado = true;
                }
            } 
            
            else 
            {
                if (enPalabra == true)
                {
                    if (encontrado) 
                    {
                        mensajeOculto += caracterBuscado;
                    }

                    enPalabra = false;
                }
            }
        }
        
        if (enPalabra && encontrado == true)
        {
            mensajeOculto += caracterBuscado;
        }
        
        return mensajeOculto;
    }

    public static String descifraNuloEspacios(String mensaje)
    {
        String mensajeOculto = "";
        int contadorEspacios = 0;

        for(int i = mensaje.length() - 1; i >= 0; i--)
        {
            if(mensaje.charAt(i) == ' ')
            {
                contadorEspacios ++;
            }
            i--;
        }

        mensajeOculto = Mensaje.descifraNulo(mensaje, contadorEspacios); 
    
        return mensajeOculto;
    }


    // Método auxiliar para contieneNombre
    public static String darFormato(String mensaje)
    {
        mensaje = mensaje.replaceAll("[\\s,.;:¡!¿?'\"]", "");
        mensaje = mensaje.toLowerCase();
        mensaje = mensaje.replaceAll("á", "a");
        mensaje = mensaje.replaceAll("é", "e");
        mensaje = mensaje.replaceAll("í", "i");
        mensaje = mensaje.replaceAll("ó", "o");
        mensaje = mensaje.replaceAll("ú", "u");

        return mensaje;
    }

    public static boolean contieneNombre(String mensaje, String nombre)
    {
        // System.out.println(nombre);
        // System.out.println(mensaje);

        nombre = Mensaje.darFormato(nombre);
        System.out.println(nombre);
        mensaje = Mensaje.darFormato(mensaje);
        System.out.println(mensaje);
        for(int i = 0; i < mensaje.length(); i++)
        {
            if(mensaje.charAt(i) == nombre.charAt(0))
            {
                int j = 0;

                while(j < nombre.length() && mensaje.charAt(i + j) == nombre.charAt(j)) j++;

                if(j == nombre.length()) return true;
            }
        }

        return false;
    }

    public static String descifraPalabrasMarcadas(String m, String e)
    {
        return e;
    }

    public static String descifraLetrasMarcadas(String m, String e)
    {
        return e;
    }
}
