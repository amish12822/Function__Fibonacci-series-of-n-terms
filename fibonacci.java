import java.util.Scanner;

/**
 * fibonacci
 */
public class fibonacci {

    public static void FibonacciSeries(int n){

        int a = 0;
        int b = 1;
        int c;

        for (int i=1; i<=n; i++){

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value = ");int n = sc.nextInt();

        FibonacciSeries(n);
    }
}