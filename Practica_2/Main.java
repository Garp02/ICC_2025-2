/* 
Programa: práctica 2
Descripción: creación de reloj con horas, minutos y segundos. 
Autor: Ibrahim Munive Ramírez
Fecha: 21 de marzo de 2025
*/

public class Main
{
    public static void main(String reloj[])
    {
    }

    public class Reloj
    {
        private int hora;
        private int minuto;
        private int segundo;
    
        // Constructor
        public Reloj(int hora, int minuto, int segundo)
        {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    
        // Métodos de acceso
        public int getHora()
        {
            return this.hora;
        }
        
        public int getMinuto()
        {
            return this.minuto;
        }
    
        public int getSegundo()
        {
            return this.segundo;
        }
    
        // Métodos mutantes
        public void setHora(int hora)
        {
            this.hora = hora;
        }
    
        public void setMinuto(int minuto)
        {
            this.minuto = minuto;
        }
    
        public void setSegundo(int segundo)
        {
            this.segundo = segundo;
        }
    
    
        // Métodos de clase
        public String darHora(int hora, int minuto, int segundo)
        {
            return String.format("%02d:%02d:%02d", hora, minuto, segundo);
        }
    }
    
    public class CuerpoDeReloj
    {
        private String forma;
        private String color;
        private int radio;
    
        // Constructor
        public CuerpoDeReloj(String color, int radio)
        {
            this.color = color;
            this.radio = radio;
            this.forma = "Circular";
        }
        
        // Métodos de acceso
        public String getForma()
        {
            return this.forma;
        }
        
        public String getColor()
        {
            return this.color;
        }
    
        public int getRadios()
        {
            return this.radio;
        }
    
        // Métodos mutantes
        public void setColor(String color)
        {
            this.color = color;
        }
    
        public void setRadio(int radio)
        {
            this.radio = radio;
        }
    
    }
    
    public class Manecilla
    {
        
    
    }
    
}

// public class Reloj
// {
//     private int hora;
//     private int minuto;
//     private int segundo;

//     // Constructor
//     public Reloj(int hora, int minuto, int segundo)
//     {
//         this.hora = hora;
//         this.minuto = minuto;
//         this.segundo = segundo;
//     }

//     // Métodos de acceso
//     public int getHora()
//     {
//         return this.hora;
//     }
    
//     public int getMinuto()
//     {
//         return this.minuto;
//     }

//     public int getSegundo()
//     {
//         return this.segundo;
//     }

//     // Métodos mutantes
//     public void setHora(int hora)
//     {
//         this.hora = hora;
//     }

//     public void setMinuto(int minuto)
//     {
//         this.minuto = minuto;
//     }

//     public void setSegundo(int segundo)
//     {
//         this.segundo = segundo;
//     }


//     // Métodos de clase
//     public String darHora(int hora, int minuto, int segundo)
//     {
//         return String.format("%02d:%02d:%02d", hora, minuto, segundo);
//     }
// }

// public class CuerpoDeReloj
// {
//     private String forma;
//     private String color;
//     private int radio;

//     // Constructor
//     public CuerpoDeReloj(String color, int radio)
//     {
//         this.color = color;
//         this.radio = radio;
//         this.forma = "Circular";
//     }
    
//     // Métodos de acceso
//     public String getForma()
//     {
//         return this.forma;
//     }
    
//     public String getColor()
//     {
//         return this.color;
//     }

//     public int getRadios()
//     {
//         return this.radio;
//     }

//     // Métodos mutantes
//     public String setColor(String color)
//     {
//         this.color = color;
//     }

//     public int setRadio(int radio)
//     {
//         this.radio = radio;
//     }

// }

// public class Manecilla
// {
    

// }
