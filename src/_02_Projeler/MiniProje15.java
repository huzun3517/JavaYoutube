package _02_Projeler;

import java.util.Scanner;

public class MiniProje15 {

    public static void main(String[] args) {

    /*  Klavyeden 3 sayı okuyarak bu sayılardan en büyüğünü
        veya en küçüğünü ekrana yazan kodu yazınız.

        Örnek Ekran Çıktısı
        Birinci Sayıyı Giriniz: 5
        İkinci Sayıyı Giriniz: 7
        Üçüncü Sayıyı Giriniz: 6
        En Büyük Sayı 7, En Küçük Sayı 5
     */

        Scanner scanner = new Scanner(System.in);

        int sayi1, sayi2, sayi3;

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        sayi3 = scanner.nextInt();

        int max = Math.max(sayi3,Math.max(sayi1,sayi2));
        int min = Math.min(sayi3,Math.min(sayi1,sayi2));

        System.out.println("max = " + max);
        System.out.println("min = " + min);

       /* int max,min;

        max = sayi1;

        if (sayi2 > max)
            max = sayi2;

        if (sayi3 > max)
            max = sayi3;

       min = sayi1;

        if (sayi2 < min)
            min = sayi2;

        if (sayi3 < min)
            min = sayi3;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        */

    }
}
