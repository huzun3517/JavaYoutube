package _02_Projeler;

import java.util.Scanner;

public class MiniProje66 {

    /*  Klavyeden iki farklı sayı okutunuz. Okunan sayıların tek sayıları ekrana bastıran
    ve bu sayıların ortalamasını bulan kodu yazınız.
    (Klavyeden okuma fonksiyonları ile iki sayıyı iki farklı değişkene okutup
    ardından bu sayılar arasında dönen bir döngü yazılır .
    Burada döngü yazılırken dikkat edilecek bir husus sayıların
    hangisinin büyük olduğunun anlaşılmasıdır.
    Yani döngü şayet küçük sayıdan büyük sayıya doğru kurulmuşsa hangi sayının
    küçük olduğu algılanmalıdır. Son olarak döngü içerisinde o andaki sayının
    tek olup olmadığı, sayının 2’ye bölümünden kalanın 1 olup olmamasına göre hesaplanır. )
     */



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkincici sayı: ");
        int sayi2 = scanner.nextInt();


            if (sayi1 % 2 == 1 && sayi2 % 2 == 1){
                System.out.println("Tek sayılar: " + sayi1 + " , " + sayi2);
                double ort = (sayi1 + (double)sayi2) / 2;
                System.out.println("Sayıların ortalaması: " + ort);

            }

            else if (sayi1 % 2 == 1 && sayi2 % 2 != 1){
                System.out.println("Tek sayılar: " + sayi1);
                double ort = (sayi1 + (double)sayi2) / 2;
                System.out.println("Sayıların ortalaması: " + ort);

            }

            else if (sayi1 % 2 != 1 && sayi2 % 2 == 1){
                System.out.println("Tek sayılar: " + sayi2);
                double ort = (sayi1 + (double)sayi2) / 2;
                System.out.println("Sayıların ortalaması: " + ort);

            }

            else  {
                System.out.println("Sayılar çifttir...");
                double ort = (sayi1 + (double)sayi2) / 2;
                System.out.println("Sayıların ortalaması: " + ort);
            }

        }



    }



