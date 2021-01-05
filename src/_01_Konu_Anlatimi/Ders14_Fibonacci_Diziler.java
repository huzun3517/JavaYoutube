package _01_Konu_Anlatimi;

public class Ders14_Fibonacci_Diziler {

    public static void main(String[] args) {

        int fib [] = new  int[10];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 0;i<8;i++) {

        //    fib[i] = fib[i-1] + fib [i-2]; 0 ve 1 önceden yazıldığı için i = i+2 ile baslamalı

              fib[i + 2] = fib[i+1] + fib [i];
        }

        for (int i =0;i<10;i++) {
            System.out.println(fib[i]);
        }

      /*  for (int i =2;i<10;i++) {                 -->2.YOL
            fib[i] = fib[i-1] + fib[i-2];
        }

       */


    }
}
