package _02_Projeler;

import java.util.Scanner;

public class MiniProje17 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Klavyeden 0 ile 100 arasında bir sayı okuyarak harf karşılığını bulunuz
        (A: 90 - 100, B: 80 -90, C:70-80 arası ve F: 70'in altı olarak kabul edebilirsiniz).

        Örnek Ekran Çıktıları
        Notunuzu Giriniz: 40
        Harf Notunuz: F

        Notunuzu Giriniz: 150
        Hatalı Giriş

        Notunuzu Giriniz: 90
        Harf Notunuz: A

        Notunuzu Giriniz: 85
        Harf Notunuz: B

        Notunuzu giriniz: 95
        Harf Notunuz : A     */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int not;
            System.out.print("Bir not giriniz: ");
            not = scanner.nextInt();

            if (not > 100 || not < 0) {
                System.out.println("Hatalı giriş yaptınız.");
                continue; }

                else if (not >= 90) {
                    System.out.println("Harf Notunuz: A");
                    break;

                } else if (not >= 80) {
                    System.out.println("Harf Notunuz: B");
                    break;

                } else if (not >= 70) {
                    System.out.println("Harf Notunuz: C");
                    break;

                } else {
                System.out.println("Harf Notunuz: F");
                break;

                }

            }
        }
    }

