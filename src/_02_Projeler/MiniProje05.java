package _02_Projeler;

import java.util.Scanner;

public class MiniProje05 {

    public static void main(String[] args) {

     /* Problem Tanımı
        Ekrandan okunan iki tam sayı (int) için basit işlemler yaparak ekrana sonuçları basan kod yazınız.
        Bu işlemler toplama, çıkarma, çarpma, bölme ve kalan işlemleridir.

        Örnek Ekran Çıktısı
        Lutfen birinci sayiyi giriniz: 5
        Lutfen ikinci sayiyi giriniz: 10
        toplam: 15
        fark : -5
        carpim : 50
        bolum : 0.5
        kalan : 5 */

        Scanner oku = new Scanner(System.in);
        int sayi1;
        int sayi2;

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = oku.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = oku.nextInt();

        int toplama = sayi1 + sayi2;
        System.out.println("Sayıların Toplamı: " + toplama);

        int cikarma = sayi1 - sayi2;
        System.out.println("Sayıların Farkı: " + cikarma);

        int carpma = sayi1 * sayi2;
        System.out.println("Sayıların Çarpımı: " + carpma);

        double bolme = (double) sayi1 / sayi2;
        System.out.println("Sayıların Bölümü: " + bolme);

        double kalan = sayi1 % sayi2;
        System.out.println("Sayıların Bölümünden Kalan: " + kalan);

    }
}