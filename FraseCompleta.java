import java.util.Scanner;

public class FraseCompleta {

    public static Scanner teclado = new Scanner (System.in);

    public static char[] obterAlfabeto(){
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        return alfabeto;
    }
   
    public static int contarAlfabeto(char[] frase){
        char[] alfabeto = obterAlfabeto();
        int count = 0;

        for(int i = 0;i < alfabeto.length;i++){

            for(int j = 0;j < frase.length;j++){

                if (frase [j] == alfabeto[i]) {
                    count ++;
                    break;
                }
            }
        }

        return count;
    }

    public static void imprimirResultado(int saida){
        if(saida == 3){
            System.out.println("frase mal elaborada");

        }else if(saida == 2){
            System.out.println("frase quase completa");

        }else if(saida == 1){
            System.out.println("frase completa");
        }else{
            System.out.println("algo deu errado");
        }
    }

    public static void validarFraseCompleta (String frase){
        int saida = 0;
        char[] fraseChar = frase.toCharArray();

        if(fraseChar.length < 26){
            saida = 3;
        }else{
            int count = contarAlfabeto(fraseChar);

            if(count < 13){
                saida = 3;
            }else if(count < 26){
                saida = 2;
            }else if(count > 26){
                saida = -1;
            }else {
                saida = 1;
            }
        }

        imprimirResultado(saida);

    }

    public static void main(String[] args) {

        int casos = teclado.nextInt();

        for(int i = 0;i < casos;i++){

            String entrada = teclado.next();

            validarFraseCompleta(entrada);
        }
        
    }
}
