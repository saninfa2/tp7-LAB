import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //------------------------------------PROCEDIMIENTOS EXTRAS---------------------------------


        //-----------------------------------------EJERCICIO 1---------------------------------------
        //1) Ordenar un array de numeros enteros de menor a mayor
        //Ordenamos el array con el método sort
        Integer[] integerNumber = {4, 2, 3, 1, 5};
        Arrays.sort(integerNumber);
        MostrarArray.mostrarArrayInt(integerNumber, 5);

        //-----------------------------------------EJERCICIO 2---------------------------------------
        //2) ordenar un array de números enteros de mayor a menor
        Arrays.sort(integerNumber, Comparator.reverseOrder());
        MostrarArray.mostrarArrayInt(integerNumber, 5);

        //-----------------------------------------EJERCICIO 3---------------------------------------
        //3) ordenar un array de números flotantes de menor a mayor
        Double[] doblantesNumbers = {4.3, 33.3, 22.1, 0.98, 4.56};
        Arrays.sort(doblantesNumbers);
        MostrarArray.mostrarArrayDoblantes(doblantesNumbers, 5);

        //-----------------------------------------EJERCICIO 4---------------------------------------
        //4) Ordenar un array de numeros flotantes de mayor a menor
        Arrays.sort(doblantesNumbers, Comparator.reverseOrder());
        MostrarArray.mostrarArrayDoblantes(doblantesNumbers, 5);

        //-----------------------------------------EJERCICIO 5---------------------------------------
        //5) Ordenar un array de cadena de texto en orden alfabetico
        String[] stringosa = {"manzana", "mandarina", "robot", "ladron", "rio"};
        Arrays.sort(stringosa);
        MostrarArray.mostrarArrayString(stringosa, 5);

        //-----------------------------------------EJERCICIO 6---------------------------------------
        //6) ordenar un array de cadena de texto en orden inverso
        Arrays.sort(stringosa, Comparator.reverseOrder());
        MostrarArray.mostrarArrayString(stringosa, 5);

        //-----------------------------------------EJERCICIO 7---------------------------------------
        //7) ordenar un array de objetos de una clase personalizada??????????????????????????????????
        //-----------------------------------------EJERCICIO 8---------------------------------------
        //8) ordenar un array de objetos de una personalizada por un atributo en especifico??????????

        //-----------------------------------------EJERCICIO 9---------------------------------------
        //9) ordenar un array de números enteros utilizando el algoritmo de ordenamiento burbuja
        Burbuja.burbuja(integerNumber);
        MostrarArray.mostrarArrayInt(integerNumber, 5);

        //-----------------------------------------EJERCICIO 10---------------------------------------
        //10) lo mismo con selección
        Seleccion.seleccion(integerNumber);
        MostrarArray.mostrarArrayInt(integerNumber, 5);

        //-----------------------------------------EJERCICIO 11---------------------------------------
        //11) lo mismo con inserción
        InsercionDirecta.insercionDirecta(integerNumber);
        MostrarArray.mostrarArrayInt(integerNumber, 5);

        //-----------------------------------------EJERCICIO 12---------------------------------------
        //12) lo mismo con mezcla?????
        Integer[] integerNumbers = {4, 2, 18};
        MergeSort.merge(integerNumbers, 4, 2, 18);
        MostrarArray.mostrarArrayInt(integerNumber, 3);

        //-----------------------------------------EJERCICIO 13---------------------------------------
        //13) lo musmo con shell
        Shell.shell(integerNumber);
        MostrarArray.mostrarArrayInt(integerNumber, 5);

        //-----------------------------------------EJERCICIO 14---------------------------------------
        //14) codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos enteros.
        //Finaliza la carga de los 20 elementos el programa debe solicitar como se desea ordenar el array ASCENDENTE
        //O DESCENDENTE y que método de ordenamiento aplicar (inserción, burbuja, seleccion)
        //según las opciones elegidas aplique el algoritmo que corresponda.
        //mostrar original y ordenado

        int[] interveinte = new int[20];
        int[] interveinte2 = new int[20];
        Scanner scan = new Scanner(System.in);
        String formato = " ", metodo = " ";
        boolean formatoValido = false;
        int numero;
        boolean metodoValido = false;
        for (int j = 0; j <= 19; j++) {
            numero = (int) (Math.random() * 100 + 1);
            interveinte[j] = numero;
            interveinte2[j] = interveinte[j];
        }

        while (!formatoValido) {
            System.out.println("A) ASCENDENTE   D) DESCENDENTE");
            formato = scan.next().toUpperCase();
            if (formato.equals("A") || formato.equals("D")) {
                formatoValido = true;
            }
        }

        while (!metodoValido) {
            System.out.println("B) BURBUJA   I) INSERCIÓN   S) SELECCIÓN");
            metodo = scan.next().toUpperCase();
            if (metodo.equals("B") || metodo.equals("I") || metodo.equals("S")) {
                metodoValido = true;
            }
        }

        if (metodo.equals("B")){
            Burbuja.burbujaint(interveinte, formato);
        } else if (metodo.equals("I")) {
            InsercionDirecta.insercionDirectaint(interveinte, formato);
        } else{
            Seleccion.seleccionint(interveinte, formato);
        }

        System.out.println("ARRAY ORIGINAL:");
        MostrarArray.mostrarArrayint(interveinte2, 20);
        System.out.println("ARRAY ORDENADA:");
        MostrarArray.mostrarArrayint(interveinte, 20);

    }
}