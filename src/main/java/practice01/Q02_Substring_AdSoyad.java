package practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String adSoyad = input.nextLine();
        //1.YOL
        String ad=adSoyad.split(" ")[0];
        String soyad=adSoyad.split(" ")[1];
        System.out.println(ad);
        System.out.println(soyad);




    }
}
