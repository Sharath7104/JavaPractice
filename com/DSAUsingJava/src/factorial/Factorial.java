package factorial;

public class Factorial {

    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 7;

        System.out.println(factorial(n));
    }
}
