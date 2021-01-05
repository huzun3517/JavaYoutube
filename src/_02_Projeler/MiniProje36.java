package _02_Projeler;

import java.util.Scanner;

public class MiniProje36 {

    public static void main(String[] args) {

  /*  Problemin Tanımı
      Kullanıcıdan çalışanın kaç saat mesaiye kaldığını soran ve
      buna göre aylık mesai ücretini hesaplayarak ekrana basan bir program yazınız.

      Örnek ekran çıktısı
    Saat sayısını giriniz: 50
    Mesai Ücreti: 200 tl
   */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesai saat sayısı: ");
        int mesai_saati = scanner.nextInt();
        int mesai_ucreti;

        if (mesai_saati > 0 && mesai_saati <= 10){

            mesai_ucreti = mesai_saati * 1;
            System.out.println("Aylık mesai ücretiniz: " + mesai_ucreti + " Euro");
        }

        else if (mesai_saati > 10 && mesai_saati <= 20) {

            mesai_ucreti = mesai_saati * 2;
            System.out.println("Aylık mesai ücretiniz: " + mesai_ucreti + " Euro");
        }

        else if (mesai_saati > 20 && mesai_saati <= 40) {

            mesai_ucreti = mesai_saati * 3;
            System.out.println("Aylık mesai ücretiniz: " + mesai_ucreti + " Euro");
        }

        else if (mesai_saati > 40 && mesai_saati <= 100) {

            mesai_ucreti = mesai_saati * 4;
            System.out.println("Aylık mesai ücretiniz: " + mesai_ucreti + " Euro");
        }

        else if (mesai_saati > 100) {

            mesai_ucreti = mesai_saati * 5;
            System.out.println("Aylık mesai ücretiniz: " + mesai_ucreti + " Euro");
        }

        else {
            System.out.println("Hatalı giriş yaptınız...");
        }

    }
}
