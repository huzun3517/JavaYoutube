package _02_Projeler;

import java.util.Scanner;

public class MiniProje03 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Ekrandan bir sayı okuyup bu sayıyı ekrana geri basınız.

        Örnek Ekran Çıktısı
        Bir sayi giriniz: 10
        Girdiginiz sayi: 10 */


        Scanner oku = new Scanner(System.in);

        int sayi;
        System.out.print("Bir sayı giriniz: ");

        sayi = oku.nextInt();
        System.out.println("Girilen Sayı: " + sayi);


    }

}
