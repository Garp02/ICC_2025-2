public class Reloj 
{
    // Atributos
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private Manecilla manecillaHora;
    private Manecilla manecillaMinuto;
    private Manecilla manecillaSegundo;

    // Constructor
    public Reloj(int hora, int minuto, int segundo)
    {
        this .manecillaHora = new Manecilla(hora);
        this .manecillaMinuto = new Manecilla(minuto);
        this .manecillaSegundo = new Manecilla(segundo);
    }

    // Métodos de acceso
    public int getHora()
    {
        return this.manecillaHora.getValor();
    }

    public int getMinuto()
    {
        return this.manecillaMinuto.getValor();
    }

    public int getSegundo()
    {
        return this.manecillaSegundo.getValor();
    }

    // Métodos mutantes
    public void setHora(int hora)
    {
        this.manecillaHora.setValor(hora);
    }

    public void setMinuto(int minuto)
    {
        this.manecillaMinuto.setValor(minuto);
    }

    public void setSegundo(int segundo)
    {
        this.manecillaSegundo.setValor(segundo);
    }

    // Métodos de clase
    public void avanzarHora(int horas)
    {
        setHora((this.manecillaHora.getValor() + horas) % 24);
    }

    public void avanzarMinuto(int minutos)
    {
        setMinuto(this.manecillaMinuto.getValor() + minutos);

        while(this.manecillaMinuto.getValor() >= 60)
        {
            this.manecillaMinuto.setValor(this.manecillaMinuto.getValor() - 60);
            avanzarHora(1);
        }
    }

    public void avanzarSegundo(int segundos)
    {
        setSegundo(this.manecillaSegundo.getValor() + segundos);

        while(this.manecillaSegundo.getValor() >= 60)
        {
            this.manecillaSegundo.setValor(this.manecillaSegundo.getValor() - 60);
            avanzarMinuto(1);
        }
    }

    public void fijarHora(int hora, int minuto, int segundo)
    {
        setHora(hora % 24);
        setMinuto(minuto % 60);
        setSegundo(segundo % 60);
    }

    public String darHora()
    {
        return String.format(
        "%s%02d:%02d:%02d%s", 
        GREEN, this.manecillaHora.getValor(), 
        this.manecillaMinuto.getValor(), 
        this.manecillaSegundo.getValor(), RESET);
    }
}
