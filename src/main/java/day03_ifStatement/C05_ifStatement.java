package day03_ifStatement;

import java.util.Scanner;

public class C05_ifStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bölme islemi icin 3 \n carpma islemi icin 4 giriniz");

        int islem = input.nextInt();;  // kullanicinin islem tercihi icin bir variable olusturduk

        System.out.println("Lutfen iki tamsayi giriniz : "); // Kullaniciya bildirimde bulundum
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
    }
}
