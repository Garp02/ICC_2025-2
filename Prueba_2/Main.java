public class Main
{
    public static void main(String args[])
    {
        //Creamos un objeto de la clase Cuenta_bancaria
        Cuenta_bancaria cuenta1 = new Cuenta_bancaria("Juan Pérez", 10000);
        
        while(true)
        {
            //Invocamos los métodos de la clase Cuenta_bancaria
            System.out.print("\n\t\tBanco de Méjiko\n");
            System.out.println("\n\t1. Consultar saldo");
            System.out.println("\n\t2. Depositar");
            System.out.println("\n\t3. Retirar");
            System.out.print("\nOperacion: ");
            
            int operacion = Integer.parseInt(System.console().readLine());
            if(operacion == 1)
            {
                cuenta1.consultar_saldo();
            }
            
            else if(operacion == 2)
            {
                cuenta1.depositar();
                System.out.println("\nEl saldo de su cuenta se ha actualizado a: $" + cuenta1.saldo);
            }
            
            else if(operacion == 3)
            {
                cuenta1.retirar();
                System.out.println("\nEl saldo de su cuenta se ha actualizado a: $" + cuenta1.saldo);
            }
            
            else
            {
                System.out.println("\nOperación inválida.\n");
            }
        }
    }    
}
