package Prueba_2;

public class Cuenta_bancaria
{
    String titular;
    float saldo;
    
    float depositar()
    {
        System.out.print("Ingrese la cantidad a depositar: $");
        float cantidad = Float.parseFloat(System.console().readLine());
        
        saldo += cantidad;
        
        return saldo;
    }
    
    float retirar()
    {
        System.out.print("Ingrese la cantidad a retirar: $");
        float retiro = Float.parseFloat(System.console().readLine());
        
        if(retiro <= saldo)
        {
            saldo -= retiro;
            return saldo;
        }
        
        else
        {
            System.out.println("Saldo insuficiente.");
            return saldo;
        }
    }
    
    void consultar_saldo()
    {
        System.out.println("El saldo de la cuenta de " + titular + " es de: $" + saldo);
    }
    
    //Constructor de la clase Cuenta_bancaria
    public Cuenta_bancaria(String titular, float saldo)
    {
        this.titular = titular;
        this.saldo = saldo;
    }
}
