package _02_Projeler;

import java.util.Scanner;

public class MiniProje29 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Verilen bir sayının faktoriyelini döndüren fonkisyonu yazınız
        (iteratif, döngü ile)

        Örnek Ekran Çıktısı
        Bir sayi giriniz: 5
        Faktöriyeli: 120

        Bir sayi giriniz: 3
        Faktöriyeli: 6
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi;
        int faktoriyel = 1;
        sayi = scanner.nextInt();

        for (int i = 1; i <=sayi; i++) {


             faktoriyel = faktoriyel * i;


        }
        System.out.println("Sayının faktoriyeli= " + faktoriyel);


        }

}
