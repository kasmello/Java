import java.util.Scanner;

public class recursions {
    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num-1);
        }

    }

    private static int fibonacci(int num) {
        if (num == 0) {
            return 0;

        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }

    private static int gcd(int A, int B) {
        if (B != 0) {
            return gcd (B, A%B);
        } else {
            return A;
        }
    }
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        int num = Integer.parseInt(userin.next()); //string to int
        System.out.println(factorial(num));
        System.out.println(fibonacci(num));
        System.out.println(gcd(200,150));
    }
    
}