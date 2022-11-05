package day07_stringmanipulation;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    /**
     * Length()
     * length() method'u girilen String'in uzunlugunu verir
     * butun karakterlerin adedi (bosluklar da birer karakterdir)
     */
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz: \n isim :");
        String isim = input.next();
        System.out.println("Soyisim");
        String Soyisim = input.next();

        if(isim.length()> Soyisim.length()){
            System.out.println("isminiz soyisminizden uzun");
        }else if (isim.length() == Soyisim.length()){
            System.out.println("isminiz soyisminizle ayni uzunlukta");
        } else System.out.println("Soyisminiz isminizden uzun");



        // Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

        System.out.println("4 harfli bir kelime giriniz");
        String isim2 = input.nextLine();

        if (isim2.length() == 4) {
            char bir = isim2.charAt(0);
            char iki = isim2.charAt(1);
            char uc = isim2.charAt(2);
            char dort = isim2.charAt(3);

            System.out.println("tersten yazilmis hali : " + dort + uc + iki + bir);
        } else if (isim2.length() > 4) {
            System.out.println("girdiginiz kelime 4 karakterden fazla");
        } else if (isim2.length() < 4) {
            System.out.println("girdiginiz kelime 4 karakterden az");
        }













    }
}
