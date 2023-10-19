public class Burbuja {
    public static void burbuja(Integer[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void burbujaint(int[] A, String direccion) {
        int i, j, aux;
        if(direccion.equals("A")) {
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length - i - 1; j++) {
                    if (A[j + 1] < A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
        } else if (direccion.equals("D")){
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length - i - 1; j++) {
                    if (A[j + 1] > A[j]) { // Cambio de '<' a '>'
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
        }

    }
}
