package _02_Projeler;

import java.util.Scanner;

public class MiniProje06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesi +b'nin karesi +3c

        Örnek Ekran Çıktısı
        a sayısını giriniz: 2
        b sayısını giriniz: 3
        c sayısını giriniz: 4
        sonuç : 25 */

        Scanner oku = new Scanner(System.in);

        System.out.print("a: ");
        double a = oku.nextDouble();

        System.out.print("b: ");
        double b = oku.nextDouble();

        System.out.print("c: ");
        double c= oku.nextDouble();

        double toplam = (a * a) + (b * b) + (3 * c);
        System.out.println("Sonuç: " + toplam);


    }
}
