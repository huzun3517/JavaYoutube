package _02_Projeler;

import java.util.Scanner;

public class MiniProje70 {

    public static void main(String[] args) {

    /*  Fonksiyonel analiz kullanarak tek bir harf girilen ve
         telefonda karşılık gelen rakamı basan programı yazın.
         Telefondaki harfler ve rakamlar bu şekilde gruplandırılmıştır:
          2=ABC , 3=DEF, 4=GHI, 5=JKL, 6=MNO, 7=PRS, 8=TUV, 9=WXY

          Örnek Ekran Çıktısı
          Harfi girin: R
          R harfi telefonda 7 rakamına karşılık gelir
     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir harf giriniz: " );

        String harf = scanner.nextLine();

        if (harf.equals("A") || harf.equals("B") || harf.equals("C")) {
            System.out.println(harf + " harfi telefonda 2 rakamına karşılık gelir");
        }

        else if (harf.equals("D") || harf.equals("E") || harf.equals("F")) {
            System.out.println(harf + " harfi telefonda 3 rakamına karşılık gelir");

        }

        else if (harf.equals("G") || harf.equals("H") || harf.equals("I")) {
            System.out.println(harf + " harfi telefonda 4 rakamına karşılık gelir");

        }

        else if (harf.equals("J") || harf.equals("K") || harf.equals("L")) {
            System.out.println(harf + " harfi telefonda 5 rakamına karşılık gelir");

        }

        else if (harf.equals("M") || harf.equals("N") || harf.equals("O")) {
            System.out.println(harf + " harfi telefonda 6 rakamına karşılık gelir");

        }

        else if (harf.equals("P") || harf.equals("R") || harf.equals("S")) {
            System.out.println(harf + " harfi telefonda 7 rakamına karşılık gelir");

        }

        else if (harf.equals("T") || harf.equals("U") || harf.equals("V")) {
            System.out.println(harf + " harfi telefonda 8 rakamına karşılık gelir");

        }

        else if (harf.equals("W") || harf.equals("X") || harf.equals("Y")) {
            System.out.println(harf + " harfi telefonda 9 rakamına karşılık gelir");

        }
        else {
            System.out.println("Hatalı giriş yaptınız...");
        }


    }
}
