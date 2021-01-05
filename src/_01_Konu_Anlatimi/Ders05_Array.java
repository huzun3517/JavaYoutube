package _01_Konu_Anlatimi;

public class Ders05_Array {

    public static void main(String[] args) {

        int a [] = new int[5];

        a[3] = 8;  // 0,0,0,8,0
        System.out.println(a[3]); // integer
        System.out.println("" + a[3]); // String 3 çevrildi.

        System.out.println(a[3] + 5); // integer oldugu icin iceride toplama islemi yaptı. --> 13
        System.out.println("" + a[3] + 55);  // String oldugu icin iceride toplama yapmadı. --> 855

        int b[] = {1,3,5,8,2};

        String str[] = {"ali","baba","ve","kirk","haramiler"};
        System.out.println(str[2] + b[3] + str[4] );

    }
}
