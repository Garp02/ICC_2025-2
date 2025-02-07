public class Cuenta_bancaria
{
    String titular;
    long saldo;
    
    long depositar()
    {
        System.out.print("Ingrese la cantidad a depositar: $");
        long cantidad = Long.parseLong(System.console().readLine());
        
        saldo += cantidad;
        
        return saldo;
    }
    
    long retirar()
    {
        System.out.print("Ingrese la cantidad a retirar: $");
        long retiro = Long.parseLong(System.console().readLine());
        
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
        System.out.println("El saldo de la cuenta de " + this.titular + " es de: $" + this.saldo);
    }
    
    //Constructor de la clase Cuenta_bancaria
    public Cuenta_bancaria(String titular, long saldo)
    {
        this.titular = titular;
        this.saldo = saldo;
    }
}
