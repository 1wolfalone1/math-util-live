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
    //add new code to git 9:14 9/4/2022
    public static long getFatorial1(long n){
        if (n ==0){
            return 1;
        }
        
        return n * getFatorial2(n-1);
    }
    public static long getFatorial2(long n){
        if (n ==0){
            return 1;
        }
        
        return n * getFatorial(n-1);
    }
    public static long getFatorial3(long n){
        if (n ==0){
            return 1;
        }
        
        return n * getFatorial(n-1);
    }
}