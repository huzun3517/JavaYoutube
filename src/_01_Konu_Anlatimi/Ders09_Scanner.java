package _01_Konu_Anlatimi;

import java.util.Scanner;

public class Ders09_Scanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Lütfen notunuzu giriniz: ");
        int i = s.nextInt();

        if (i >= 90) {
            System.out.println("Notunuz: AA");
        }
        else if (i >= 80) {
            System.out.println("Notunuz: BB");
        }
        else if (i >= 70) {
            System.out.println("Notunuz: CC");
        }
        else {
            System.out.println("Notunuz: F");
        }


    }
}
