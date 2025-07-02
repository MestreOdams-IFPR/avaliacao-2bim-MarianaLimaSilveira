public class Pell {
    
    public static int pell(int n){

        if(n == 1){
            return 0;

        }else if(n == 2){
            return 1;

        }else{
            return 2*pell(n-1) + pell(n-2);
        }
    }

    public static void main(String[] args) {

        System.out.println(pell(10));
    }
}
