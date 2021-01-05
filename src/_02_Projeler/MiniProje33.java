package _02_Projeler;

import java.util.Scanner;

public class MiniProje33 {

    public static void main(String[] args) {

    /* Problem Tanımı
       Öğrenci numaranızı okuyan ve size geri yazan bir program yazınız.

     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci numaranızı giriniz: ");

        String numara = scanner.nextLine();

        System.out.println("Numaranız: " + numara);


    }
}
