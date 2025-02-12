En esta practica se hizo una calculadora con cinco opciones; suma, resta, multiplicacion, division y pasar a binarios.
Expliquemos paso por paso. 


Al ejecutar el programa se mostra el mensaje de bienvenida con una calculadora y seran visibles las cinco opciones 
mencionadas antes para el usuario. 

En caso que ingrese la opcion 1, el programa le pedira al usuario ingresar dos numeros reales y los sumara, despues
imprimira un mensaje en pantalla a detalle de la operacion.

En caso que ingrese la opcion 2, el programa le pedira al usuario ingresar dos numeros reales y restara el segundo numero
del primero, despues imprimira un mensaje en pantalla a detalle de la operacion.

En caso que ingrese la opcion 3, el programa le pedira al usuario ingresar dos numeros reales y hara su producto, despues
imprimira un mensaje en pantalla a detalle de la operacion.

En caso que ingrese la opcion 4, el programa le pedira al usuario ingresar dos numeros reales y dividira el primero entre
el segundo, despues imprimira un mensaje en pantalla a detalle de la operacion. En caso de que el segundo numero sea cero,
el programa imprimira un mensaje de error indicando que la opercion esta definida.  

En caso que ingrese la opcion 5, el programale pedira al usuario ingresar un unico numero ENTERO y lo pasara a binario,
despues imprimira un mensaje en pantalla a detalle de la operacion. ¿Como puedo hacer esto? Una opcion es hacer una operacion 
de n modulo, juntar los residuos e invertir la cadena. Al final solo se imprime la cadena.

Pero, revisando comandos de Java encontre una instruccion que pasa un numero entero a binario y el resultado se guarda en una
variable tipo String. Asi que en lugar de realizar el proceso anterior, solo se agrega la linea de codigo: 

String binario = Integer.toBinaryString(numero); 


En caso de que el usuario quiera ingresar una opcion no valida, el programa le mostrará un mensaje de error y finalizara. 

Decidi usar la estructura switch porque es más clara que tener un if, 4 else if y un else para el caso por default.
En lugar de pedir los numeros reales fuera del switch, decidi pedirlos en cada uno de los casos para que en el caso default 
ni siquiera pida los numeros, solo finalice. 


PD. Me da ansiedad no meter acentos.