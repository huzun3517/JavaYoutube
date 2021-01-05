package _02_Projeler;

import java.util.Scanner;

public class MiniProje25 {

    public static void main(String[] args) {

     /* Problem Tanımı
        okunan bir sayı kadar satır ve sütüna sahip bir dik üçgeni ekrana bastırınız.

        Örnek Ekran Çıktısı
        Bir sayi giriniz: 5
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
