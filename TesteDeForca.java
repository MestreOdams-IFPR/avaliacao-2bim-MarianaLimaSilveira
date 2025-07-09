import java.util.Scanner;

public class TesteDeForca {

    public static Scanner teclado = new Scanner (System.in);

    public static int[]swap (int[] vetor, int i,int  j){
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;

        return vetor;
    }

    public static int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int p = i;
            
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[p]) {
                    p = j;
                }
            }
            
            if (p != i) {
                swap(vetor, i, p);
            }
        }
 
        return vetor;
    }

   
    public static int determinarForçaMinima(int[] pontuacoes, int vagas){
        int[]ordenado = selectionSort(pontuacoes);
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
