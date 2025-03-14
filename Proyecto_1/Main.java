/*
Programa: proyecto 1
Descripción: Recipientes 
Autor: Ibrahim Munive Ramírez
Número de cuenta: 424106083
Fecha: 21/03/2025
 */

public class Main
{
    public static void main (String[] pikachu) 
    {
        System.out.println("\n\t\tRecipientes\n");
        Recipiente botella = new Recipiente("Botella", 5, 20);
        Recipiente tambo = new Recipiente("Tambo",20, 100);
        
        System.out.println("\nSe han creado dos recipientes.");
        double agua = tambo.capacidad();
        tambo.rellena(agua);
        double mediaCapacidad = botella.capacidad() / 2;
        botella.rellena(mediaCapacidad);
        Recipiente botellaJusta = botella.crearContenedorJusto();

        System.out.println(tambo.muestra());

        System.out.println(botella.muestra());
        System.out.println("Se imprime la información del recipiente creado apartir de la capacidad del recipiente original.");
        System.out.println(botellaJusta.muestra());

        Recipiente tina = new Recipiente("Tina", 50, 200);

        double tinaCompleta = tina.capacidad();
        tina.rellena(tinaCompleta);        
        System.out.println(tina.muestra());

        tina.vacia();
        System.out.println(tina.muestra());

        Recipiente cubeta = new Recipiente("Cubeta", 10, 50);
        cubeta.rellena(500.0);
        System.out.println(cubeta.muestra());

        cubeta.vierte(tina);
        System.out.println(tina.muestra());

        System.out.print("¿La tina tiene las mismas dimensiones que la cubeta? ");
        System.out.println(tina.mismasDimensiones(cubeta));

        System.out.print("¿La tina tiene la misma capacidad que la cubeta? ");
        System.out.println(tina.mismaCapacidad(cubeta));

        System.out.print("¿La tina contiene más líquido que la cubeta? ");
        System.out.println(tina.contieneMas(cubeta));

        System.out.print("¿La tina tiene más capacidad restante que la cubeta? ");
        System.out.println(tina.cabeMas(cubeta));


    }
}