package _02_Projeler;

import java.util.Scanner;

public class MiniProje73 {

    public static void main(String[] args) {

    /*  Problemin Tanımı
        Bir veri dosyasından ikili sayıları okuyan ve
        bunları ondalık sayılara çeviren programı yazınız.

        Örnek Ekran Çıktısı
        Binary Number - Decimal Number
        1 - 1
        10 - 2
        11 - 3
        10000 - 16
        10101 - 21
     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci tarih: ");
        int tarih1 = scanner.nextInt();

        System.out.print("İkinci tarih: ");
        int tarih2 = scanner.nextInt();

        if (tarih1 > tarih2){
            int fark = tarih1 - tarih2;
            int gun_sayisi = fark * 365;
            System.out.println("İki tarih arasında: " + gun_sayisi + " gün vardır." );

        }
        else {
            int fark = tarih2 - tarih1;
            int gun_sayisi = fark * 365;
            System.out.println("İki tarih arasında: " + gun_sayisi + " gün vardır." );

        }

    }


}
