package _02_Projeler;

import java.util.Scanner;

public class MiniProje08 {
    public static void main(String[] args) {

     /* Problem Tanımı
        Kullanıcıdan iki tarih okuyarak bu tarihler arasında kaç gün geçtiğini
        hesaplayan kodu yazınız. Örnek olarak kendi doğum tarihinizi ve
        bugünün tarihini girerek kaç gündür yaşadığınızı hesaplayınız.

        ip ucu: her 4 yılda bir artık yıl vardır (şubat 29 gündür),
        100'ün katı yıllarda artık yıl yoktur ve 400'ün katı yıllarda artık yıl vardır.

        Örnek Ekran Çıktısı
        Bugünün tarihini giriniz: 1
        1
        2017
        ikinci tarihi giriniz: 1
        1
        1979
        iki tarih arasında 13894 gün vardır.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bugünün tarihi Gün Ay Yıl olarak giriniz...\n");
        System.out.print("Gün : ");
        int bugun_gun = scanner.nextInt();

        System.out.print("Ay : ");
        int bu_ay = scanner.nextInt();

        System.out.print("Yıl : ");
        int bu_yil = scanner.nextInt();

        int bu_artik_yil = bu_yil / 4;

        switch (bu_yil){

            case 1:bu_ay =31;
            case 3:bu_ay =31 * 2 + 30;
            case 5:bu_ay =31 * 3 + 30 * 2;
            case 7:bu_ay =31 * 4 + 30 * 3;
            case 8:bu_ay = 31 * 5 + 30 * 3;
            case 10:bu_ay = 31 * 6 + 30 * 4;
            case 12: bu_ay = 31 * 7 + 31 * 5;
                break;
            case 4:bu_ay = 31 * 2 + 30*2;
            case 6:bu_ay = 31 * 3 + 30 * 3;
            case 9:bu_ay = 31 * 5 + 30 * 4;
            case 11:bu_ay = 31 * 6 + 30 * 5;
                break;
            case 2:
                if (bu_yil % 4 == 0) {
                bu_ay = 31 + 29;
            }
                else {
                    bu_ay = 31 + 28;
                }

                break;
        }

        int bugunTopGun = bugun_gun + bu_ay + (bu_yil-1)*365 + bu_artik_yil;

        System.out.print("Doğum tarihinizi Gün Ay yıl olarak giriniz...\n");

        System.out.print("Gün : ");
        int dogum_gun = scanner.nextInt();

        System.out.print("Ay : ");
        int dogum_ay = scanner.nextInt();

        System.out.print("Yıl : ");
        int dogum_yil = scanner.nextInt();

        int dogum_artikyil = dogum_yil / 4;

        switch (dogum_yil){

            case 1:dogum_ay =31;
            case 3:dogum_ay =31 * 2 + 30;
            case 5:dogum_ay =31 * 3 + 30 * 2;
            case 7:dogum_ay =31 * 4 + 30 * 3;
            case 8:dogum_ay = 31 * 5 + 30 * 3;
            case 10:dogum_ay = 31 * 6 + 30 * 4;
            case 12: dogum_ay = 31 * 7 + 31 * 5;
                break;
            case 4:dogum_ay = 31 * 2 + 30*2;
            case 6:dogum_ay = 31 * 3 + 30 * 3;
            case 9:dogum_ay = 31 * 5 + 30 * 4;
            case 11:dogum_ay = 31 * 6 + 30 * 5;
                break;
            case 2:
                if (dogum_yil % 4 == 0) {
                    dogum_ay = 31 + 29;
                }
                else {
                    dogum_ay = 31 + 28;
                }
                break;
        }

        int dogumTopGun = dogum_gun + dogum_ay + (dogum_yil -1)*365 + dogum_artikyil;

        int yasam_gunu = bugunTopGun - dogumTopGun;

        System.out.println(yasam_gunu + " gündür yaşıyorsunuz.");

    }
}
