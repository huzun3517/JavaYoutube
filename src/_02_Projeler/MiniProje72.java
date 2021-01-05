package _02_Projeler;

import java.util.Scanner;

public class MiniProje72 {

    public static void main(String[] args) {

    /*  Kullanıcıdan bir metin isteyin ve kelime sayısını ekrana yazdırın.

     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        System.out.println(metin.length());


    }
}
