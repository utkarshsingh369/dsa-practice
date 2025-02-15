package recursion.IBH;

import java.util.Scanner;

public class Factorial {
    private static int factorial(int n){
        if(n==1){
            return 1;
        }
        return factorial(n-1)* n;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(factorial(n));
    }
}
