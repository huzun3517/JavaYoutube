package _02_Projeler;

public class MiniProje19 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */


        for (int i = 100; i > 0 ;i--){

            if (i % 13 == 0){
                System.out.println(i);
            }

        }
    }
}
