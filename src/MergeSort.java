public class MergeSort {
    public static void merge(Integer[] A, int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar
            B[i]=A[i];

        i=izq; j=m+1; k=izq;

        while (i<=m && j<=der) //copia el siguiente elemento más grande
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];

        while (i<=m)         //copia los elementos que quedan de la
            A[k++]=B[i++]; //primera mitad (si los hay)
    }
}
