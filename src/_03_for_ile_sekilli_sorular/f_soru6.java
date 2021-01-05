package _03_for_ile_sekilli_sorular;

public class f_soru6 {

    public static void main(String[] args) {

            /*
        TODO Write program that prints this using loops
         *****
          ****
           ***
            **
             *

         */

        /*
         ***** 0b 5y
         **** 1b 4y
         *** 2b 3y
         ** 3b 2y
         * 4b 1y

         */

        for (int i =1; i<=5; i++){

            for (int b= 0; b<i; b++){
                System.out.print(" ");
            }
            for (int j = 6-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
