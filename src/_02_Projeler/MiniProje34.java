package _02_Projeler;

import java.util.Scanner;

public class MiniProje34 {

    public static void main(String[] args) {

    /* Problemin Tanımı
       Sırasıyla muslukların havuzu kaç saatte doldurduğunu alarak
       aynı anda açıldıkları takdirde havuzun dolma süresini hesaplayan kodu yazınız.

       Örnek Ekran Çıktısı
        a musluğu kaç saatte doldurmaktadır:3
        b musluğu kaç saatte doldurmaktadır:8
        c musluğu kaç saatte doldurmaktadır:12
        3 musluk aynı anda açılırsa havuz kaç saatte dolar : 24/13
     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("a musluğu havuzu kaç saatte doldurmaktadır: ");
        double a = scanner.nextDouble();

        System.out.print("b musluğu havuzu kaç saatte doldurmaktadır: ");
        double b = scanner.nextDouble();

        System.out.print("c musluğu havuzu kaç saatte doldurmaktadır: ");
        double c = scanner.nextDouble();

        double toplam;

        toplam = (a * b * c) / ((b * c) + (a * c) + (a * b));


        System.out.println("3 musluk aynı anda açılırsa havuz kaç saatte dolar: " + toplam);
    }
}
