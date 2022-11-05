package practice05;

import java.util.Scanner;

public class Q02_NestedForUcgen {

    /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini giriniz");
        int satir = input.nextInt();
       /*   1.yol

       for (int i =1; i<=satir ; i++)
        {
            System.out.print(" ".repeat(satir-i));
            System.out.println("* ".repeat(i));
        }*/
        for(int i=0; i<satir; i++){
            for (int bosluk= satir-i ; bosluk> 1; bosluk--){
                System.out.print(" ");
            }

            for( int yildiz=0; yildiz<= i ; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
