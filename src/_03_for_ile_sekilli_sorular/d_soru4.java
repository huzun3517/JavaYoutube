package _03_for_ile_sekilli_sorular;

import java.util.Scanner;

public class d_soru4 {

    public static void main(String[] args) {

        /*TODO Problem Tanımı
        okunan bir sayı kadar satır ve sütüna sahip bir dik üçgeni ekrana bastırınız.
        Örnek Ekran Çıktısı

      TODO Bir sayi giriniz: 5
        *
        **
        ***
        ****

      */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i =1; i<sayi; i++){

            for (int j =1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
