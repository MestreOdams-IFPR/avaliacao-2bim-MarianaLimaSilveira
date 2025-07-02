import java.util.Scanner;

public class TesteDeForca {

    public static Scanner teclado = new Scanner (System.in);

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
   
    public static int determinarForçaMinima(int[] pontuacoes, int vagas){
        int[]ordenado = quickSort(pontuacoes);
        int forcaMinima = 0;

        for(int k = (pontuacoes.length-1) - vagas; k < ordenado.length;k++){
            forcaMinima += pontuacoes[k];
        }

        return forcaMinima;
    }

    public static void main(String[] args){

        while(teclado.hasNext()){

            int qntParticipantes = teclado.nextInt();
            int qntVagas = teclado.nextInt();
    
            int[] pontuacoes = new int[qntParticipantes];
    
            for(int i = 0;i < qntParticipantes;i++){
    
                pontuacoes[i] = teclado.nextInt();

            }

            System.out.println(determinarForçaMinima(pontuacoes, qntVagas));
            System.out.println();

        }
        
    }
}
