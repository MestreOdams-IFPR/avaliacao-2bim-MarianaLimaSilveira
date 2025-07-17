public class Tribonacci {

    public static int tribonacci(int n) {

        if (n == 1 || n == 2) {
            return 0;

        } else if (n == 3 || n == 4) {
            return 1;

        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }

    public static void main(String[] args) {

        System.out.println(tribonacci(10));
    }
}
