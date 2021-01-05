package _01_Konu_Anlatimi;

public class Ders12_Metot_ve_Fonksiyonlar {

    //f(x) = 5x + 10
    static int f(int x) {
        return 5 * x + 10;
    }

    static int g(int x,int y) {
        return y + 2 * x;
    }

    static int g2(int x,int y) {
        return f(y + 2 * x);
    }

    static void yaz() {
        System.out.println("merhaba dunya");
    }

    public static void main(String[] args) {

        System.out.println(f(10)); // 60

        System.out.println(g(5,3)); // 13

        yaz(); // merhaba dunya

        System.out.println(f(g(5,3))); // 75

        System.out.println(g2(5,3)); // 75




    }
}
