## Retos

### Reto 01

Realiza un programa que evalúe una expresión que contenga literales de los cuatro tipos de datos (booleano, entero, real y carácter) y la muéstralo por pantalla.

<hr>

### Reto 02

En tu entorno de trabajo, crea el programa siguiente. Observa qué pasa exactamente. Entonces, intenta arreglar el problema.

```java
// Un programa que usa un entero muuuuy grande
public class TresMilMilions {
	public static void main (String [] args) {
 		System.out.println (3000000000);
	}
}
```

<hr>

### Reto 03

Haz un programa con dos variables que, sin usar ningún literal en ninguna parte excepto para inicializar estas variables, ves estimando e imprimiendo sucesivamente los 5 primeros valores de la tabla de multiplicar del 4. Puedes usar operadores aritméticos y de asignación, si deseas.

<hr>

### Reto 04

Haz dos programas, uno que muestre por pantalla la tabla de multiplicar del 3, y otro, la del 5. Los dos deben ser exactamente iguales, letra por letra, excepto en un único literal dentro de todo el código.

<hr>

### Reto 05

Experimenta qué pasa si en el siguiente programa inicializas la variable *realLlarg* con un valor con varios decimales. ¿El programa continúa compilando?. ¿Qué resultado da? Después inténtalo asignando un valor superior al rango de los enteros (*por ejemplo, 3000000000.0*).

```java
public class ConversionExplicita {
	public static void main (String [] args) {
 		double realLlarg = 300.0;
 		// Asignación incorrecta. ¿Un real tiene decimales, no?
 		long enterLlarg = (long) realLlarg;
 		// Asignación incorrecta. ¿Un entero largo tiene un rango mayor que un entero, no?
 		int enter = (int) enterLlarg;
 		System.out.println (enter);
    }
}
```

<hr>

### Reto 06

Haz un programa que muestre en pantalla de forma tabulada la tabla de verdad de una expresión de disyunción entre dos variables booleanas.

<hr>

### Reto 07

Haz un programa que muestre por pantalla la multiplicación de tres números reales entrados por teclado.



## Ejercicios

### Ejercicio 01 
Probar la E/S elemental: Escribe el pequeño programa que aparece a continuación.

```java
public class EntradaSalida {
    public static void main (String arg[]){
        Scanner tec = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce un número entero");
        a = tec.nextInt();
        System.out.println("Introduce otro número entero");
        b = tec.nextInt();
        System.out.println("Los números introducidos son " + a + " y " + b);
    }
}
```

Ejecútalo para ver cómo se comporta el programa.

- ¿Qué ocurre si cuando nos pide un número entero le damos un número real? ¿Y si le damos un carácter no numérico?

- ¿Qué ocurre si eliminamos la instrucción `import java.util.*`;

<hr>

### Ejercicio 02 
Averigua mediante pruebas:

1. ¿Es posible escribir dos instrucciones en la misma línea de un programa?
2. ¿Se puede "romper" una instrucción entre varias líneas?
3. Algunos lenguajes de programación dan un valor por defecto a las variables cuando las declaramos sin inicializarlas. Otros no permiten usar el contenido de una variable que no haya sido previamente inicializada. ¿Cuál es comportamiento de Java? 

<hr>

### Ejercicio 03 
¿Cuáles de los siguientes identificadores son válidos y cuales no? Pruébalos cuando tengas duda:

1. `n`
2. `MiProblema`
3. `MiJuego`
4. `Mi Juego`
5. `Int`
6. `Jose&Co`
7. `A b`
8. `1rApellido`
9. `aaaaaaaaaaaa`
10. `Nombre_Apellidos`
11. `Saldo-actual`
12. `Universidad Alicante`
13. `Juan=Rubio`
14. `Edad5`
15. `_5Java`

<hr>

### Ejercicio 04 
Escribir un programa que lea un entero desde teclado, lo multiplique por 2, y a continuación escribe el resultado en la pantalla:

Ejemplo de ejecución:

```sh
Escribe un número: 
3
El doble de 3 es 6
```

<hr>

### Ejercicio 05 `Intercambio` 
Escribir un programa que …

1. Lea desde teclado dos valores enteros. Llama a las variables v1 y v2.
2. Muestra los valores introducidos por el usuario.
3. Intercambia el valor de v1 y v2 (*v1 pasa a  valer lo que valía v2 y viceversa*).
4. Muestra de nuevo los valores, ahora con su valor intercambiado.

Ejemplo de ejecución:

```sh
Escribe un número para v1: 2
Escribe un número para v2: 9
Antes de intercambiar	 v1: 2   y	 v2: 9
Después de intercambiar	 v1: 9	 y	 v2: 2
```

<hr>

### Ejercicio 06 
Escribe las siguientes expresiones siguiendo la sintaxis de Java.

​	<img src="../../img/ud01/formulas.png" alt="formulas" style="max-width: 18%;" />

