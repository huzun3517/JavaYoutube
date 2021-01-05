package _03_for_ile_sekilli_sorular;

public class i_soru9 {

    public static void main(String[] args) {


        /*
     TODO Write program that prints this using loops
          *
         * *
        * * *
       * * * *
      * * * * *

         */

        for (int i =1; i<=5; i++){
            for (int b =6-i; b>=0; b--){
                System.out.print(" ");
            }
            for (int j =1; j <=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }


}
