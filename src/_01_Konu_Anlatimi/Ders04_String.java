package _01_Konu_Anlatimi;

public class Ders04_String {

    public static void main(String[] args) {

        String s = "benim ismim sadi evren seker";
        // Dizgi Katar

        double pi = 3.14;
        s = s.toUpperCase();
        System.out.println(" dizgi " + s + " pi : " + pi);

        int ilkBosluk = s.indexOf(" ");
        System.out.println(" dizgi " + s + " pi : " + pi + " ilk bosluk : " + ilkBosluk);

        String ilkKelime = s.substring(0,ilkBosluk); // ilk kelimeyi alacak
        System.out.println("ilk kelime = " + ilkKelime); //BENİM

        int sonBosluk = s.lastIndexOf(" ");
        String sonKelime = s.substring(sonBosluk); // son kelimeyi alacak
        System.out.println("son kelime = " + sonKelime); // seker

        System.out.println("10.karakter : " + s.charAt(10)); // 10.karakter







    }
}