<hr>

### Ejercicio 07 `Superficie` 
Escribe un programa que solicite al usuario la longitud y la anchura de una habitación y a continuación muestra su superficie (longitud por anchura).
<hr>

### Ejercicio 08 `Medidas` 
Escribir un programa que convierta una medida dada en pies a sus equivalentes en yardas, pulgadas, centímetros  y metros, sabiendo que 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 m = 100 cm.
<hr>

### Ejercicio 09 `Segundos` 
Escribir un programa que, dada una cantidad de segundos, introducida por teclado, la desglose en días, horas, minutos y segundos.  

Ejemplo de ejecución: 

```sh
Introduce cantidad de segundos: 3661
3661 segundos son:
0 dias
1 horas
1 minutos
1 segundos
```

<hr>

### Ejercicio 10 `Fuerza` 
La fuerza de atracción entre dos masas m1 y m2 separadas por una distancia d, está dada por la fórmula:

<div style="text-align:center;">
    <img src="../../img/ud01/formula10.png" alt="formula10" style="max-width:35%;" />
</div>

*donde G es la constante de gravitación universal G= 6.693 · 10 ^(–11).* 

Escribir un programa que lea la masa de dos cuerpos y la distancia entre ellos y a continuación obtenga su fuerza de atracción.


<hr>

### Ejercicio 11 `Circulo` 
Escribir un programa que calcule la longitud de la circunferencia y el área del círculo para un valor del radio introducido por teclado.
<hr>

### Ejercicio 12 `Dados` 
Escribir un programa que simula el lanzamiento de dos dados.

```sh
Dado 1 : 5
Dado 2: 4
Puntuación total: 9
```

<hr>

### Ejercicio 13 `UltimaCifra` 
Escribir un programa que muestre la última cifra de un número entero que introduce el usuario por teclado. *Pista: ¿Qué devuelve a%10 ?*

    Introduce un número entero: 3761
    La última cifra de 3761 es 1
<hr>

### Ejercicio 14 `PenultimaCifra` 
Escribir un programa que muestre la penúltima cifra de un número entero que introduce el usuario por teclado.

    Introduce un número entero: 3761
    La última cifra de 3761 es 6
Una vez hayas comprobado que el programa funciona correctamente, prueba qué ocurre si el usuario introduce un valor de una sola cifra (por ejemplo 4). Explica el resultado mostrado por el programa.

<hr>

### Ejercicio 15 `Redondear1` 
`Math.round(x)` redondea x de manera que este queda sin decimales. (*`Math.round(35.5289)` da como resultado `36`)*

Trata de escribir un programa en el que el usuario introduzca un número real y a continuación se muestre redondeado a un solo decimal. *Pista : combinar productos, divisiones y Math.round()*

Ejemplo de ejecución:

```sh
Introduce un número real: 35.5289
El número 35.5289, redondeado a un decimal es 35.5
```

<hr>

### Ejercicio 16 
Cuál es el valor resultante de dada una de las siguientes expresiones

1. `5 * 4 – 3 * 6`
2. `4 * 5 * 2`
3. `(24 + 2 * 6) / 4`
4. `8 / 2 / 2 * 5`
5. `3 + 4 * (8  * (4 –  (9 + 3) /  6 ))`
6. `4 * 3 * 5 + 8 * 4 * 2`
7. `4 – 40 % 5`
8. `4 * 3 / 2`
9. `4 / 2 * 3`
10. `213 /100`

<hr>

### Ejercicio 17 
La famosa ecuación de Einstein para la conversión de una masa m en energía viene dada por la fórmula E=mc^2^, donde c es la velocidad de la luz que vale 2.997925 · 10^8^ m/s. Escribir un programa que lea el valor de la masa y obtenga la energía correspondiente según la anterior fórmula.

<hr>

### Ejercicio 18 
Indica cuales serán los valores de las variables después de ejecutar cada uno de los siguientes fragmentos de código. Resuelve el ejercicio sin escribir los programas correspondientes y probarlos. 

prueba 1
	```sh
    int a=3, b = 2;
    a = b + b;
    b = a + a;
    ```
	prueba 2
	```sh
    int a=3,b=0;
    b = b - 1;
    a = a + b;
    ```
​    prueba 3
​	```sh
​    int a, b=5;
​    b++;
​    ++b;
​    a= b+1;
    ```
    prueba 4
	```sh
    int a = 5,b;
    b = a++;
    ```
​    prueba 5
​	```sh
​    int a = 5,b;
​    b = ++a;
    ```
    prueba 6
	```sh
    int a=2, b=3;
    b+=a;
    ```
​    prueba 7
​	```sh
​    int a=2, b=3;
​    b-=a;
​    a=-b;
    ```
    prueba 8
	```sh
    int a=2, b=3;
    b%=a;
    ```
