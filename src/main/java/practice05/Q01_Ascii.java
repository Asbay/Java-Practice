package practice05;

import java.util.Scanner;

public class Q01_Ascii {

    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Ilk karakter giriniz");
        char ch1 = input.next().charAt(0);

        System.out.println(" Ilk karakter giriniz");
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1,ch2);     //  char ilk = ch1<ch2 ? ch1 : ch2;
        int son = Math.max(ch1,ch2);     // son = ch1>ch2 ? ch1 : ch2;

        for(int i =ilk+1; i< son; i++) {

            System.out.print((char)i+" ");
        }


        /*for (char i = ch1; i < ch2; i++) {
            System.out.print(i);
        }*/
    }
}