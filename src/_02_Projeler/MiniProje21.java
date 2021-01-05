package _02_Projeler;

import java.util.Scanner;

public class MiniProje21 {

    public static void main(String[] args) {

    /* Problem Tanımı
        Fibonacci serisinin ilk iki elemanı 1'dir ve diğer elemanları,
        kendisinden önce gelen son iki elemanın toplamıdır.
        Klavyeden bir sayı okuyarak,
        girilen sayı kadar fibonacci serisinin elemanını ekrana bastıran kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 10
        1 1 2 3 5 8 13 21 34 55

        Bir sayi giriniz: 5
        1 1 2 3 5
        a b c
          a b c
          */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        int a = 1;
        int b = 1;
        int c;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);

        for (int i = 2; i < sayi; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" ");
            System.out.print(c);
        }

    }
}
