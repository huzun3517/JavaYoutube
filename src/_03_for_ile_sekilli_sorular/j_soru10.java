package _03_for_ile_sekilli_sorular;

import java.util.Scanner;

public class j_soru10 {

    public static void main(String[] args) {

           /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Added by BilgisayarKavramlari
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

            for (int b=4-i; b>=0; b--){
                System.out.print(" ");
            }

            for (int j =1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
