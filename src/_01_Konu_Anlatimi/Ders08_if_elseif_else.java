package _01_Konu_Anlatimi;

public class Ders08_if_elseif_else {

    public static void main(String[] args) {

    /*    int i = 10;
        if (i == 10) {
            System.out.println("i'nin degeri 10'dur.");
        }
        System.out.println("kontrolsuz"); // -->  i'nin degeri 10'dur.
                                                  kontrolsuz

     */

    /*  int i = 10;
        if (i != 10) {
            System.out.println("i'nin degeri 10'dur.");
        }
        System.out.println("kontrolsuz");   // --> kontrolsuz

     */

    /*  int i = 20;
        if (i == 10) {
            System.out.println("i'nin degeri 10'dur.");
        }
        System.out.println("kontrolsuz");   // --> kontrolsuz

     */

    /*    int i = 20;
        if (i == 10) {
            System.out.println("i'nin degeri 10'dur.");
        }

        else {
            System.out.println("i'nin degeri 10'dan farklıdır");
        }

        System.out.println("kontrolsuz");   // --> i'nin degeri 10'dan farklıdır
                                            //     kontrolsuz

     */

     /* int i = 10;
        if (i == 10) {
            System.out.println("i'nin degeri 10'dur.");
        }

        else if (i < 10){
            System.out.println("i'nin degeri 10'dan kucuktur");
        }

        else {
            System.out.println("i'nin degeri 10'dan farklıdır ve 10'dan kucuk degildir");
        }

        System.out.println("kontrolsuz");   // --> i'nin degeri 10'dur.
                                            //     kontrolsuz

      */

        int i = 15;
        if (i == 10) {
            System.out.println("i'nin degeri 10'dur.");
        }

        else if (i < 10){
            System.out.println("i'nin degeri 10'dan kucuktur");
        }

        else {
            System.out.println("i'nin degeri 10'dan farklıdır ve 10'dan kucuk degildir");
        }

        System.out.println("kontrolsuz");   // --> i'nin degeri 10'dan farklıdır ve 10'dan kucuk degildir
                                           //     kontrolsuz

    }
}
