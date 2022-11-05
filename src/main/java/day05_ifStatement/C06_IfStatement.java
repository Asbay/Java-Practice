package day05_ifStatement;

import java.util.Scanner;

public class C06_IfStatement {
    //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi = input.nextInt();

        if (sayi< 1000 || sayi> 9999){
            System.out.println("Lutfen 4 Basamakli bir sayi giriniz...");
        }else if(sayi %5 == 0){
            if(sayi %10 == 0 ){
                System.out.println("5 e bölünebilen cift sayi");
            }else{
                System.out.println("%e bölünebilen tek sayi");
            }
        }else {
            System.out.println("Tekrar deneyin");
        }*/
        String s1 = "Ali";

        String s2 = "ali";

        String s3 = "Ali";

        System.out.println(s1==s3);
    }
}
