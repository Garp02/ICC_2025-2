Práctica 1

Descripción: calculadora básica de cinco opciones

Autor: Ibrahim Munive Ramírez

Número de cuenta: 424106083

Fecha: 11 de febrero de 2025

En esta práctica se hizo una calculadora con cinco opciones; suma, resta, multiplicación, división y pasar a binario.
Expliquemos paso por paso. 


Al ejecutar el programa se mostrará el mensaje de bienvenida con una calculadora y serán visibles las cinco opciones 
mencionadas antes para el usuario. 

En caso que ingrese la opción 1, el programa le pedirá al usuario ingresar dos números reales y los sumará, después
imprimirá un mensaje en pantalla a detalle de la operación.

En caso que ingrese la opción 2, el programa le pedirá al usuario ingresar dos números reales y restará el segundo número
del primero, después imprimirá un mensaje en pantalla a detalle de la operación.

En caso que ingrese la opción 3, el programa le pedirá al usuario ingresar dos números reales y hara su producto, después
imprimirá un mensaje en pantalla a detalle de la operación.

En caso que ingrese la opción 4, el programa le pedirá al usuario ingresar dos números reales y dividira el primero entre
el segundo, después imprimirá un mensaje en pantalla a detalle de la operación. En caso de que el segundo número sea cero,
el programa imprimirá un mensaje de error indicando que la operción esta definida.  

En caso que ingrese la opción 5, el programa le pedirá al usuario ingresar un unico número ENTERO y lo pasará a binario,
después imprimirá un mensaje en pantalla a detalle de la operación. ¿Cómo puedo hacer esto? Una opción es hacer una operación 
de n módulo, juntar los residuos e invertir la cadena. Al final solo se imprime la cadena.

Pero, encontré una instrucción que pasa un número entero a binario y el resultado se guarda en una
variable tipo String. Así que en lugar de realizar el proceso anterior, solo se agrega la linea de codigo: 

String binario = Integer.toBinaryString(numero); 


En caso de que el usuario quiera ingresar una opción no definida, el programa le mostrará un mensaje de error y finalizara. 
