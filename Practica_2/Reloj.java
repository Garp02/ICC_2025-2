public class Reloj 
{
    // Atributos
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
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
    public void avanzarHora(int horas)
    {
        setHora((this.hora + horas) % 24);
    }

    public void avanzarMinuto(int minutos)
    {
        setMinuto((this.minuto + minutos) % 60);
        
        if(this.minuto == 59)
        {
            avanzarHora(1);
        }
    }

    public void avanzarSegundo(int segundos)
    {
        setSegundo((this.segundo + segundos) % 60);

        if(this.segundo == 59)
        {
            avanzarMinuto(1);

            if(this.minuto == 59)
            {
                avanzarHora(1);
            }
        }
    }

    public void fijarHora(int hora, int minuto, int segundo)
    {
        setHora(hora % 24);
        setMinuto(minuto % 60);
        setSegundo(minuto % 60);
    }

    public String darHora()
    {
        return String.format(
        "%s%02d%s:%s%02d%s:%s%02d%s", 
        GREEN, this.hora, RESET, 
        RED, this.minuto, RESET, 
        YELLOW, this.segundo, RESET);
    }
}
