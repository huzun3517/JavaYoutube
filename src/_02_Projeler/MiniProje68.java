package _02_Projeler;

public class MiniProje68 {

    public static void main(String[] args) {

    /*  Çapı, çevresi ve yarıçapı 5,75 olan bir dairenin alanını hesaplayan
        programı yazınız.
     */


        double aylik_odeme = 581.200;
        double borc;
        borc = (aylik_odeme * 36);

        for (int i = 1; i < 37; i++){
            if (i == 1 || i == 2 || i == 3) {
                continue;
            }


            System.out.println(i + " .ay Kalan borç: " + (borc - (aylik_odeme * i)) );
        }


    }






}
