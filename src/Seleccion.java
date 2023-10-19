public class Seleccion {
    public static void seleccion(Integer[] A) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
            menor = A[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] < menor) {           // del array algún elemento
                    menor = A[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
    public static void seleccionint(int[] A, String direccion) {
        int i, j, menor, pos, tmp, mayor;
        if (direccion.equals("A")){
            for (i = 0; i < A.length - 1; i++) {
                menor = A[i];
                pos = i;
                for (j = i + 1; j < A.length; j++){
                    if (A[j] < menor) {
                        menor = A[j];
                        pos = j;
                    }
                }
                if (pos != i){
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
            }
        } else if (direccion.equals("D")){
            for (i = 0; i < A.length - 1; i++) {
                mayor = A[i]; // Cambio de "menor" a "mayor" para mantener un seguimiento del elemento más grande
                pos = i;
                for (j = i + 1; j < A.length; j++) {
                    if (A[j] > mayor) { // Cambio de '<' a '>'
                        mayor = A[j];
                        pos = j;
                    }
                }
                if (pos != i) {
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
            }
        }

    }
}
