import java.util.ArrayList;

public class EjerciciosBasicos {
    public static void main(String[] args) {
        // Escriba un método que imprima todos los número del 1 al 255.
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }

        // Escriba un método que imprima todos los número impares entre el 1 al 255.
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // Escriba un método que imprima los números desde el 0 hasta el 255,
        // pero esta vez muestre también las suma de los números que ha mostrado
        // en pantalla hasta ahora.
        int suma = 0;
        for (int i = 0; i <= 255; i++) {
            suma += i;
            System.out.println("Nuevo numero: " + i + " Suma: " + suma);
        }

        // Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra
        // cada uno de los elementos del arreglo e imprima cada valor. Ser capaz de
        // recorrer
        // cada elemento de un arreglo es extremadamente importante.
        int[] Array = { 1, 3, 5, 7, 9, 13 };
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

        // Escribir un método que tome un arreglo e imprima el valor máximo en el
        // arreglo.
        // Su método debería funcionar también con todos los números en negativo
        // (ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos, números
        // negativos y cero.
        int[] ArrayV2 = { -3, -5, -7, 0, 3, 9, 10, 9, -244, -300, 11 };
        int max = ArrayV2[0];
        for (int i = 1; i < ArrayV2.length; i++) {
            if (ArrayV2[i] > max) {
                max = ArrayV2[i];
            }
        }
        System.out.println("El valor maximo del ArrayV2 es: " + max);

        // Escribir un método que tome un arreglo e imprima el promedio de los valores
        // en el arreglo. Por ejemplo en un arreglo hay [2,10,3],
        // su método debería Imprimir “Promedio de 5”. Nuevamente, asegúrese de crear un
        // caso simple y escriba las instrucciones para resolver ese caso primero,
        // luego pruebe sus instrucciones con casos más complicados.
        int[] ArrayPromedio = { 2, 10, 3 };
        int resultadoPromedio = 0;
        for (int i = 0; i < ArrayPromedio.length; i++) {
            resultadoPromedio += ArrayPromedio[i];
        }
        System.out.println("El promedio de ArrayPromedio es: " + resultadoPromedio / ArrayPromedio.length);

        // Escribir un método que cree un arreglo ‘y’ que contenga todos los números
        // impares entre 1 - 255. Cuando el método haya terminado,
        // ‘y’ debe tener los valores de [1,3,5,7…255].
        ArrayList<Integer> arrayImpar = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                arrayImpar.add(i);
            }
        }
        System.out.println("Su arreglo de numero impar es el siguiente: " + arrayImpar);

        // Escribir un método que tome un arreglo y devuelva el número de valores
        // mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3,
        // después de terminar el proceso el método debe Imprimir el número 2 (ya que
        // hay 2 valores en el arreglo que son mayores que 3).
        int y = 3;
        int[] arrayMayorQue = { 1, 3, 5, 7 };
        int resultadoMayorQue = 0;
        for (int i = 0; i < arrayMayorQue.length; i++) {
            if (arrayMayorQue[i] > y) {
                resultadoMayorQue += 1;
            }
        }
        System.out.println("La cantidad de numeros mayor a Y son: " + resultadoMayorQue);

        // Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que
        // multiplique cada valor en el arreglo por sí mismo. Cuando el método haya
        // terminado,
        // el arreglo x debe contener valores que han sido elevados al cuadrado, digamos
        // [1,25,100,4].
        ArrayList<Integer> arrayAlCuadrado = new ArrayList<Integer>();
        int[] arrayCuadrado = { 1, 5, 10, -2 };
        for (int i = 0; i < arrayCuadrado.length; i++) {
            int a = arrayCuadrado[i] * arrayCuadrado[i];
            arrayAlCuadrado.add(a);
        }
        System.out.println("Su arreglo al cuadrado es el siguiente: " + arrayAlCuadrado);

        // Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace
        // cualquier número negativo por 0. Cuando el método haya terminado,
        // x no debe tener valores negativos, digamos como [1,5,10,0].
        ArrayList<Integer> arrayEliminadoNegativo = new ArrayList<Integer>();
        int[] arrayNegativa = { 1, 5, 10, -2 };
        for (int i = 0; i < arrayNegativa.length; i++) {
            if (arrayNegativa[i] < 0) {
                arrayEliminadoNegativo.add(0);
            } else {
                arrayEliminadoNegativo.add(arrayNegativa[i]);
            }
        }
        System.out.println(
                "Su arreglo con los numeros negativos remplazados por 0 es el siguiente: " + arrayEliminadoNegativo);

        // Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un
        // arreglo con el número máximo, el número mínimo y el valor promedio que hay en
        // el arreglo x.
        // El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].

        ArrayList<Object> arrayMaxMinProm = new ArrayList<Object>();
        int[] maxMinProm = { 1, 5, 10, -2 };
        int maxV2 = maxMinProm[0];
        int minV2 = maxMinProm[0];
        double promedioV2 = 0;
        for (int i = 0; i < maxMinProm.length; i++) {
            if (maxMinProm[i] > maxV2) {
                maxV2 = maxMinProm[i];
            }
            if (maxMinProm[i] < minV2) {
                minV2 = maxMinProm[i];
            }
            promedioV2 += maxMinProm[i];
        }
        arrayMaxMinProm.add(maxV2);
        arrayMaxMinProm.add(minV2);
        arrayMaxMinProm.add(promedioV2 / maxMinProm.length);
        System.out.println("Su valor maximo del array es: " + maxV2 + " Su valor minimo es: " + minV2
                + " El promedio del array es: " + promedioV2 / maxMinProm.length);
        System.out.println(arrayMaxMinProm);

        // Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie cada
        // valor por el valor que sigue. Por ejemplo, cuando el método haya terminado,
        // un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. Observe que el
        // último número es 0. El método no necesita ajustarse para los valores que
        // están
        // fuera de los límites.
        ArrayList<Integer> arraySiguiente = new ArrayList<Integer>();
        int[] arraySigue = { 1, 5, 10, 7, -2 };
        for (int i = 1; i < arraySigue.length; i++) {
            arraySiguiente.add(arraySigue[i]);
        }
        arraySiguiente.add(0);
        System.out.println("Su array modificado queda de la siguiente manera: " + arraySiguiente);
    }
}