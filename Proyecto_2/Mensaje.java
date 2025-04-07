public class Mensaje
{
    // Métodos de clase 
    public static String descifraNulo(String original, int n)
    {
        if (n <= 0)
        {
            return "";
        }
        
        // Variables para recorrer el mensaje original
        String mensajeOculto = "";
        boolean enPalabra = false;
        boolean encontrado = false;
        int posicionEnPalabra = 0;
        char caracterBuscado = 0;
        
        // Recorrer el mensaje original
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
                    if (encontrado == true) 
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

        // Contar espacios al final del mensaje
        int i = mensaje.length() - 1;
        while(i >= 0 && mensaje.charAt(i) == ' ')
        {
            contadorEspacios++;
            i--;
        }

        // Si no hay espacios al final, retornar cadena vacía
        if(contadorEspacios == 0)
        {
            return "";
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
        nombre = Mensaje.darFormato(nombre);
        mensaje = Mensaje.darFormato(mensaje);
        for(int i = 0; i < mensaje.length(); i++)
        {
            if(mensaje.charAt(i) == nombre.charAt(0))
            {
                int j = 0;

                while(j < nombre.length() && (i + j) < mensaje.length() && mensaje.charAt(i + j) == nombre.charAt(j))
                {
                    j++;
                }

                if(j == nombre.length()) 
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static String descifraPalabrasMarcadas(String mensaje1, String mensaje2)
    {
        if(mensaje1 == null || mensaje2 == null || mensaje1.length() == 0 || mensaje2.length() == 0)
        {
            return "";
        }

        // Variables para recorrer los mensajes
        String mensajeOculto = "";
        int inicioM1 = 0;
        int inicioM2 = 0;
        int finM1 = 0;
        int finM2 = 0;
        
        while(inicioM1 < mensaje1.length() && inicioM2 < mensaje2.length())
        {
            // Encontrar el final de la palabra actual en mensaje1
            while(finM1 < mensaje1.length() && mensaje1.charAt(finM1) != ' ')
            {
                finM1++;
            }
            
            // Encontrar el final de la palabra actual en mensaje2
            while(finM2 < mensaje2.length() && mensaje2.charAt(finM2) != ' ')
            {
                finM2++;
            }
            
            // Extraer las palabras actuales
            String palabraM1 = mensaje1.substring(inicioM1, finM1);
            String palabraM2 = mensaje2.substring(inicioM2, finM2);
            
            // Comparar palabras sin distinguir mayúsculas/minúsculas
            if(palabraM1.equalsIgnoreCase(palabraM2) != true)
            {
                mensajeOculto = mensajeOculto + palabraM1 + " ";
            }
            
            // Avanzar a la siguiente palabra
            inicioM1 = finM1;
            inicioM2 = finM2;
            
            // Saltar espacios
            while(inicioM1 < mensaje1.length() && mensaje1.charAt(inicioM1) == ' ')
            {
                inicioM1++;
            }
            finM1 = inicioM1;
            
            while(inicioM2 < mensaje2.length() && mensaje2.charAt(inicioM2) == ' ')
            {
                inicioM2++;
            }
            finM2 = inicioM2;
        }
        
        // Eliminar el espacio final si existe
        if(mensajeOculto.length() > 0 && mensajeOculto.charAt(mensajeOculto.length() - 1) == ' ')
        {
            mensajeOculto = mensajeOculto.substring(0, mensajeOculto.length() - 1);
        }
        
        return mensajeOculto;
    }

    public static String descifraLetrasMarcadas(String mensaje1, String mensaje2)
    {
        if(mensaje1 == null || mensaje2 == null || mensaje1.length() == 0 || mensaje2.length() == 0)
        {
            return "";
        }
        
        String mensajeOculto = "";
        
        // Determinar la longitud mínima entre ambos mensajes
        int minLength = Math.min(mensaje1.length(), mensaje2.length());
        
        for(int i = 0; i < minLength; i++)
        {
            // Si los caracteres son diferentes, agregar el caracter del primer mensaje
            if(mensaje1.charAt(i) != mensaje2.charAt(i))
            {
                mensajeOculto = mensajeOculto + mensaje1.charAt(i);
            }
        }
        
        // Si el primer mensaje es más largo, agregar los caracteres restantes
        if(mensaje1.length() > minLength)
        {
            mensajeOculto = mensajeOculto + mensaje1.substring(minLength);
        }
        
        return mensajeOculto;
    }
}