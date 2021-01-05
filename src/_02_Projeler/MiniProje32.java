package _02_Projeler;

import java.util.Scanner;

public class MiniProje32 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan ismini okuyarak ekrana “Merhaba isim” yazan bir kod yazınız.

         Örnek Ekran Çıktısı
        Lütfen isminizi giriniz: Sadi
        Merhaba Sadi
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim);
    }
}
