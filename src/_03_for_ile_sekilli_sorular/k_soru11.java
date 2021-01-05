
package _03_for_ile_sekilli_sorular;

public class k_soru11 {

    public static void main(String[] args) {

         /*  n=5 için Sayı Piramidi
                    1
                   123
                  12345
                 1234567
                123456789

         */

        int n = 5;

        for (int i=1; i<=n; i++){           // n tane satır yazdırılıyor

            // n-i kadar yanyana bosluk yazdırılıyor
            // satırlarda sırası ile  (n-ı) yani 4, 3, 2, 1 bosluk
            // burada k<10-i deseydık, n=5 olduğundan şekli 5 birim daha sağa kaydırmış oluruz.
            for (int k=0; k<n-i; k++) System.out.print(" ");

            // j satır sayısına bağlı olarak tek sayıda print yapıyor.
            for (int j=1; j<=2*i-1; j++) {
                System.out.print(j);        // sayilar yazdırılıyor
            }
            System.out.println();   // her satırdan sonra alt satıra geçiliyor

        }

    }

    }


