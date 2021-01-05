package _01_Konu_Anlatimi;

public class Ders16_Fibonacci_Recursive {

    public static int fib(int n) {
        if (n==1) return 1;
        if (n==0) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        // 1 1 2 3 5 8 13
        for (int i = 0;i<10;i++)

        System.out.println(fib(i));


    }
}
