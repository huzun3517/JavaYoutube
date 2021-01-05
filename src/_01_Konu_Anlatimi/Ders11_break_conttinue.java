package _01_Konu_Anlatimi;

public class Ders11_break_conttinue {

    public static void main(String[] args) {

   /*   for (int i =0;i<10;i++){
            if (i==5){
                break; // Döngüyü kırar.
            }
            System.out.println(i);
        }

    */

        for (int i =0;i<10;i++){
            System.out.println("ilk");
            if (i==5){
                continue; // i=5 satırını atladı.
            }
            System.out.println(i);
        }
        System.out.println("her zaman");


    }
}