​    prueba 9
​	```sh
​    int a=2,b=3,c=4;
​    a = --b + c++;
​    b+=a;
    ```
    ```

## Expresiones lógicas
Sean 4 variables enteras 

```java
int m, j, p, v ;
```

que contienen respectivamente la edad de Miguel, Julio, Pablo y Vicente. 

Expresar las siguientes afirmaciones utilizando operadores lógicos y relacionales

Ejemplo:	`Miguel es mayor de edad.`

Solución: `m >= 18`

1. Miguel es menor de edad.
2. Miguel es mayor que Julio
3. Miguel es el más viejo.
4. Miguel es el más joven.
5. Miguel  no es el más joven.
6. Miguel no es el más viejo.
7. Alguno de ellos es mayor de edad.
8. Miguel y Julio son los más jóvenes.
9. Entre todos tienen más de 100 años.
10. Entre Miguel y Julio suman más edad que Pablo.
11. Entre Miguel y Julio suman más edad que Pablo y Vicente juntos.
12. Si los ordenamos por edades de menor a mayor, Julio es el segundo.
13. Si los ordenamos por edades de menor a mayor, Julio es el segundo y Pablo el tercero.
14. Al menos uno de ellos es menor de edad.
15. Al menos dos de ellos son menores de edad.
16. Todos son menores de edad.
17. Solo dos de ellos son menores de edad.
18. Al menos dos de ellos nacieron el mismo año.
19. Solo dos de ellos nacieron el mismo año.
20. Al menos uno de ellos es menor que Julio
21. Solo uno de ellos es menor que Julio
22. Miguel es mayor de edad y alguno de los otros es menor de edad.



## Actividades

### Actividad 01

Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser introducida por teclado.

<hr>

### Actividad 02

Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado.

<hr>

### Actividad 03

Escribe un programa que calcule el área de un rectángulo ( `area = base * altura` ).

<hr>

### Actividad 04

Escribe un programa que calcule el área de un triángulo ( `area = (base * altura) / 2` ).

<hr>

### Actividad 05

Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.

<hr>

### Actividad 06

Realiza un conversor de MiB a KiB ( [Ayuda](https://es.wikipedia.org/wiki/Prefijo_binario){:target="_blank"} ).

<hr>

### Actividad 07

Realiza un conversor de Kib a Mib ( [Ayuda](https://es.wikipedia.org/wiki/Prefijo_binario){:target="_blank"} ).

<hr>

### Actividad 08

Realiza un programa en Java que genere letras de forma aleatoria.

<hr>

### Actividad 09

Realiza un programa en Java que genere el número premiado del Cupón de la ONCE.

<hr>

### Actividad 10

Modificar el siguiente programa para que compile y funcione:

```java
public class activ10 {
    public static void main(String[] args) {
        int n1 = 50, n2 = 30,
        boolean suma = 0;
        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);
    }
}
```

<hr>

### Actividad 11

Modificar el siguiente programa para que compile y funcione:

```java
public class activ11 {
	public static void main(String[] args) { 
       	int numero = 2;
		cuad = numero * número;
		System.out.println("EL CUADRADO DE "+NUMERO+" ES: "+cuad);
	}
}
```

<hr>

### Actividad 12

Indicar qué valor devolverá la ejecución del siguiente programa:

```java
public class activ12 {
	public static void main(String[] args) {
    	int num = 5;
		num += num - 1 * 4 + 1;
    	System.out.println(num);
	}
}
```

<hr>

### Actividad 13

Indicar qué valor devolverá la ejecución del siguiente programa:

```java
public class activ13 {
	public static void main(String[] args) {
       	int num = 4;
		num %= 7 * num % 3 * 3;
        System.out.println(num);
	}
}
```

<hr>

### Actividad 14

Realizar un programa que muestre por pantalla respetando los saltos de carro el siguiente texto (con un solo `println`):

```sh
Me gusta la programación
cada día más
```

<hr>

### Actividad 15

Realiza un programa en Java que tenga las variables *edad*, *nivel de estudios* e *ingresos* y almacene en una variable llamada *jasp* el valor verdadero si la edad es menor o igual a 28 y el nivel de estudios es mayor a 3, o bien la edad es menor de 30 y los ingresos superiores a 28000. En caso contrario almacenar el valor falso.

<hr>

### Actividad 16

Realizar un programa que calcule el precio de un producto teniendo en cuenta que el producto vale 120 €, tiene un descuento del 15% y el IVA que se le aplica es del 21%.

<hr>

### Actividad 17

Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.

Ejemplo 1:

```sh
Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
Ejemplo 1:
```

Ejemplo 2:

```sh
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
```

<hr>

### Actividad 18

Realizar un programa que dado un importe en euros nos indique el mínimo número de billetes y la cantidad sobrante de euros. Debes usar el operador condicional `?:`

```sh
¿Cuántos euros tienes?: 232
1 billete de 200 €
1 billete de 20 €
1 billete de 10 €
Sobran 2 €
```

