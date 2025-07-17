public class Colinha {

    public static int[]swap (int[] vetor, int i,int  j){
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;

        return vetor;
    }

    public static int[] quickSort(int[] vetor){
        quick2(vetor,0,vetor.length-1);
        return vetor;
    }

    public static void quick2(int[] vetor, int inicio, int fim){
        int meio, pivo, i, j;

        if (inicio<fim) {
            meio = (inicio + fim)/2;
            pivo = vetor[meio];

            swap(vetor,meio,fim);
            i = inicio -1;
            j = fim;

            do{
                do{
                    i++;
                }while(i<=j && vetor[i] < pivo);

                do{
                    j--;
                }while(i<=j && vetor[j] < pivo);

                if(i<=j){
                    swap(vetor, i, j);
                }
            }while(i<j);

            vetor[fim] = vetor [i];
            vetor[i] = pivo;
            quick2(vetor, inicio, i-1);
            quick2(vetor, i+1, fim);
        }

    }
    public static int[] bubbleSort (int[] vetor){
        boolean troca = true;
        int tam = vetor.length;
        while(troca){
            troca = false;
            tam --;
            for(int i = 0; i<tam;i++){
                if(vetor[i] > vetor[i+1]){
                    swap(vetor, i, i+1);
                    troca = true;
                }
            }
        }

        return vetor;
    }

    public static void mergeSort(int[] vetor){
        mergeRec(vetor,0,vetor.length);
    }

    public static void mergeRec(int[] vetor, int inicio, int fim){
        if(inicio<fim-1){
            int meio = (inicio+fim)/2;
            mergeRec(vetor, inicio, meio);
            doMerge(vetor,inicio, meio, fim);
        }

    }

    public static void doMerge(int[] vetor, int inicio, int meio, int fim){

        int i = inicio, j =meio, k=0;

        int[] vetorAux = new int[fim-inicio];

        while(i<meio && j<fim){
            if (vetor[i] <= vetor[j]) {
                vetorAux[k++] = vetor[i++];
            }else{
                vetorAux[k++] = vetor[j++];
            }
        }

        while(i<fim){
            vetorAux[k++] = vetor[i++];
        }
        while(j<fim){
            vetorAux [k++] = vetor[i++];
        }
        for(i=inicio; i<fim; i++){
            vetor[i] = vetorAux[i-inicio];
        }
    }
}
