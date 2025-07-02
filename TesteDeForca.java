import java.util.Scanner;
import java.util.Vector;

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
                    swap(vetor, i, j)
                }
            }
        }

    }
    public static void main(String[] args) {*.

        while(teclado.hasNext()){

            int qntParticipantes = teclado.nextInt();
            int qntVagas = teclado.nextInt();
    
            int[] pontuacoes = new int[qntParticipantes];
    
            for(int i = 0;i < qntParticipantes;i++){
    
                pontuacoes[i] = teclado.nextInt();
    
            }

        }
        
    }
}
