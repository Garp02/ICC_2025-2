# Proyecto 2. Estenografía

Autor: Ibrahim Munive Ramírez

Número de cuenta: 424106083

## Documentación de la Clase Mensaje

Esta documentación explica el funcionamiento de los métodos implementados en la clase `Mensaje.java`, que contiene algoritmos para el cifrado y descifrado de mensajes ocultos.

### Índice
1. [descifraNulo](#descifranulo)
2. [descifraNuloEspacios](#descifranuloespacios)
3. [darFormato](#darformato)
4. [contieneNombre](#contienennombre)
5. [descifraPalabrasMarcadas](#descifrapalabrasmarcadas)
6. [descifraLetrasMarcadas](#descifraletramarcadas)

### Métodos

#### descifraNulo

```java
public static String descifraNulo(String original, int n)
```

**Descripción:** Este método extrae un mensaje oculto de un texto tomando el n-ésimo carácter de cada palabra.

**Parámetros:**
- `original`: El texto que contiene el mensaje oculto.
- `n`: La posición del carácter a extraer de cada palabra (comenzando desde 1).

**Funcionamiento:**
1. Si `n` es menor o igual a cero, retorna una cadena vacía.
2. Recorre el texto carácter por carácter.
3. Detecta el inicio y fin de cada palabra (separadas por espacios).
4. Para cada palabra, extrae el carácter en la posición `n` (si existe).
5. Concatena los caracteres extraídos para formar el mensaje oculto.

**Retorno:** Una cadena con el mensaje oculto formado por los caracteres en la posición `n` de cada palabra.

#### descifraNuloEspacios

```java
public static String descifraNuloEspacios(String mensaje)
```

**Descripción:** Extrae un mensaje oculto utilizando el método `descifraNulo`, donde la posición `n` se determina por la cantidad de espacios al final del mensaje.

**Parámetros:**
- `mensaje`: El texto que contiene el mensaje oculto.

**Funcionamiento:**
1. Cuenta la cantidad de espacios al final del mensaje.
2. Si no hay espacios al final, retorna una cadena vacía.
3. Utiliza el número de espacios como la posición `n` para llamar al método `descifraNulo`.

**Retorno:** El mensaje oculto obtenido mediante el método `descifraNulo` con la posición determinada por los espacios finales.

#### darFormato

```java
public static String darFormato(String mensaje)
```

**Descripción:** Método auxiliar que normaliza un texto para facilitar comparaciones sin distinguir acentos, mayúsculas/minúsculas o signos de puntuación.

**Parámetros:**
- `mensaje`: El texto a normalizar.

**Funcionamiento:**
1. Elimina espacios y signos de puntuación.
2. Convierte todo el texto a minúsculas.
3. Reemplaza letras acentuadas por sus equivalentes sin acento (á→a, é→e, etc.).

**Retorno:** El texto normalizado sin espacios, signos de puntuación, acentos y en minúsculas.

#### contieneNombre

```java
public static boolean contieneNombre(String mensaje, String nombre)
```

**Descripción:** Verifica si un nombre está contenido dentro de un mensaje, ignorando espacios, signos de puntuación, acentos y mayúsculas/minúsculas.

**Parámetros:**
- `mensaje`: El texto donde se buscará el nombre.
- `nombre`: El nombre a buscar.

**Funcionamiento:**
1. Normaliza tanto el mensaje como el nombre utilizando el método `darFormato`.
2. Recorre el mensaje carácter por carácter.
3. Cuando encuentra un carácter que coincide con el primer carácter del nombre, intenta hacer coincidir los caracteres siguientes.
4. Si todos los caracteres del nombre coinciden en secuencia, retorna `true`.

**Retorno:** `true` si el nombre está contenido en el mensaje, `false` en caso contrario.

#### descifraPalabrasMarcadas

```java
public static String descifraPalabrasMarcadas(String mensaje1, String mensaje2)
```

**Descripción:** Extrae un mensaje oculto comparando dos textos y seleccionando las palabras que son diferentes.

**Parámetros:**
- `mensaje1`: El primer texto a comparar.
- `mensaje2`: El segundo texto a comparar.

**Funcionamiento:**
1. Verifica que ambos mensajes no sean nulos ni vacíos.
2. Recorre ambos mensajes palabra por palabra simultáneamente.
3. Compara cada par de palabras sin distinguir mayúsculas/minúsculas.
4. Si las palabras son diferentes, agrega la palabra del primer mensaje al resultado.
5. Elimina el espacio final del resultado si existe.

**Retorno:** Una cadena con las palabras del primer mensaje que son diferentes a las del segundo mensaje.

#### descifraLetrasMarcadas

```java
public static String descifraLetrasMarcadas(String mensaje1, String mensaje2)
```

**Descripción:** Extrae un mensaje oculto comparando dos textos carácter por carácter y seleccionando los caracteres que son diferentes.

**Parámetros:**
- `mensaje1`: El primer texto a comparar.
- `mensaje2`: El segundo texto a comparar.

**Funcionamiento:**
1. Verifica que ambos mensajes no sean nulos ni vacíos.
2. Determina la longitud mínima entre ambos mensajes.
3. Recorre ambos mensajes carácter por carácter hasta la longitud mínima.
4. Si los caracteres en la misma posición son diferentes, agrega el carácter del primer mensaje al resultado.

**Retorno:** Una cadena con los caracteres del primer mensaje que son diferentes a los del segundo mensaje en la misma posición.