package _02_Projeler;

import java.util.Scanner;

public class MiniProje35 {

    public static void main(String[] args) {

    /*  Problemin Tanımı
        Klavyeden 3 sayı okuyunuz. Bu sayılar sırasıyla şimdiki saat,
        şimdiki dakika ve dakika olarak fark olacaktır.
        Bu sayılarla şimdiki saat ve dakika değerlerine girilen fark değerini ekleyerek
        istenilen saat ve dakika değerini bulunuz.

        Örnek Ekran Çıktısı
        saat = 23
        dakika = 30
        fark = 500
        sonuç =7.50
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Şimdiki Saat: ");
        int saat = scanner.nextInt();

        System.out.print("Şimdiki Dakika: ");
        int dakika = scanner.nextInt();

        System.out.print("Girdiğiniz dakikadan sonraki saat: ");
        int fark = scanner.nextInt();

        int sondakika = (fark + dakika) % 60;

        int sonsaat = saat + (fark + dakika) / 60;

        if (sonsaat > 23) {

            int yenisaat = sonsaat % 24;

            System.out.println("Yeni zaman: " + yenisaat + " : " + sondakika);

        }
        else {
            int yenisaat = sonsaat;
            System.out.println("Yeni zaman: " + yenisaat + " : " + sondakika);
        }



    }
}
