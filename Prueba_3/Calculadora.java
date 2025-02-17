package Prueba_3;

public class Calculadora 
{
    //Atributos de la clase
    public double numero1;
    public double numero2;
    
    //Método constructor
    public Calculadora(double numero1, double numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Métodos de la clase
    public double suma(double numero1, double numero2)
    {
        return numero1 + numero2;
    }
    
    public double resta(double numero1, double numero2)
    {
        return numero1 - numero2;
    }
    
    public double multiplicacion(double numero1, double numero2)
    {
        return numero1 * numero2;
    }
    
    public double division(double numero1, double numero2)
    {
        if(numero2 != 0)
        {
            return numero1 / numero2;
        }
        
        else
        {
            System.out.println("Error: Operación no definida.");
            return 0;
        }
    }
    
    public String binario(double numero1)
    {
        return Integer.toBinaryString((int)numero1);
    }
}
