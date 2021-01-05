package _01_Konu_Anlatimi;

public class Ders07_Loops {

    public static void main(String[] args) {

        for (int i=0; i<10; i++) { //loop variable
            System.out.println("Mesaj" + i);  // i = 10 verseydik döngü hüç çalışmayacaktı.
        }

        System.out.println("-------------------------------------");

        int i =0;
        while (i<10){
            System.out.println("mesaj" + i); // i = 10 verseyidk döngü hiç çalışmayacaktı.
            i++;
        }

        i=0;
        do {
            System.out.println("ikinci mesaj" + i); // i = 10 verseydik çıktımız--> ikinci mesaj10
            i++;
        }while (i<10);




    }
}
