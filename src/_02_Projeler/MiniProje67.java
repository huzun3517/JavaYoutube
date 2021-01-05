package _02_Projeler;

import java.util.Scanner;

public class MiniProje67 {

    public static void main(String[] args) {

    //  Celsius olarak verilen sıcaklık değerini Fahrenayt'a çeviren kodu yazınız.


        Scanner scanner = new Scanner(System.in);

        double C;
        double F;
        System.out.print("Hava sıcaklığı(Celsius): ");
        C = scanner.nextDouble();

        F = C+ 32;
        System.out.println("Hava sıcaklığı: " + F + " Fahrenheit");




    }
}
