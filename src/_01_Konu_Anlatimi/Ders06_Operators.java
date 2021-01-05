package _01_Konu_Anlatimi;

public class Ders06_Operators {

    public static void main(String[] args) {

        int a=10,b=20,c=30;
        System.out.println("sonuc1 : " + (a+b)); // int olarak topluyor çünkü parantez var. --> 30
        System.out.println("sonuc2 : " + a + b); // Strin gibi işlem yapıyor. çünkü parantez yok. --> 1020
        System.out.println("sonuc3 : " + a * b); //  --> 200
        System.out.println("sonuc4 : " + (float)((float)a / b)); // int ise normalde sonuç --> 0
                                                                 // değişken dönüştürüsem --> 0.5
        System.out.println("sonuc5 : " + (a - b)); // --> -10
        System.out.println("sonuc6 : " + (10>>2)); // 1010 0101 0010 -->2
        System.out.println("sonuc7 : " + (10<<2)); // -->40
        System.out.println("sonuc8 : " + (10>>>2)); // -->2
        System.out.println("sonuc9 : " + (a < b)); // true
        System.out.println("sonuc9 : " + (a == b)); // false

    }
}
