package _02_Projeler;

import java.util.Scanner;

public class MiniProje14 {
    public static void main(String[] args) {

    /*  Problem Tanımı
        Klavyeden üç sayı alarak mantık bağlaçlarını kullanan örnek bir kod yazınız.
        Örneğin okunan sayılar a, b ve c olsun.
        Sırasıyla, a'nın b ve c arasında olup olmadığını,
        a'nın b'ye eşit ve aynı zamanda c'den küçük olup olmadığını
        a'nın b'den veya c'den büyük olup olmadığını
        üç sayının birbirine eşit olup olmadığını
        kontrol edip ekrana basan kodu yazınız.

        Örnek Ekran Çıktısı
        Birinci Sayıyı(a) Giriniz: 5
        İkinci Sayıyı(b) Giriniz: 5
        Üçüncü Sayıyı(c) Giriniz: 7
        a, b ile c arasında bir sayı değildir
        a, b veya c'den daha büyük değildir
        a, b'ye eşit ve aynı zamanda c'den küçüktür
        üç sayı birbirine eşit değildir    */

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Bir sayı giriniz. a: ");
        a = scanner.nextInt();

        System.out.print("Bir sayı giriniz. b: ");
        b = scanner.nextInt();

        System.out.print("Bir sayı giriniz. c: ");
        c = scanner.nextInt();


        if (a > b && a < c)  {
                System.out.println("a sayısı, b ve c sayısının arasındadır.");
        }
            else {
                System.out.println("a sayısı, b ve c sayısının arasında değildir.");
        }


        if (a == b && a < c)  {
            System.out.println("a sayısı, b sayısına eşittir ve aynı zamanda c sayısından küçüktür.");
        }
            else {
            System.out.println("a sayısı, b sayısına eşit değil ve aynı zamanda c sayısından küçük değildir.");
        }

        if (a > b || a > c) {
            System.out.println("a sayısı, b sayısından veya c sayısından büyüktür.");
        }

        else {
            System.out.println("a sayısı b sayısından veya c sayısından büyük değildir.");
        }

        if (a == b && b == c){
            System.out.println("a,b ve c sayıları birbirine eşittir");
        }

        else {
            System.out.println("a,b ve c sayıları birbirine eşit değildir");
        }

            }
        }


