import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        long result = (new Scanner(System.in)).nextLong();
        System.out.println(getFatorial(result));
    }
    public static long getFatorial(long n){
        if (n ==0){
            return 1;
        }
        
        return n * getFatorial(n-1);
    }
}